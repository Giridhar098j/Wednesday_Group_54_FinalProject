/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSys;
import Business.HotelEnterprise.HotelEnterprise;
import Business.Network.HotelNetwork;
import Business.Organization.RestaurantsOrganization;
import Business.Organization.HotelOrganization;
import Business.UserAccount.UserAccount;
import UI.HotelManagement.FrontDesk.FrontDeskWorkAreaJPanel;
import javax.swing.JPanel;
import UI.Services.Restaurants.RestaurantsWorkAreaJPanel;


/**
 *
 * @author Atharva
 */
public class RestaurantsRole extends Role {
    
    @Override  //
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, HotelOrganization organization, HotelEnterprise enterprise, EcoSys business,HotelNetwork network) {
   return new RestaurantsWorkAreaJPanel(userProcessContainer, account,(RestaurantsOrganization) organization, enterprise,business,network);
    }
      @Override 
    public String toString(){
        return Role.RoleType.Restaurants.getValue();
    }
    
}
