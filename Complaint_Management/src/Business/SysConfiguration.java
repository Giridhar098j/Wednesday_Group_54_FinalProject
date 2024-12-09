/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.HotelEmployee.HotelEmployee;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Giridhar
 */
public class SysConfiguration {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
       
        
        
        HotelEmployee Hemployee = system.getEmployeeDirectory().createHotelEmployee("Giridhar");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("SystemAdmin", "SystemAdmin","divyasree79723@gmail.com" ,Hemployee, new SysAdminRole());
        
        return system;
    }
}
