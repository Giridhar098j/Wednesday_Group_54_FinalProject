/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Organization.HotelOrganization;

/**
 *
 * @author pulakantidikshithreddy
 */
public class EmergencyRequest extends StatusRequest{
    private String location;
    private HotelOrganization.Type emergencytype;
    private String email;

    public String getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public HotelOrganization.Type getEmergencytype() {
        return emergencytype;
    }

    public void setEmergencytype(HotelOrganization.Type emergencytype) {
        this.emergencytype = emergencytype;
    }

    
    
    @Override
    public String toString() {
        return this.location;
    }
    
}
