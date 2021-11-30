/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.WaterSupplyMangerRole;
import java.util.ArrayList;

/**
 *
 * @author mohithparvataneni
 */
public class WaterSupplyOrganization extends Organization {
    
    public WaterSupplyOrganization() {
        super(Organization.Type.WaterSupply.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WaterSupplyMangerRole());
        return roles;
    }
    
}
