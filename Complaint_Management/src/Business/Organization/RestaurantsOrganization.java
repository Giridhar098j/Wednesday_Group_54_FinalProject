/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.RestaurantsRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author pulakantidikshithreddy
 */
public class RestaurantsOrganization extends HotelOrganization{

    public RestaurantsOrganization() {
        super(HotelOrganization.Type.Restaurants.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RestaurantsRole());
        return roles;
    }
     
}
