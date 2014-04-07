/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcurling.ihm;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jcurling.beans.Joueur;
import jcurling.ctrl.ItfCtrlIhm;

/**
 *
 * @author albuquerqud
 */
public class Ihm extends javax.swing.JFrame implements ItfIhmCtrl {

    private boolean sliderMoving;
    private Thread thdSlider;
    private ItfCtrlIhm refCtrl;

    public Ihm() {
        initComponents();
        this.setVisible(false);
        this.setSize(400, 400);
        frameMenu.setVisible(true);
        frameMenu.setSize(400, 400);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameMenu = new javax.swing.JFrame();
        lblJ1 = new javax.swing.JLabel();
        txtNomJoueur1 = new javax.swing.JTextField();
        lblCOMJ1 = new javax.swing.JLabel();
        lblJ2 = new javax.swing.JLabel();
        txtNomJoueur2 = new javax.swing.JTextField();
        lblCOMJ2 = new javax.swing.JLabel();
        spnCOMJ1 = new javax.swing.JSpinner();
        spnCOMJ2 = new javax.swing.JSpinner();
        lblNbrLancer = new javax.swing.JLabel();
        spnNbrLancer = new javax.swing.JSpinner();
        btnJouer = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        btnClassement = new javax.swing.JButton();
        framePartie = new javax.swing.JFrame();
        sldAngle = new javax.swing.JSlider();
        btnA = new javax.swing.JButton();
        sgmChrono = new org.emf.fri.beans.segments.HeightSegmentsBean();
        lblChrono = new javax.swing.JLabel();
        scpScore = new javax.swing.JScrollPane();
        tblScore1 = new javax.swing.JTable();
        lblVitesse = new javax.swing.JLabel();
        lblAngle = new javax.swing.JLabel();
        lblVitesseInt = new javax.swing.JLabel();
        lblAngleInt = new javax.swing.JLabel();
        btnB = new javax.swing.JButton();
        lblLanceRobot = new javax.swing.JLabel();
        frameClassement = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        frameMenu.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frameMenu.setPreferredSize(new java.awt.Dimension(400, 400));

        lblJ1.setText("Joueur 1:");

        txtNomJoueur1.setText("albu");
        txtNomJoueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomJoueur1ActionPerformed(evt);
            }
        });

        lblCOMJ1.setText("COM");

        lblJ2.setText("Joueur 2:");

        txtNomJoueur2.setText("maurice");

        lblCOMJ2.setText("COM");

        spnCOMJ1.setToolTipText("");
        spnCOMJ1.setValue(14);

        spnCOMJ2.setValue(13);

        lblNbrLancer.setText("Nombre de lancer:");

        btnJouer.setText("JOUER");
        btnJouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJouerActionPerformed(evt);
            }
        });

        lblMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMenu.setText("MENU");

        btnClassement.setText("Classement");
        btnClassement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameMenuLayout = new javax.swing.GroupLayout(frameMenu.getContentPane());
        frameMenu.getContentPane().setLayout(frameMenuLayout);
        frameMenuLayout.setHorizontalGroup(
            frameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameMenuLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(frameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameMenuLayout.createSequentialGroup()
                        .addComponent(lblNbrLancer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnNbrLancer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameMenuLayout.createSequentialGroup()
                        .addGroup(frameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(frameMenuLayout.createSequentialGroup()
                                .addComponent(lblJ1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frameMenuLayout.createSequentialGroup()
                                .addComponent(lblJ2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(frameMenuLayout.createSequentialGroup()
                                .addComponent(lblCOMJ2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnCOMJ2))
                            .addGroup(frameMenuLayout.createSequentialGroup()
                                .addComponent(lblCOMJ1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnCOMJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(95, 95, 95))
            .addGroup(frameMenuLayout.createSequentialGroup()
                .addGroup(frameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameMenuLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnJouer, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameMenuLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnClassement))
                    .addGroup(frameMenuLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(lblMenu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameMenuLayout.setVerticalGroup(
            frameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameMenuLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(frameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJ1)
                    .addComponent(txtNomJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCOMJ1)
                    .addComponent(spnCOMJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJ2)
                    .addComponent(txtNomJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCOMJ2)
                    .addComponent(spnCOMJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNbrLancer)
                    .addComponent(spnNbrLancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnJouer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnClassement)
                .addContainerGap())
        );

        sldAngle.setMajorTickSpacing(-5);
        sldAngle.setMaximum(20);
        sldAngle.setMinimum(-20);
        sldAngle.setMinorTickSpacing(-5);
        sldAngle.setPaintLabels(true);
        sldAngle.setPaintTicks(true);
        sldAngle.setSnapToTicks(true);
        sldAngle.setValue(0);

        btnA.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnA.setText("A");

        sgmChrono.setDigitsDimension(org.emf.fri.beans.segments.HeightSegmentsBean.DigitsDimensions.DIGITS_DIMENSION_LARGE);
        sgmChrono.setTotalDigitsBeforePoint(2);

        javax.swing.GroupLayout sgmChronoLayout = new javax.swing.GroupLayout(sgmChrono);
        sgmChrono.setLayout(sgmChronoLayout);
        sgmChronoLayout.setHorizontalGroup(
            sgmChronoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );
        sgmChronoLayout.setVerticalGroup(
            sgmChronoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        lblChrono.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        lblChrono.setText("CHRONO");

        tblScore1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Joueur 1", "Joueur 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scpScore.setViewportView(tblScore1);

        lblVitesse.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblVitesse.setText("Vitesse:");

        lblAngle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAngle.setText("Angle:");

        lblVitesseInt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblVitesseInt.setText("00");

        lblAngleInt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAngleInt.setText("00");

        btnB.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnB.setText("B");
        btnB.setEnabled(false);

        lblLanceRobot.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLanceRobot.setText("Lancer le robot:");

        javax.swing.GroupLayout framePartieLayout = new javax.swing.GroupLayout(framePartie.getContentPane());
        framePartie.getContentPane().setLayout(framePartieLayout);
        framePartieLayout.setHorizontalGroup(
            framePartieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePartieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sldAngle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(framePartieLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(framePartieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(framePartieLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(framePartieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblChrono)
                            .addGroup(framePartieLayout.createSequentialGroup()
                                .addComponent(sgmChrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addGroup(framePartieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblVitesse)
                                    .addComponent(lblAngle))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(framePartieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVitesseInt)
                                    .addComponent(lblAngleInt)))))
                    .addComponent(scpScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(framePartieLayout.createSequentialGroup()
                        .addComponent(lblLanceRobot)
                        .addGap(32, 32, 32)
                        .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 77, Short.MAX_VALUE))
            .addGroup(framePartieLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        framePartieLayout.setVerticalGroup(
            framePartieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, framePartieLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(scpScore, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(framePartieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLanceRobot)
                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(lblChrono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(framePartieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(framePartieLayout.createSequentialGroup()
                        .addGroup(framePartieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVitesse)
                            .addComponent(lblVitesseInt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(framePartieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAngle)
                            .addComponent(lblAngleInt)))
                    .addComponent(sgmChrono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(sldAngle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnA)
                .addContainerGap())
        );

        frameClassement.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Classement");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nom du joueur", "Score", "Meilleur lancer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout frameClassementLayout = new javax.swing.GroupLayout(frameClassement.getContentPane());
        frameClassement.getContentPane().setLayout(frameClassementLayout);
        frameClassementLayout.setHorizontalGroup(
            frameClassementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameClassementLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameClassementLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        frameClassementLayout.setVerticalGroup(
            frameClassementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameClassementLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 822, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btnJouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJouerActionPerformed
        String nomJ1 = txtNomJoueur1.getText();
        String nomJ2 = txtNomJoueur2.getText();
        int comJ1 = (Integer) spnCOMJ1.getValue();
        int comJ2 = (Integer) spnCOMJ2.getValue();
        int nbrLancer = (Integer) spnNbrLancer.getValue();
        if (nomJ1 != null && nomJ2 != null && comJ1 > 0 && comJ2 > 0 && nbrLancer > 0) {
           Joueur j1 = new Joueur(nomJ1, 1, ""+comJ1);
           Joueur j2 = new Joueur(nomJ2, 2, ""+comJ2);
           ArrayList<Joueur> joueurs = new ArrayList();
           joueurs.add(j1);
           joueurs.add(j2);
           refCtrl.commencePartie(joueurs, nbrLancer);
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez remplir correctement les champs !", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnJouerActionPerformed

    private void btnClassementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassementActionPerformed
       frameMenu.setVisible(false);
       frameClassement.setVisible(true);
    }//GEN-LAST:event_btnClassementActionPerformed

    private void txtNomJoueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomJoueur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomJoueur1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnClassement;
    private javax.swing.JButton btnJouer;
    private javax.swing.JFrame frameClassement;
    private javax.swing.JFrame frameMenu;
    private javax.swing.JFrame framePartie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAngle;
    private javax.swing.JLabel lblAngleInt;
    private javax.swing.JLabel lblCOMJ1;
    private javax.swing.JLabel lblCOMJ2;
    private javax.swing.JLabel lblChrono;
    private javax.swing.JLabel lblJ1;
    private javax.swing.JLabel lblJ2;
    private javax.swing.JLabel lblLanceRobot;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNbrLancer;
    private javax.swing.JLabel lblVitesse;
    private javax.swing.JLabel lblVitesseInt;
    private javax.swing.JScrollPane scpScore;
    private org.emf.fri.beans.segments.HeightSegmentsBean sgmChrono;
    private javax.swing.JSlider sldAngle;
    private javax.swing.JSpinner spnCOMJ1;
    private javax.swing.JSpinner spnCOMJ2;
    private javax.swing.JSpinner spnNbrLancer;
    private javax.swing.JTable tblScore1;
    private javax.swing.JTextField txtNomJoueur1;
    private javax.swing.JTextField txtNomJoueur2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void lancerSlider() {
        sliderMoving = true;

        Runnable r = new Runnable() {
            private boolean positif;
            private int newValue;

            @Override
            public void run() {
                while (sliderMoving) {
                    if (positif) {
                        if (newValue < 20) {
                            newValue++;
                            sldAngle.setValue(newValue);
                        } else {
                            positif = false;
                            sldAngle.setValue(newValue);
                        }
                    } else {
                        if (newValue > -20) {
                            newValue--;
                            sldAngle.setValue(newValue);
                        } else {
                            positif = true;
                            sldAngle.setValue(newValue);
                        }
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Ihm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        thdSlider = new Thread(r);
        thdSlider.start();
    }

    @Override
    public void stopSlider() {
        sliderMoving = false;
        try {
            thdSlider.join();
            System.gc();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ihm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ItfCtrlIhm getRefCtrl() {
        return refCtrl;
    }

    public void setRefCtrl(ItfCtrlIhm refCtrl) {
        this.refCtrl = refCtrl;
    }

}