package UserInterface.Resident;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.GrievanceManagement;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Complaint;

import Business.WorkQueue.WorkRequest;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Saketh
 */
public class RaiseGrievanceRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RaiseGrievanceJPanel
     */
    private JPanel userProcessContainer;
    private Network network;
    private UserAccount userAccount;
    public RaiseGrievanceRequestJPanel(JPanel userProcessContainer,UserAccount account, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.network = network;
        displayGrievanceType();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboGrievanceType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        comboPriority = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();
        txtRaiseGrievance = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Raise Grievance complaint");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Grievance Type");

        comboGrievanceType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None" }));
        comboGrievanceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGrievanceTypeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Priority");

        comboPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "High Priority", "Medium Priority", "Low Priority" }));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Comments");

        txtComments.setColumns(20);
        txtComments.setRows(5);
        jScrollPane1.setViewportView(txtComments);

        txtRaiseGrievance.setText("Raise Grievance complaint");
        txtRaiseGrievance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRaiseGrievanceActionPerformed(evt);
            }
        });

        btnBack.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboGrievanceType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboPriority, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(txtRaiseGrievance))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnBack)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboGrievanceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(txtRaiseGrievance)
                .addContainerGap(456, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboGrievanceTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGrievanceTypeActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_comboGrievanceTypeActionPerformed

    private void txtRaiseGrievanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRaiseGrievanceActionPerformed
         
        // TODO add your handling code here:
        
       String grievancetype = comboGrievanceType.getSelectedItem().toString();
       String priority = comboPriority.getSelectedItem().toString();
       String message = txtComments.getText();
        
       if (grievancetype.isEmpty()||priority.isEmpty()||message.isEmpty())
         {
             
            JOptionPane.showMessageDialog(this, "One or More fields are empty !!", "Empty Fields", 2);
            return;
            
         }

       Complaint complaint = new Complaint();
       complaint.setMessage(message);
       complaint.setSender(userAccount);
       complaint.setPriority(priority);
       complaint.setOrganizationType(grievancetype);
       complaint.setStatus("Complaint raised");
       

       userAccount.getWorkQueue().addWorkRequest(complaint);
       
       Organization organization = (Organization) comboGrievanceType.getSelectedItem();
        
       organization.getWorkQueue().addWorkRequest(complaint);
    
       JOptionPane.showMessageDialog(this, "Request placed successfully !!", "Request", 1);
        
        
    }//GEN-LAST:event_txtRaiseGrievanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox comboGrievanceType;
    private javax.swing.JComboBox<String> comboPriority;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtComments;
    private javax.swing.JButton txtRaiseGrievance;
    // End of variables declaration//GEN-END:variables

    private void displayGrievanceType() {
      
        for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise.getName().equals(GrievanceManagement)){
                for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
                comboGrievanceType.addItem(org);
            }
            
            
            
        }
    }
}
