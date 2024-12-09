/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.FrontDeskRole;
import java.util.ArrayList;

/**
 *
 * @author pulakantidikshithreddy
 */
public class FrontDeskOrganization extends HotelOrganization
 {
     public FrontDeskOrganization() {
        super(HotelOrganization.Type.FrontDesk.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FrontDeskRole());
        return roles;
    }
}