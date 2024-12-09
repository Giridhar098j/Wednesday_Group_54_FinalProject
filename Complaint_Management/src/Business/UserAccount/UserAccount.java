/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.HotelEmployee.HotelEmployee;
import Business.Role.Role;
import Business.WorkQueue.StatusQueue;

/**
 *
 * @author Giridhar
 */
public class UserAccount {
    private String username;
    private String password;
    private String email;
    private HotelEmployee employee;
    private Role role;
    private StatusQueue statusQueue;

    public UserAccount() {
        statusQueue = new StatusQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(HotelEmployee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public HotelEmployee getEmployee() {
        return employee;
    }

    public StatusQueue getStatusQueue() {
        return statusQueue;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
}
