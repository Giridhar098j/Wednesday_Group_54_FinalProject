/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.HotelManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author pulakantidikshithreddy
 */
public class HotelManagerOrganization extends HotelOrganization{

    public HotelManagerOrganization() {
        super(HotelOrganization.Type.HotelManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HotelManagerRole());
        return roles;
    }
     
   
    
    
}
