/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Organization.HotelOrganization;
import java.util.ArrayList;

/**
 *
 * @author Giridhar
 */
public class EcoSystem {
    private static EcoSystem business;
    private ArrayList<HotelNetwork> networkList;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public HotelNetwork createAndAddNetwork(){
        HotelNetwork network=new HotelNetwork();
        networkList.add(network);
        return network;
    }
   
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SecurityAdminRole());
        roleList.add(new HotelAdminRole());
        
        return roleList;
    }
    private EcoSys(){
        super(null);
        networkList=new ArrayList<HotelNetwork>();
    }

    public ArrayList<HotelNetwork> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<HotelNetwork> networkList) {
        this.networkList = networkList;
    }
    
    
    public static boolean checkIfUsernameIsUnique(String username,HotelNetwork net) {

        //  if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
       
            
       
           
                for (HotelEnterprise enterprise : net.getEnterpriseDirectory().getHotelEnterpriseList()) {
                    for (UserAccount hua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                        if (hua.getUsername().equalsIgnoreCase(username)) {
                            return false;
                        }
                    }
                   

                    for (HotelOrganization organization : enterprise.getOrganizationDirectory().getHotelOrganizationList()) {
                        for (UserAccount hua : organization.getUserAccountDirectory().getUserAccountList()) {
                            if (hua.getUsername().equalsIgnoreCase(username)) {
                                return false;
                            }
                        }
                    }
                }
        return true;
    }
}
