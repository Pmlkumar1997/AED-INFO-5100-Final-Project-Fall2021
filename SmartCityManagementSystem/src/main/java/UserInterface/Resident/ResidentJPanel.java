/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Resident;

import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
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
    private UserAccount userAccount;
    private Network network;
    
    public ResidentJPanel( JPanel userProcessContainer, UserAccount userAccount, Network network) {
        initComponents();
        this.userAccount = userAccount;
        this.network = network;
        this.userProcessContainer = userProcessContainer;
        lblResident.setText("Welcome, "+userAccount.getResident().getName()+" !!");
        
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
        lblResident = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        btnGrievance.setBackground(new java.awt.Color(204, 255, 255));
        btnGrievance.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnGrievance.setIcon(new javax.swing.ImageIcon("/Users/mohithparvataneni/Downloads/icons8-service-48.png")); // NOI18N
        btnGrievance.setText("Raise Grievance complaint");
        btnGrievance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGrievance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrievanceActionPerformed(evt);
            }
        });

        btnEmergency.setBackground(new java.awt.Color(204, 255, 255));
        btnEmergency.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnEmergency.setIcon(new javax.swing.ImageIcon("/Users/mohithparvataneni/Downloads/icons8-siren-48.png")); // NOI18N
        btnEmergency.setText("Raise Emergency Request");
        btnEmergency.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergencyActionPerformed(evt);
            }
        });

        btnRequestHelp.setBackground(new java.awt.Color(204, 255, 255));
        btnRequestHelp.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnRequestHelp.setIcon(new javax.swing.ImageIcon("/Users/mohithparvataneni/Downloads/icons8-get-cash-48.png")); // NOI18N
        btnRequestHelp.setText("   Request for help");
        btnRequestHelp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRequestHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestHelpActionPerformed(evt);
            }
        });

        btnCheckStatus.setBackground(new java.awt.Color(204, 255, 255));
        btnCheckStatus.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCheckStatus.setIcon(new javax.swing.ImageIcon("/Users/mohithparvataneni/Downloads/icons8-true-false-48.png")); // NOI18N
        btnCheckStatus.setText("     Check Status");
        btnCheckStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCheckStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckStatusActionPerformed(evt);
            }
        });

        lblResident.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblResident.setForeground(new java.awt.Color(255, 51, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCheckStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRequestHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGrievance, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(btnEmergency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblResident, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblResident, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnGrievance, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnRequestHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnCheckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrievanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrievanceActionPerformed
        
        
        // TODO add your handling code here:
        RaiseGrievanceRequestJPanel raiseGrievanceRequestJPanel =new RaiseGrievanceRequestJPanel(userProcessContainer,userAccount, network);
        userProcessContainer.add("raiseGrievanceRequestJPanel",raiseGrievanceRequestJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnGrievanceActionPerformed

    private void btnEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergencyActionPerformed
        // TODO add your handling code here:
        
        System.out.println(network + "boom");
        RaiseEmergencyRequestJPanel raiseEmergencyRequestJPanel =new RaiseEmergencyRequestJPanel(userProcessContainer,userAccount, network);
        userProcessContainer.add("raiseEmergencyRequestJPanel",raiseEmergencyRequestJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnEmergencyActionPerformed

    private void btnRequestHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestHelpActionPerformed
        // TODO add your handling code here:
        System.out.println(network + "boom");
        RequestHelpJPanel requestHelpJPanel = new RequestHelpJPanel(userProcessContainer,userAccount, network);
        userProcessContainer.add("requestHelpJPanel",requestHelpJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestHelpActionPerformed

    private void btnCheckStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckStatusActionPerformed
        // TODO add your handling code here:
        ResidentCheckStatusJPanel residentCheckStatusJPanel = new ResidentCheckStatusJPanel(userProcessContainer,userAccount, network);
        userProcessContainer.add("residentCheckStatusJPanel",residentCheckStatusJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnCheckStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckStatus;
    private javax.swing.JButton btnEmergency;
    private javax.swing.JButton btnGrievance;
    private javax.swing.JButton btnRequestHelp;
    private javax.swing.JLabel lblResident;
    // End of variables declaration//GEN-END:variables
}
