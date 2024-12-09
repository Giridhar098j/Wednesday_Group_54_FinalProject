/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TheftRole;
import java.util.ArrayList;

/**
 *
 * @author pulakantidikshithreddy
 */
public class TheftOrganization extends HotelOrganization {

    public TheftOrganization()  {
        super(HotelOrganization.Type.Theft.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TheftRole());
        return roles;
    }
}
