/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Resident;

import Business.EcoSystem;
import UserInterface.Resident.RaiseEmergencyRequestJPanel;
import UserInterface.Resident.RequestHelpJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author eswar
 */
public class ResidentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ResidentJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    public ResidentJPanel() {
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

        btnGrievance = new javax.swing.JButton();
        btnEmergency = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();
        btnDonate = new javax.swing.JButton();

        btnGrievance.setText("Raise Grievance complaint");
        btnGrievance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrievanceActionPerformed(evt);
            }
        });

        btnEmergency.setText("Raise Emergency Request");
        btnEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergencyActionPerformed(evt);
            }
        });

        btnRequest.setText("Request for help");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        btnDonate.setText("Donate");
        btnDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEmergency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrievance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDonate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(346, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnGrievance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnDonate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateActionPerformed
        // TODO add your handling code here:
        DonateJPanel donateJPanel =new DonateJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("donateJPanel",donateJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDonateActionPerformed

    private void btnGrievanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrievanceActionPerformed
        // TODO add your handling code here:
        RaiseGrievanceRequestJPanel raiseGrievanceRequestJPanel =new RaiseGrievanceRequestJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("raiseGrievanceRequestJPanel",raiseGrievanceRequestJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnGrievanceActionPerformed

    private void btnEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergencyActionPerformed
        // TODO add your handling code here:
        RaiseEmergencyRequestJPanel raiseEmergencyRequestJPanel =new RaiseEmergencyRequestJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("raiseEmergencyRequestJPanel",raiseEmergencyRequestJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnEmergencyActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        RequestHelpJPanel requestHelpJPanel =new RequestHelpJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("requestHelpJPanel",requestHelpJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonate;
    private javax.swing.JButton btnEmergency;
    private javax.swing.JButton btnGrievance;
    private javax.swing.JButton btnRequest;
    // End of variables declaration//GEN-END:variables
}
