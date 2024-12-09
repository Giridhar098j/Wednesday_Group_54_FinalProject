/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.HotelOrganization.Type;
import java.util.ArrayList;

/**
 *
 * @author pulakantidikshithreddy
 */
public class HotelOrganizationDirectory {
    
    private ArrayList<HotelOrganization> hotelorganizationList;

    public HotelOrganizationDirectory() {
        hotelorganizationList = new ArrayList();
    }

    public ArrayList<HotelOrganization> getHotelOrganizationList() {
        return hotelorganizationList;
    }
    
    public HotelOrganization createHotelOrganization(Type type){
        HotelOrganization organization = null;
        if (type.getValue().equals(Type.Restaurants.getValue())){
            organization = new RestaurantsOrganization();
            hotelorganizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HotelManager.getValue())){
            organization = new HotelManagerOrganization();
            hotelorganizationList.add(organization);
        }
        
         else if (type.getValue().equals(Type.FrontDesk.getValue())){
           organization = new FrontDeskOrganization();
            hotelorganizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Assault.getValue())){
           organization = new AssaultOrganization();
            hotelorganizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HouseKeeping.getValue())){
           organization = new HouseKeepingOrganization();
            hotelorganizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Maintainance.getValue())){
           organization = new MaintainanceOrganization();
            hotelorganizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Theft.getValue())){
           organization = new TheftOrganization();
            hotelorganizationList.add(organization);
        }
        
        return organization;
    }
    
}
