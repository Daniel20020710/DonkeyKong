/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import personajes.monkey;

/**
 *
 * @author Usuario
 */
public class hilo_monkey extends Thread {

    monkey donkeykong;
    int velocidad = 15;

    public hilo_monkey(monkey donkeykong) {
        this.donkeykong = donkeykong;

    }

    @Override
    public void run() {
        super.run();
        int i = 0;

        while (true) {

            i++;
            try {
                derecha(donkeykong.ob_label);
                izquierda(donkeykong.ob_label);
                sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(monkey.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void derecha(JLabel label) throws InterruptedException {
        int x = 100;
        while (x <= 350) {

            label.setLocation(x, label.getY());
            x++;
            sleep(velocidad);
        }
    }

    public void izquierda(JLabel label) throws InterruptedException {
        int x = 350;
        while (x >= 100) {

            label.setLocation(x, label.getY());
            x--;
            sleep(velocidad);
        }
    }

}
