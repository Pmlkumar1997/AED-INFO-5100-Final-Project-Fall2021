/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NonGovernmentOrganizationManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mohithparvataneni
 */
public class NonGovernmentOrganization extends Organization {
    
    public NonGovernmentOrganization() {
        super(Organization.Type.NonGovernment.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NonGovernmentOrganizationManagerRole());
        return roles;
    }
    
}
