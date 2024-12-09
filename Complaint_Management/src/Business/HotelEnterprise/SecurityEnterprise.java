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
public class SecurityEnterprise extends HotelEnterprise {
    public SecurityEnterprise(String name){
        super(name,HotelEnterprise.HotelEnterpriseType.Security);
    }
     @Override
      public ArrayList<HotelOrganization.Type> getOrganizations() {
        ArrayList<HotelOrganization.Type> orgs = new ArrayList();
        orgs.add(HotelOrganization.Type.Assault);
        
        orgs.add(HotelOrganization.Type.Theft);
        return orgs;
      }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
