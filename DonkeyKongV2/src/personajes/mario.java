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

    JLabel escalera, escalera2, escalera3, escalera4, escalera5, escalera6;
    herramienta herramienta;
    String ruta = "C:\\Users\\Usuario\\Downloads\\DonkeyKong-main\\DonkeyKong-main\\DonkeyKongV2\\src\\resources\\mario-alreves.png";
    String ruta2 = "C:\\Users\\Usuario\\Downloads\\DonkeyKong-main\\DonkeyKong-main\\DonkeyKongV2\\src\\resources\\mario.png";
    int vida = 3;

    public mario(JLabel escalera, JLabel escalera2, JLabel escalera3, JLabel escalera4, JLabel escalera5, JLabel escalera6) {
        this.escalera = escalera;
        this.escalera2 = escalera2;
        this.escalera3 = escalera3;
        this.escalera4 = escalera4;
        this.escalera5 = escalera5;
        this.escalera6 = escalera6;
    }

    public void mover(JTextField txtMove, JLabel mario) {

        txtMove.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP -> {
                        if (verificarEscalera(escalera, escalera2, escalera3, escalera4, escalera5, escalera6, mario)) {
                            mario.setLocation(mario.getX(), mario.getY() - 3);
                            System.out.println("x: " + mario.getX() + " Y: " + mario.getY());
                        }
                    }
                    case KeyEvent.VK_DOWN -> {

                        if (verificarBajar(escalera, escalera2, escalera3, escalera4, escalera5, escalera6, mario)) {
                            mario.setLocation(mario.getX(), mario.getY() + 3);

                            System.out.println("x: " + mario.getX() + " Y: " + mario.getY());
                        }
                    }
                    default ->
                        System.out.println(e.getKeyCode());
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_RIGHT -> {

                  
                            mario.setLocation(mario.getX() + 10, mario.getY());
                            System.out.println("x: " + mario.getX() + " Y: " + mario.getY());
                            mario.setIcon(new ImageIcon(ruta2));
                            herramienta.musica("C:\\Users\\Usuario\\Downloads\\DonkeyKong-main\\DonkeyKong-main\\DonkeyKongV2\\src\\resources\\pacman-waka-waka.wav", 0);

                        
                    }
                    case KeyEvent.VK_LEFT -> {

                     
                            mario.setLocation(mario.getX() - 10, mario.getY());
                            mario.setIcon(new ImageIcon(ruta));
                            herramienta.musica("C:\\Users\\Usuario\\Downloads\\DonkeyKong-main\\DonkeyKong-main\\DonkeyKongV2\\src\\resources\\pacman-waka-waka.wav", 0);

                         
                            System.out.println("x: " + mario.getX() + " Y: " + mario.getY());
                        }
                    

                    default ->
                        System.out.println(e.getKeyCode());
                }

            }
        });

    }

    public boolean verificarEscalera(JLabel escalera, JLabel escalera2, JLabel escalera3, JLabel escalera4, JLabel escalera5, JLabel escalera6, JLabel mario) {
        return mario.getX() == escalera.getX() && mario.getY() > herramienta.viga2_y
                || mario.getX() == escalera2.getX() && mario.getY() > herramienta.viga2_y
                || mario.getX() == escalera3.getX() && mario.getY() > herramienta.viga3_y
                || mario.getX() == escalera4.getX() && mario.getY() > herramienta.viga4_y
                || mario.getX() == escalera5.getX() && mario.getY() > herramienta.viga5_y
                || mario.getX() == escalera6.getX() && mario.getY() > herramienta.viga6_y;
    }

    public boolean verificarBajar(JLabel escalera, JLabel escalera2, JLabel escalera3, JLabel escalera4, JLabel escalera5, JLabel escalera6, JLabel mario) {
        return mario.getX() == escalera.getX() && mario.getY() < herramienta.viga1_y
                || mario.getX() == escalera2.getX() && mario.getY() < herramienta.viga1_y
                || mario.getX() == escalera3.getX() && mario.getY() < herramienta.viga2_y
                || mario.getX() == escalera4.getX() && mario.getY() < herramienta.viga3_y
                || mario.getX() == escalera5.getX() && mario.getY() < herramienta.viga4_y
                || mario.getX() == escalera6.getX() && mario.getY() < herramienta.viga5_y;
    }

    public boolean verificarDerecha(JLabel mario) {
        return mario.getX() >= 120 && mario.getX() <= 625;
    }

    public void vidas(JLabel vidas, JLabel mario) {
        vidas.setText("Vidas:" + vida);
        if (mario.getX() <= 80) {
             System.out.println("Hola");
            vida-=1;
            vidas.setText("Vidas:" + vida);

        }

    }

}
