/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HotelEnterprise;

import Business.Organization.HotelOrganization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Giridhar
 */
public class HotelManagementEnterprise extends HotelEnterprise {
    public HotelManagementEnterprise(String name){
        super(name,HotelEnterprise.HotelEnterpriseType.HotelManagement);
    }

    
     @Override
      public ArrayList<HotelOrganization.Type> getOrganizations() {
        ArrayList<HotelOrganization.Type> orgs = new ArrayList();
        orgs.add(HotelOrganization.Type.FrontDesk);
       /* orgs.add(HotelOrganization.Type.Miscellaneous);*/
        orgs.add(HotelOrganization.Type.HotelManager);
        
        return orgs;
      }
}
