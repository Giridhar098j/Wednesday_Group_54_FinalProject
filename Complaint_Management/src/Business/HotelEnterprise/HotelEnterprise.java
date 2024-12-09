/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HotelEnterprise;

import Business.Organization.HotelOrganization;
import Business.Organization.HotelOrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author Giridhar
 */
public abstract class HotelEnterprise extends HotelOrganization {
    private HotelEnterpriseType hotelenterpriseType;
    private HotelOrganizationDirectory organizationDirectory;

    public HotelOrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(HotelOrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
    public enum HotelEnterpriseType{
        HotelManagement("Hotel Management"),
        Security("Security"),
        Cleaning("Cleaning"),
        Services("Services");
         
        private String value;
        
        private HotelEnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }
    public abstract ArrayList<Type> getOrganizations();
    public HotelEnterpriseType getHotelEnterpriseType() {
        return hotelenterpriseType;
    }

    public void setHotelEnterpriseType(HotelEnterpriseType hotelenterpriseType) {
        this.hotelenterpriseType = hotelenterpriseType;
    }
    
    public HotelEnterprise(String name,HotelEnterpriseType type){
        super(name);
        this.hotelenterpriseType=type;
        organizationDirectory=new HotelOrganizationDirectory();
    }
}
