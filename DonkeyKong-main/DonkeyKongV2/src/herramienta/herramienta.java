/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramienta;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Usuario
 */
public class herramienta {

    public static int viga1_y = 550;
    public static int viga2_y = 454;
    public static int viga3_y = 355;
    public static int viga4_y = 256;
    public static int viga5_y = 154;
    public static int viga6_y = 54;

    public herramienta() {
    }

    public static void musica(String nombre, int loop) {

        try {
            File musicPath = new File(nombre);

            if (musicPath.exists()) {

                AudioInputStream audio = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audio);
                clip.start();
                clip.loop(loop);

             
            } else {
                System.out.println("No se encontró el archivo");
            }

        } catch (Exception e) {
        }

    }
    
    
    
    
    
    

}
