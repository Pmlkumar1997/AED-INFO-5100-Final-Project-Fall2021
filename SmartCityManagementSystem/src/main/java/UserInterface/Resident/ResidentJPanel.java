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
 * @author Saketh
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
        btnRequestHelp = new javax.swing.JButton();
        btnCheckStatus = new javax.swing.JButton();
        btnMakeDonations = new javax.swing.JButton();

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

        btnRequestHelp.setText("Request for help");
        btnRequestHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestHelpActionPerformed(evt);
            }
        });

        btnCheckStatus.setText("Check Status");
        btnCheckStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckStatusActionPerformed(evt);
            }
        });

        btnMakeDonations.setText("Make Donations");
        btnMakeDonations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeDonationsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMakeDonations, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCheckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnEmergency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGrievance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRequestHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
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
                .addComponent(btnRequestHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnMakeDonations)
                .addGap(62, 62, 62)
                .addComponent(btnCheckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnRequestHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestHelpActionPerformed
        // TODO add your handling code here:
        RequestHelpJPanel requestHelpJPanel =new RequestHelpJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("requestHelpJPanel",requestHelpJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestHelpActionPerformed

    private void btnCheckStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckStatusActionPerformed

    private void btnMakeDonationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeDonationsActionPerformed
        // TODO add your handling code here:
        DonateJPanel donateJPanel =new DonateJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("donateJPanel",donateJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnMakeDonationsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckStatus;
    private javax.swing.JButton btnEmergency;
    private javax.swing.JButton btnGrievance;
    private javax.swing.JButton btnMakeDonations;
    private javax.swing.JButton btnRequestHelp;
    // End of variables declaration//GEN-END:variables
}
