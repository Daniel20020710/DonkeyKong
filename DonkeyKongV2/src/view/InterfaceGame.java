/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import herramienta.herramienta;
import hilos.hilo_monkey;
import personajes.mario;
import personajes.monkey;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class InterfaceGame extends javax.swing.JFrame implements KeyListener {

    /**
     * Creates new form InterfaceGame
     */
    mario mariobros;
    herramienta herramienta;

    public InterfaceGame() {
        initComponents();
        this.setResizable(false);
        mariobros = new mario(PantallaJuego, new JLabel[]{Escalera1, Escalera2, Escalera3, Escalera4, Escalera5, Escalera6},
                new JLabel[]{viga1, viga2, viga3, viga4, viga5, viga6});
        PantallaJuego.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PantallaJuego = new javax.swing.JPanel();
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
        txtMove = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        vida = new javax.swing.JLabel();
        tiempo = new javax.swing.JLabel();
        comenzar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/escalera.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PantallaJuego.setBackground(new java.awt.Color(0, 0, 0));
        PantallaJuego.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PantallaJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viga2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N
        PantallaJuego.add(viga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, -1, 26));

        viga4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N
        PantallaJuego.add(viga4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 300, -1, 26));

        viga5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N
        PantallaJuego.add(viga5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 390, 26));

        viga6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N
        PantallaJuego.add(viga6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 440, 26));

        viga3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N
        PantallaJuego.add(viga3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, 26));

        viga1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viga.png"))); // NOI18N
        PantallaJuego.add(viga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, -1, -1));

        mario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/mario.png"))); // NOI18N
        PantallaJuego.add(mario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 50, 50));

        Escalera6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/escalera.png"))); // NOI18N
        PantallaJuego.add(Escalera6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, 105));

        Escalera1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/escalera.png"))); // NOI18N
        PantallaJuego.add(Escalera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, -1, 105));

        Escalera3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/escalera.png"))); // NOI18N
        PantallaJuego.add(Escalera3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, 105));

        Escalera2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/escalera.png"))); // NOI18N
        PantallaJuego.add(Escalera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, 105));

        Escalera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/escalera.png"))); // NOI18N
        PantallaJuego.add(Escalera4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, 105));

        monkey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/monkey.png"))); // NOI18N
        PantallaJuego.add(monkey, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 100, 110));

        Escalera5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/escalera.png"))); // NOI18N
        PantallaJuego.add(Escalera5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, 105));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/barriles.png"))); // NOI18N
        PantallaJuego.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 100));

        txtMove.setBackground(new java.awt.Color(0, 0, 0));
        txtMove.setBorder(null);
        PantallaJuego.add(txtMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 140, 40));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Puntos:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 127, -1));

        vida.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        vida.setForeground(new java.awt.Color(255, 255, 0));
        vida.setText("Vidas:");
        jPanel2.add(vida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 180, -1));

        tiempo.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        tiempo.setForeground(new java.awt.Color(255, 255, 0));
        tiempo.setText("00:00:00");
        jPanel2.add(tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 160, -1));

        comenzar.setText("Comenzar");
        comenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comenzarMouseClicked(evt);
            }
        });
        jPanel2.add(comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 120, 77));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Tiempo");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 138, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PantallaJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PantallaJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    hilo_monkey monkey_hilo;

    private void comenzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comenzarMouseClicked

        mariobros.vidas(vida, mario);
        mariobros.mover(txtMove, mario);
        txtMove.requestFocus();

        try {
            monkey donkeykong = new monkey(monkey);
            monkey_hilo = new hilo_monkey(donkeykong);
            monkey_hilo.start();

        } catch (Exception e) {
        }

//        hTiempo = new hilo_tiempo(tiempo);
//        hTiempo.start();
        herramienta.musica("C:\\Users\\Usuario\\Downloads\\DonkeyKong-main\\DonkeyKong-main\\DonkeyKongV2\\src\\resources\\tema.wav", 10);
    }//GEN-LAST:event_comenzarMouseClicked

    public static void main(String args[]) {

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
    private javax.swing.JPanel PantallaJuego;
    private javax.swing.JButton comenzar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel mario;
    private javax.swing.JLabel monkey;
    public javax.swing.JLabel tiempo;
    private javax.swing.JTextField txtMove;
    private javax.swing.JLabel vida;
    private javax.swing.JLabel viga1;
    private javax.swing.JLabel viga2;
    private javax.swing.JLabel viga3;
    private javax.swing.JLabel viga4;
    private javax.swing.JLabel viga5;
    private javax.swing.JLabel viga6;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key readdy");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key readdy");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key readdy");
    }
}
