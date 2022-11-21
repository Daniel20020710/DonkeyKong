/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import herramienta.herramienta;
import hilos.hilo_monkey;
import java.awt.event.KeyEvent;
import personajes.mario;
import personajes.monkey;

/**
 *
 * @author Usuario
 */
public class InterfaceGame extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceGame
     */mario mariobros;
    public InterfaceGame() {
        initComponents();
        this.setResizable(false); //Dimensiones fijas
        mariobros = new mario();
        jPanel1.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        viga2 = new javax.swing.JLabel();
        viga4 = new javax.swing.JLabel();
        viga5 = new javax.swing.JLabel();
        viga6 = new javax.swing.JLabel();
        viga3 = new javax.swing.JLabel();
        viga1 = new javax.swing.JLabel();
        mario = new javax.swing.JLabel();
        Escalera6 = new javax.swing.JLabel();
        Escalera1 = new javax.swing.JLabel();
        Escalera3 = new javax.swing.JLabel();
        Escalera2 = new javax.swing.JLabel();
        Escalera4 = new javax.swing.JLabel();
        monkey = new javax.swing.JLabel();
        Escalera5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comenzar = new javax.swing.JButton();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/escalera.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viga2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N
        jPanel1.add(viga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, -1, 26));

        viga4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N
        jPanel1.add(viga4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 300, -1, 26));

        viga5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N
        jPanel1.add(viga5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 390, 26));

        viga6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N
        jPanel1.add(viga6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 440, 26));

        viga3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N
        jPanel1.add(viga3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, 26));

        viga1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N
        jPanel1.add(viga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, -1, -1));

        mario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/agente.png"))); // NOI18N
        jPanel1.add(mario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 50, 50));

        Escalera6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/escalera.png"))); // NOI18N
        jPanel1.add(Escalera6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, 105));

        Escalera1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/escalera.png"))); // NOI18N
        jPanel1.add(Escalera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, -1, 105));

        Escalera3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/escalera.png"))); // NOI18N
        jPanel1.add(Escalera3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, 105));

        Escalera2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/escalera.png"))); // NOI18N
        jPanel1.add(Escalera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, 105));

        Escalera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/escalera.png"))); // NOI18N
        jPanel1.add(Escalera4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, 105));

        monkey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/monkey.png"))); // NOI18N
        jPanel1.add(monkey, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 100, 110));

        Escalera5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/escalera.png"))); // NOI18N
        jPanel1.add(Escalera5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, 105));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/barriles.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 100));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Puntos:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 127, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Vidas:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 127, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Tiempo:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 138, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Nivel: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        comenzar.setText("Comenzar");
        comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 120, 77));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void comenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarActionPerformed
        monkey donkeykong = new monkey(monkey);
        new hilo_monkey(donkeykong).start();

        

        mariobros.mover(mario);

    }//GEN-LAST:event_comenzarActionPerformed

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased
//               switch (evt.getKeyCode()) {
//                    case KeyEvent.VK_RIGHT -> mario.setLocation(mario.getX() + 3, mario.getY());
//                    case KeyEvent.VK_LEFT -> mario.setLocation(mario.getX() + 3, mario.getY());
//                    case KeyEvent.VK_UP -> mario.setLocation(mario.getX() + 3, mario.getY());
//                    case KeyEvent.VK_DOWN -> mario.setLocation(mario.getX() + 3, mario.getY());
//                    default -> throw new AssertionError();
//                }
    }//GEN-LAST:event_jPanel1KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Escalera1;
    private javax.swing.JLabel Escalera2;
    private javax.swing.JLabel Escalera3;
    private javax.swing.JLabel Escalera4;
    private javax.swing.JLabel Escalera5;
    private javax.swing.JLabel Escalera6;
    private javax.swing.JButton comenzar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel mario;
    private javax.swing.JLabel monkey;
    private javax.swing.JLabel viga1;
    private javax.swing.JLabel viga2;
    private javax.swing.JLabel viga3;
    private javax.swing.JLabel viga4;
    private javax.swing.JLabel viga5;
    private javax.swing.JLabel viga6;
    // End of variables declaration//GEN-END:variables
}
