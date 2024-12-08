/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HotelEmployee;

/**
 *
 * @author Giridhar
 */
public class HotelEmployee {
    private String name;
    private int id;
    private static int count = 1;
    
    public HotelEmployee() {
        id = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
