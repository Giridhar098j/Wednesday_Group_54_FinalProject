/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSys;
import Business.HotelEnterprise.HotelEnterprise;
import Business.Network.HotelNetwork;
import Business.Organization.HotelOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.Security.Admin.SecurityAdminWorkAreaJPanel;

/**
 *
 * @author Atharva
 */
public class SecurityAdminRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, HotelOrganization organization, HotelEnterprise enterprise, EcoSys business,HotelNetwork network) {
        return new SecurityAdminWorkAreaJPanel(userProcessContainer, account,enterprise,business,network);
    }
    
}
