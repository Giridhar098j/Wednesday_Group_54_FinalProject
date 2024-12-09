/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.HotelEmployee.HotelEmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.StatusQueue;
import java.util.ArrayList;

/**
 *
 * @author Giridhar
 */
public abstract class HotelOrganization {
    private String hname;
    private StatusQueue hworkQueue;
    private HotelEmployeeDirectory hemployeeDirectory;
    private UserAccountDirectory huserAccountDirectory;
    private int horganizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"),HouseKeeping("HouseKeeping Organization"), 
        Restaurants("Restaurants Organization"), FrontDesk("FrontDesk Organization"),
        HotelManager("HotelManager Organization"), Maintainance("Maintainance "),
        Assault("Assault Organization"),Theft("Theft Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public HotelOrganization(String name) {
        this.hname = name;
        hworkQueue = new StatusQueue();
        hemployeeDirectory = new HotelEmployeeDirectory();
        huserAccountDirectory = new UserAccountDirectory();
        horganizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return huserAccountDirectory;
    }

    public int getOrganizationID() {
        return horganizationID;
    }

    public HotelEmployeeDirectory getEmployeeDirectory() {
        return hemployeeDirectory;
    }
    
    public String getName() {
        return hname;
    }

    public StatusQueue getStatusQueue() {
        return hworkQueue;
    }

    public void setName(String name) {
        this.hname = name;
    }

    public void setStatusQueue(StatusQueue workQueue) {
        this.hworkQueue = workQueue;
    }

    @Override
    public String toString() {
        return hname;
    }

    public void setEmployeeDirectory(HotelEmployeeDirectory employeeDirectory) {
        this.hemployeeDirectory = employeeDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.huserAccountDirectory = userAccountDirectory;
    }
}
