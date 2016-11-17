package com.mp.screenshot;

import java.awt.AWTException;
import java.awt.EventQueue;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Screen extends JFrame {

    private TakeScreen ts = new TakeScreen();

    public Screen() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupMode = new javax.swing.ButtonGroup();
        groupTimer = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        radioAuto = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        radioManual = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        radioMouse = new javax.swing.JRadioButton();
        buttonCapture = new javax.swing.JButton();
        txtX = new javax.swing.JTextField();
        txtY = new javax.swing.JTextField();
        txtH = new javax.swing.JTextField();
        txtW = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        radioTimerZero = new javax.swing.JRadioButton();
        radioTimerCinque = new javax.swing.JRadioButton();
        radioTimerDieci = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create screenshot");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setText("Auto mode (all screen)");

        groupMode.add(radioAuto);
        radioAuto.setSelected(true);
        radioAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAutoActionPerformed(evt);
            }
        });

        jLabel2.setText("Manual mode (choose size)");

        groupMode.add(radioManual);
        radioManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioManualActionPerformed(evt);
            }
        });

        jLabel3.setText("Manual mode (choose area with mouse)");

        groupMode.add(radioMouse);
        radioMouse.setText("Rectangle");
        radioMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMouseActionPerformed(evt);
            }
        });

        buttonCapture.setText("Capture");
        buttonCapture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCaptureActionPerformed(evt);
            }
        });

        txtX.setEditable(false);

        txtY.setEditable(false);

        txtH.setEditable(false);

        txtW.setEditable(false);

        jLabel5.setText("Timer");

        groupTimer.add(radioTimerZero);
        radioTimerZero.setSelected(true);
        radioTimerZero.setText("0");

        groupTimer.add(radioTimerCinque);
        radioTimerCinque.setText("5");

        groupTimer.add(radioTimerDieci);
        radioTimerDieci.setText("10");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(buttonCapture)
                            .add(layout.createSequentialGroup()
                                .add(jLabel1)
                                .add(172, 172, 172)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(radioManual)
                                    .add(radioAuto)
                                    .add(radioMouse, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(layout.createSequentialGroup()
                                .add(jLabel5)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(radioTimerCinque)
                                    .add(radioTimerZero)
                                    .add(radioTimerDieci)))
                            .add(jLabel3))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 132, Short.MAX_VALUE)
                        .add(txtX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtW, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtH, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(txtX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(txtY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(txtW, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(txtH, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel1)
                            .add(radioAuto))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(25, 25, 25)
                                .add(jLabel2)
                                .add(7, 7, 7))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(radioManual)))))
                .add(14, 14, 14)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(radioMouse))
                .add(31, 31, 31)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(radioTimerZero))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(radioTimerCinque)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(radioTimerDieci)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 40, Short.MAX_VALUE)
                .add(buttonCapture)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCaptureActionPerformed(ActionEvent evt) {//GEN-FIRST:event_buttonCaptureActionPerformed
        try {
            timerScatto();
            if (radioMouse.isSelected()) {
                this.setState(JFrame.ICONIFIED);
                ts.bufferScreen("jpeg");
                this.setState(JFrame.NORMAL);
            } else {
                if (radioManual.isSelected()) {
                    if (txtX.getText().length() == 0 || txtY.getText().length() == 0 || txtW.getText().length() == 0 || txtH.getText().length() == 0) {
                        JOptionPane.showMessageDialog(null, "Inserisci le misure");
                        return;
                    }
                }
                FileChooserCapture fc = new FileChooserCapture();
                fc.salva();
            }
        } catch (InterruptedException | IOException | AWTException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_buttonCaptureActionPerformed

    private void radioManualActionPerformed(ActionEvent evt) {//GEN-FIRST:event_radioManualActionPerformed
        if (radioManual.isSelected()) {
            txtX.setEditable(true);
            txtY.setEditable(true);
            txtW.setEditable(true);
            txtH.setEditable(true);
        }
    }//GEN-LAST:event_radioManualActionPerformed

    private void radioAutoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_radioAutoActionPerformed
        if (radioAuto.isSelected()) {
            txtX.setEditable(false);
            txtY.setEditable(false);
            txtW.setEditable(false);
            txtH.setEditable(false);
        }
    }//GEN-LAST:event_radioAutoActionPerformed

    private void radioMouseActionPerformed(ActionEvent evt) {//GEN-FIRST:event_radioMouseActionPerformed
        if (radioMouse.isSelected()) {
            txtX.setEditable(false);
            txtY.setEditable(false);
            txtW.setEditable(false);
            txtH.setEditable(false);
        }
    }//GEN-LAST:event_radioMouseActionPerformed

    private void formKeyPressed(KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_Q) {
//            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed

    private void formWindowOpened(WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowStateChanged(WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        this.requestFocus();
    }//GEN-LAST:event_formWindowStateChanged

    public void timerScatto() throws InterruptedException {
        boolean elapsed = false;
        if (radioTimerDieci.isSelected()) {
            while (!elapsed) {
                Thread.sleep(10000);
                elapsed = true;
            }
        } else if (radioTimerCinque.isSelected()) {
            while (!elapsed) {
                Thread.sleep(5000);
                elapsed = true;
            }
        } else {
            while (!elapsed) {
                Thread.sleep(0);
                elapsed = true;
            }
        }
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        EventQueue.invokeLater(() -> {
            new Screen().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCapture;
    private javax.swing.ButtonGroup groupMode;
    private javax.swing.ButtonGroup groupTimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private static javax.swing.JRadioButton radioAuto;
    private static javax.swing.JRadioButton radioManual;
    private static javax.swing.JRadioButton radioMouse;
    private javax.swing.JRadioButton radioTimerCinque;
    private javax.swing.JRadioButton radioTimerDieci;
    private javax.swing.JRadioButton radioTimerZero;
    private static javax.swing.JTextField txtH;
    private static javax.swing.JTextField txtW;
    private static javax.swing.JTextField txtX;
    private static javax.swing.JTextField txtY;
    // End of variables declaration//GEN-END:variables

    public static JRadioButton getRadioMouse() {
        return radioMouse;
    }

    public static JRadioButton getRadioManual() {
        return radioManual;
    }

    public static JTextField getTxtX() {
        return txtX;
    }

    public static JTextField getTxtY() {
        return txtY;
    }

    public static JTextField getTxtW() {
        return txtW;
    }

    public static JTextField getTxtH() {
        return txtH;
    }
}
