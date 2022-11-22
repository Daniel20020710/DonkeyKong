/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class hilo_tiempo extends Thread{
 
    JLabel etiqueta;

    public hilo_tiempo(JLabel etiqueta) {

        this.etiqueta = etiqueta;
    }

    @Override
    public void run() {

        for (int h = 0; h < 12; h++) {

            for (int m = 0; m < 60; m++) {

                for (int s = 0; s < 60; s++) {
                    
                    String hora = h < 10 ? "0"+h :h +"";
                     String minuto = m < 10 ? "0"+m :m +"";
                      String segundo = s < 10 ? "0"+s :s +"";
                    
                      etiqueta.setText(hora+":"+minuto+":"+segundo);
                      try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }

                }

            }

        }

    }

}
