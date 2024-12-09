/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSys;
import Business.HotelEnterprise.HotelEnterprise;
import Business.Network.HotelNetwork;
import Business.Organization.HotelOrganization;
import Business.Organization.HouseKeepingOrganization;
import Business.UserAccount.UserAccount;
import UI.Cleaning.HouseKeeping.HouseKeepingWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Atharva
 */
public class HouseKeepingRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, HotelOrganization organization, HotelEnterprise enterprise, EcoSys business,HotelNetwork network) {
   return new HouseKeepingWorkAreaJPanel(userProcessContainer, account,(HouseKeepingOrganization)organization,enterprise, business,network);
    }
     @Override
    public String toString(){
        return RoleType.HouseKeeping.getValue();
    }
    
}
