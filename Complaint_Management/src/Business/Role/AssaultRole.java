/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.HotelEnterprise.HotelEnterprise;
import Business.Network.HotelNetwork;
import Business.Organization.AssaultOrganization;
import Business.Organization.HotelOrganization;
import Business.Organization.HouseKeepingOrganization;
import Business.UserAccount.UserAccount;
import UI.Cleaning.HouseKeeping.HouseKeepingWorkAreaJPanel;
import UI.Security.Assault.AssaultWorkAreaJPanel;
import static java.time.Clock.system;
import javax.swing.JPanel;

/**
 *
 * @author Atharva
 */
public class AssaultRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, HotelOrganization organization, HotelEnterprise enterprise, EcoSystem business, HotelNetwork network) {
    if (organization instanceof AssaultOrganization) {
        return new AssaultWorkAreaJPanel(userProcessContainer, account, (AssaultOrganization) organization, enterprise, business, network);
    } else if (organization instanceof HouseKeepingOrganization) {
        return new HouseKeepingWorkAreaJPanel(userProcessContainer, account, (HouseKeepingOrganization) organization, enterprise, business, network);
    } else {
        throw new IllegalArgumentException("Unsupported organization type: " + organization.getClass().getName());
    }
    }
    
     @Override
    public String toString(){
        return RoleType.Assault.getValue();
    }
    
}
