/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personajes;

import herramienta.herramienta;
import java.applet.AudioClip;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class mario {

    JLabel[] vigas;
    JLabel[] escaleras;
    JLabel mario;
    herramienta herramienta;
    String ruta = "/resources/mario-alreves.png";
    String ruta2 = "/resources/mario.png";
    int vida = 3;

    public mario(JLabel[] escaleras_, JLabel[] vigas_) {
        this.escaleras = escaleras_;
        this.vigas = vigas_;

    }

    public void mover(JTextField txtMove, JLabel mario) {
        this.mario = mario;
        txtMove.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP -> {
                        if (verificarEscalera()) {
                            mario.setLocation(mario.getX(), mario.getY() - 3);
//                            System.out.println("x: " + mario.getX() + " Y: " + mario.getY());
                        }
                    }
                    case KeyEvent.VK_DOWN -> {
                        if (verificarBajar()) {
                            mario.setLocation(mario.getX(), mario.getY() + 3);
                        }
                    }
                    case KeyEvent.VK_RIGHT -> {

                        mario.setLocation(mario.getX() + 10, mario.getY());
//                        System.out.println("x: " + mario.getX() + " Y: " + mario.getY());
                        mario.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta2)));

                    }
                    case KeyEvent.VK_LEFT -> {

                        mario.setLocation(mario.getX() - 10, mario.getY());
                        mario.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
//                        herramienta.musica("resources\\pacman-waka-waka.wav", 0);

//                        System.out.println("x: " + mario.getX() + " Y: " + mario.getY());
                    }

                    default ->
                        System.out.println(e.getKeyCode());
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }

    public JLabel GetVigaMario() {
        JLabel vigaTemp = vigas[0];
        for (JLabel viga : vigas) {
            if (mario.getY() < viga.getY()) {
                vigaTemp = viga;
            }
        }
        return vigaTemp;
    }

    public boolean verificarEscalera() {
        for (JLabel escalera1 : escaleras) {
            if (mario.getX() == escalera1.getX()
                    && mario.getY() < GetVigaMario().getY()
                    && mario.getY() + mario.getHeight() + 8 > escalera1.getY()) {
                return true;
            }
        }
        return false;

    }

    public boolean verificarBajar() {
        for (JLabel escalera1 : escaleras) {
            if (mario.getX() == escalera1.getX()
                    && mario.getY() < GetVigaMario().getY()
                    && mario.getY() + mario.getHeight() < escalera1.getY() + escalera1.getHeight()- 18 ) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarDerecha(JLabel mario) {
        return mario.getX() >= 120 && mario.getX() <= 625;
    }

    public void vidas(JLabel vidas, JLabel mario) {
        vidas.setText("Vidas:" + vida);
        if (mario.getX() <= 80) {
            System.out.println("Hola");
            vida -= 1;
            vidas.setText("Vidas:" + vida);

        }

    }

}
