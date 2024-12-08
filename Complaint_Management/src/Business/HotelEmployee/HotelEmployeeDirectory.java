/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HotelEmployee;

import java.util.ArrayList;

/**
 *
 * @author Giridhar
 */
public class HotelEmployeeDirectory {
    
    private ArrayList<HotelEmployee> hotelemployeeList;

    public HotelEmployeeDirectory() {
        hotelemployeeList = new ArrayList();
    }

    public ArrayList<HotelEmployee> getHotelEmployeeList() {
        return hotelemployeeList;
    }
    
    public HotelEmployee createHotelEmployee(String name){
        HotelEmployee Hemployee = new HotelEmployee();
        Hemployee.setName(name);
        hotelemployeeList.add(Hemployee);
        return Hemployee;
    }
}
