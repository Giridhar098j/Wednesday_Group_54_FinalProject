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
import UI.SysAdminWorkArea.SysAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Atharva
 */
public class SysAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, HotelOrganization organization, HotelEnterprise enterprise, EcoSys system,HotelNetwork network) {
        return new SysAdminWorkAreaJPanel(userProcessContainer, system,network);
    }
    
}
