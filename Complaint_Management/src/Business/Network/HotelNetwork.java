/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;

/**
 *
 * @author Giridhar
 */
public class HotelNetwork {
    private String name;
    private HotelEnterpriseDirectory enterpriseDirectory;
    
    public HotelNetwork(){
        enterpriseDirectory=new HotelEnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HotelEnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
