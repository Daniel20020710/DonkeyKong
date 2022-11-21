/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personajes;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class mario {

    public mario() {

    }

    public void mover(JLabel mario) {

        mario.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyChar()) {
                    case KeyEvent.VK_RIGHT -> mario.setLocation(mario.getX() + 3, mario.getY());
                    case KeyEvent.VK_LEFT -> mario.setLocation(mario.getX() + 3, mario.getY());
                    case KeyEvent.VK_UP -> mario.setLocation(mario.getX() + 3, mario.getY());
                    case KeyEvent.VK_DOWN -> mario.setLocation(mario.getX() + 3, mario.getY());
                    default -> throw new AssertionError();
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

    }

}
