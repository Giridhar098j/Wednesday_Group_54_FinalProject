/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.HotelAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author pulakantidikshithreddy
 */
public class AdminOrganization extends HotelOrganization{

    public AdminOrganization() {
        super(HotelOrganization.Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HotelAdminRole());
        return roles;
    }
     
}