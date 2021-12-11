/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EnterpriseAdmin;

import Business.Employee.Employee;
import Business.Enterprise.CovidHelpEnterprise;
import Business.Enterprise.EmergencyResponseEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GrievanceManagementEnterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.DoctorRole;
import Business.Role.FileControlEmployeeRole;
import Business.Role.FireControlManagerRole;
import Business.Role.GarbageRemovalManRole;
import Business.Role.GarbageRemovalManagerRole;
import Business.Role.GovernmentOrganizationManagerRole;
import Business.Role.HospitalManagerRole;
import Business.Role.NonGovernmentOrganizationManagerRole;
import Business.Role.PoliceDepartmentHeadRole;
import Business.Role.PoliceManRole;
import Business.Role.Role;
import Business.Role.StreetLightMaintenanceManagerRole;
import Business.Role.StreetLightingMaintenanceEmpRole;
import Business.Role.WaterSupplierRole;
import Business.Role.WaterSupplyManagerRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohithparvataneni
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeeJPanel
     */

    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private OrganizationDirectory organizationDirectory;
    DefaultTableModel model;
   
    
    public ManageEmployeeJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        //this.organizationDirectory = organizationDirectory;
        this.enterprise = enterprise;
        model = (DefaultTableModel) tableEmployee.getModel();
        populateOrganizationEmployeeComboBox();
        populateEmployeeRoleComboBox();
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
        orgEmpRoleComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        orgTypeComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmployee = new javax.swing.JTable();
        btnAddEmployee = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();

        jLabel1.setText("Employee Type");

        jLabel2.setText("Organization");

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        tableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization", "Employee Role", "Name", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(tableEmployee);

        btnAddEmployee.setText("Save");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setText("Employee Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orgTypeComboBox, 0, 144, Short.MAX_VALUE)
                            .addComponent(orgEmpRoleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(txtPassword)
                            .addComponent(txtEmpName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnAddEmployee)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnBack)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(orgTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orgEmpRoleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnAddEmployee)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
        
        Organization organization = (Organization) orgTypeComboBox.getSelectedItem();
        UserAccountDirectory useraccountdirectory = organization.getUserAccountDirectory();
        String name = txtEmpName.getText();

        String username = txtUser.getText();
        String password = String.valueOf(txtPassword.getPassword());

        String empRole = orgEmpRoleComboBox.getSelectedItem().toString();
        
        int n = 0;
        Role role = null;
        
        switch (empRole) {
            
            case "GarbageRemovalMan":
                
                n = 2;
                role = new GarbageRemovalManRole();
                break;
            
            case "GarbageRemovalOrganizationManager":
                
                n = 3;
                role = new GarbageRemovalManagerRole();
                break;
                
            case "WaterSuppplier":
                
                n = 4;
                role = new WaterSupplierRole();
                break;
                
            case "WaterSupplyOrganizationManager":
                
                n = 5;
                role = new WaterSupplyManagerRole();
                break;
                
            case "StreetLightingTechnician":
                
                n = 6;
                role = new StreetLightingMaintenanceEmpRole();
                break;
            
            case "StreetLightingOrganizationManager":
                
                n = 7;
                role = new StreetLightMaintenanceManagerRole();
                break;
                
            case "PoliceMan":
                
                n = 8;
                role = new PoliceManRole();
                break;
                
            case "PoliceDepartmentHead":
                
                n = 9;
                role = new PoliceDepartmentHeadRole();
                break;
                
            case "FireControlOrganizationEmployee":
                
                n = 10;
                role = new FileControlEmployeeRole();
                break;
                
            case "FireDepartmentHead":
                
                n = 11;
                role = new FireControlManagerRole();
                break;
                
            case "Doctor":
                
                n = 12;
                role = new DoctorRole();
                break;
                
            case "HospitalManager":
                
                n = 13;
                role = new HospitalManagerRole();
                break;
                
            case "NGOManager":
                
                n = 14;
                role = new NonGovernmentOrganizationManagerRole();
                break;
                
            case "GovernmentOrganizationManager":
                
                n = 15;
                role = new GovernmentOrganizationManagerRole();
                break;
                
        }
        System.out.println(role);
        for(Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            if(employee.getName().equals(name)){
                JOptionPane.showMessageDialog(null, "please input another name");
                return;
            }
        }
        
        Employee employee = organization.getEmployeeDirectory().createEmployee(name,n);
        System.out.println(employee);
        UserAccount userAccount = organization.getUserAccountDirectory().createUserAccount(username, password, employee, role);

//        for (Organization organization1 : this.enterprise.getOrganizationDirectory().getOrganizationList()) {
//            for (UserAccount userAccount1 : organization1.getUserAccountDirectory().getUserAccountList()) {
//                System.out.println(this.enterprise.getName() + organization.getName() + userAccount1.getUsername());
//            }
//        }
        populateTable();
        
        
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
    public void populateEmployeeRoleComboBox() {
        
        orgEmpRoleComboBox.removeAllItems();

        if (this.enterprise instanceof GrievanceManagementEnterprise) {
            orgEmpRoleComboBox.addItem("GarbageRemovalMan");
            orgEmpRoleComboBox.addItem("GarbageRemovalOrganizationManager");
            orgEmpRoleComboBox.addItem("WaterSupplier");
            orgEmpRoleComboBox.addItem("WaterSupplyOrganizationManager ");
            orgEmpRoleComboBox.addItem("StreetLightingTechnician");
            orgEmpRoleComboBox.addItem("StreetLightingOrganizationManager");
            orgEmpRoleComboBox.addItem("PoliceMan");
            orgEmpRoleComboBox.addItem("PoliceDepartmentHead");
        }
        if (this.enterprise instanceof EmergencyResponseEnterprise) {
            
            orgEmpRoleComboBox.addItem("Doctor");
            orgEmpRoleComboBox.addItem("HospitalManager");
            orgEmpRoleComboBox.addItem("FireControlOrganizationEmployee");
            orgEmpRoleComboBox.addItem("FireDepartmentHead");
            
        }
        if (this.enterprise instanceof CovidHelpEnterprise) {
            orgEmpRoleComboBox.addItem("NGOManager");
            orgEmpRoleComboBox.addItem("GovernmentOrganizationManager");
            
        }

    }

    public void populateOrganizationEmployeeComboBox() {
        
        orgTypeComboBox.removeAllItems();

        for (Organization organization : this.enterprise.getOrganizationDirectory().getOrganizationList()) {
            orgTypeComboBox.addItem(organization);
        }
    }
    
    private void populateTable() {
        

        model.setRowCount(0);
        for (Organization organization : this.enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount useraccount : organization.getUserAccountDirectory().getUserAccountList()) {
                Object[] objs = {useraccount.getEmployee().getOrg(), useraccount.getEmployee().getRole(),
                useraccount.getEmployee().getName(),useraccount.getUsername(),useraccount.getPassword()};
                        
                model.addRow(objs);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgEmpRoleComboBox;
    private javax.swing.JComboBox orgTypeComboBox;
    private javax.swing.JTable tableEmployee;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
