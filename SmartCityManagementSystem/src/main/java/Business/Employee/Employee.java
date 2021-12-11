/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author mohithparvataneni
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;
    private int roleNumber;

    public Employee(String name, int roleNumber) {
        id = count;
        count++;
        this.name = name;
        this.roleNumber = roleNumber;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }
    
    public int getRoleNumber() {
        return roleNumber;
    }

    public void setRoleNumber(int rolenumber) {
        this.roleNumber = rolenumber;
    }

    @Override
    public String toString() {
        return name;
    }
    
    public String getRole() {
        
        int roleNumber = this.getRoleNumber();
        
        String role = "";
        switch (roleNumber) {
            case 2:
                role = "GarbageRemovalMan";
                break;
            case 3:
                role = "GarbageRemovalManager";
                break;
            case 4:
                role = "WaterSupplier";
                break;
            case 5:
                role = "WaterSupplyManager";
                break;
            case 6:
                role = "FireControlEmployee";
                break;
            case 7:
                role = "FireControlManager";
                break;
            case 8:
                role = "StreetLightingMaintenanceEmployee";
                break;
            case 9:
                role = "StreetLightingMaintenanceManager";
                break;
            case 10:
                role = "PoliceDepartmentHead";
                break;
            case 11:
                role = "PoliceMan";
                break;
            case 12:
                role = "HospitalManager";
                break;
            case 13:
                role = "Doctor";
                break;
            case 14:
                role = "NGOManager";
                break;
            case 15:
                role = "GovernmentOrganizationManager";
                break;
             
        }
        return role;
    }

    public String getOrg() {
        
        int roleNumber = this.getRoleNumber();
        
        String org = "";
        if (roleNumber == 2 || roleNumber == 3) {
            org = "Garbage Removal Organization";
        }
        if (roleNumber == 4 || roleNumber == 5) {
            org = "Water Supply Organization";
        }
        if (roleNumber == 6 || roleNumber == 7) {
            org = "Fire Control Organization";
        }
        if (roleNumber == 8 || roleNumber == 9) {
            org = "Street Lighting Maintenance Organization";
        }
        if (roleNumber == 10 || roleNumber == 11) {
            org = "Police Organization";
        }
        if (roleNumber == 12 || roleNumber == 13) {
            org = "Hospital Organization";
        }
        if (roleNumber == 14) {
            org = "NGO";
        }
         if (roleNumber == 15) {
            org = "Government Organization";
        }
        return org;
    }
    
}
