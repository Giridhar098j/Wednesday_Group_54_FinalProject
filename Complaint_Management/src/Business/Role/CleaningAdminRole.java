/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.HotelEnterprise.HotelEnterprise;
import Business.Network.HotelNetwork;
import Business.Organization.HotelOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.Cleaning.Admin.CleaningAdminWorkAreaJPanel;

/**
 *
 * @author Atharva
 */
public class CleaningAdminRole extends Role{
    
       @Override

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, HotelOrganization organization, HotelEnterprise enterprise, EcoSystem business,HotelNetwork network) {
        return new CleaningAdminWorkAreaJPanel(userProcessContainer, enterprise,network);
        
    }


    
}
