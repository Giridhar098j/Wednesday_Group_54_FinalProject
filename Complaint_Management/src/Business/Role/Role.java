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

/**
 *
 * @author Atharva
 */
public abstract class Role {
    
    public enum RoleType{
        Security("Security"),
        Assault("Assault"),
        Restaurants("Restaurants"),
        Maintainance("Maintainance"),
        HouseKeeping("HouseKeeping"),
        Theft("Theft"),
        HotelManager("HotelManager"),
        FrontDesk("FrontDesk"),
        HotelAdmin("HotelAdmin");
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            HotelOrganization organization, 
            HotelEnterprise enterprise, 
            EcoSys business,HotelNetwork network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
