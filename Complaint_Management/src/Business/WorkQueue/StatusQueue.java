/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author pulakantidikshithreddy
 */
public class StatusQueue {
    
    private ArrayList<StatusRequest> statusRequestList;

    public StatusQueue() {
        statusRequestList = new ArrayList();
    }

    public ArrayList<StatusRequest> getStatusRequestList() {
        return statusRequestList;
    }
}