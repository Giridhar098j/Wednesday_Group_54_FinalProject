/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HotelEnterprise;

import java.util.ArrayList;

/**
 *
 * @author Giridhar
 */
public class HotelEnterpriseDirectory {
    private ArrayList<HotelEnterprise> hotelenterpriseList;
   

    public ArrayList<HotelEnterprise> getHotelEnterpriseList() {
        return hotelenterpriseList;
    }

    public void setHotelEnterpriseList(ArrayList<HotelEnterprise> hotelenterpriseList) {
        this.hotelenterpriseList = hotelenterpriseList;
    }
    
    public HotelEnterpriseDirectory(){
        hotelenterpriseList=new ArrayList<HotelEnterprise>();
    }
    
    //Creating an hotelenterprise
    public HotelEnterprise createAndAddHotelEnterprise(String name,HotelEnterprise.HotelEnterpriseType type){
        HotelEnterprise enterprise=null;
        if(type==HotelEnterprise.HotelEnterpriseType.HotelManagement){
            enterprise=new HotelManagementEnterprise(name);
            hotelenterpriseList.add(enterprise);
        }
        else if(type==HotelEnterprise.HotelEnterpriseType.Security){
            enterprise = new SecurityEnterprise(name);
            hotelenterpriseList.add(enterprise);
        }
        
        else if(type==HotelEnterprise.HotelEnterpriseType.Cleaning){
            enterprise = new CleaningEnterprise(name);
            hotelenterpriseList.add(enterprise);
        }
        
        else if(type==HotelEnterprise.HotelEnterpriseType.Services){
            enterprise = new ServicesEnterprise(name);
            hotelenterpriseList.add(enterprise);
        }
       
        
        return enterprise;
    }
}
