/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.Controle;
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dmodena
 */
public class Televisao extends javax.swing.JFrame {
    Controle controle;
    
    /**
     * Creates new form Televisao
     */
    public Televisao() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnControle = new javax.swing.JPanel();
        btnPower = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        tfCanal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfVolume = new javax.swing.JTextField();
        pnTv = new javax.swing.JPanel();
        pnTela = new javax.swing.JPanel();
        lblCanal = new javax.swing.JLabel();
        lblVolume = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnControle.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle"));

        btnPower.setText("Off");
        btnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerActionPerformed(evt);
            }
        });

        jLabel1.setText("Canal");

        jLabel2.setText("Volume");

        javax.swing.GroupLayout pnControleLayout = new javax.swing.GroupLayout(pnControle);
        pnControle.setLayout(pnControleLayout);
        pnControleLayout.setHorizontalGroup(
            pnControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnControleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPower)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(tfCanal, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(tfVolume))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnControleLayout.setVerticalGroup(
            pnControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnControleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPower)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnTv.setBorder(javax.swing.BorderFactory.createTitledBorder("TV"));

        pnTela.setBackground(java.awt.Color.darkGray);
        pnTela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCanal.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCanal.setForeground(java.awt.Color.darkGray);
        lblCanal.setText("CH ");

        lblVolume.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblVolume.setForeground(java.awt.Color.darkGray);
        lblVolume.setText("vl ");

        javax.swing.GroupLayout pnTelaLayout = new javax.swing.GroupLayout(pnTela);
        pnTela.setLayout(pnTelaLayout);
        pnTelaLayout.setHorizontalGroup(
            pnTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCanal)
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTelaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVolume)
                .addContainerGap())
        );
        pnTelaLayout.setVerticalGroup(
            pnTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCanal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVolume)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnTvLayout = new javax.swing.GroupLayout(pnTv);
        pnTv.setLayout(pnTvLayout);
        pnTvLayout.setHorizontalGroup(
            pnTvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTvLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTvLayout.setVerticalGroup(
            pnTvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTvLayout.createSequentialGroup()
                .addComponent(pnTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnControle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(pnTv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnTv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerActionPerformed
        if(tfVolume.getText().isEmpty() && tfCanal.getText().isEmpty()) {
            controle = new Controle(btnPower.isSelected());
        }
        else if(tfVolume.getText().isEmpty()) {
            controle = new Controle(btnPower.isSelected(), Integer.parseInt(tfCanal.getText()));
        }
        else {
            controle = new Controle(btnPower.isSelected(), Integer.parseInt(tfCanal.getText()), Integer.parseInt(tfVolume.getText()));
        }
        
        if(btnPower.isSelected()) {
            btnPower.setText("On");
            pnTela.setBackground(Color.BLUE);
            lblCanal.setForeground(Color.WHITE);
            if(controle.getCanal() == 0) lblCanal.setText("AV");
            else lblCanal.setText("CH " + controle.getCanal());
            lblVolume.setForeground(Color.WHITE);
            if(controle.getVolume() == 0) lblVolume.setText("MUTE");            
            else lblVolume.setText("vl " + controle.getVolume());            
        }
        else {
            btnPower.setText("Off");
            pnTela.setBackground(Color.DARK_GRAY);            
            lblCanal.setForeground(Color.DARK_GRAY);
            lblVolume.setForeground(Color.DARK_GRAY);            
            tfCanal.setText("");
            tfVolume.setText("");
            controle.setLigado(false);
            controle.setCanal(0);
            controle.setVolume(0);            
        }
    }//GEN-LAST:event_btnPowerActionPerformed

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
            java.util.logging.Logger.getLogger(Televisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Televisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Televisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Televisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Televisao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnPower;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCanal;
    private javax.swing.JLabel lblVolume;
    private javax.swing.JPanel pnControle;
    private javax.swing.JPanel pnTela;
    private javax.swing.JPanel pnTv;
    private javax.swing.JTextField tfCanal;
    private javax.swing.JTextField tfVolume;
    // End of variables declaration//GEN-END:variables
}
