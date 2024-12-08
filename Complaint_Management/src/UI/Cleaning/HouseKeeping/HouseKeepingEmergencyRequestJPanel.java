/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Cleaning.HouseKeeping;

import Business.HotelEnterprise.HotelEnterprise;
import Business.Network.HotelNetwork;
import Business.Organization.AssaultOrganization;
import Business.Organization.HouseKeepingOrganization;
import Business.Organization.HotelOrganization;
import Business.Organization.TheftOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmergencyRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Atharva
 */
public class HouseKeepingEmergencyRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HouseKeepingEmergencyRequestJPanel
     */
     private JPanel userProcessContainer;
    private HotelEnterprise enterprise;
    private UserAccount userAccount; 
    private HotelNetwork network;
    public HouseKeepingEmergencyRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, HotelEnterprise enterprise,HotelNetwork network) {
        initComponents();
        this.network=network;
       this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
     populateComboBox();
    }
    EmergencyRequest  erequest = new EmergencyRequest();
    
    private void populateComboBox() {
         combo.removeAllItems();
        combo.addItem(HotelOrganization.Type.Theft.toString());
        combo.addItem(HotelOrganization.Type.Assault.toString());
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        locationlbl = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        locationtxtfield = new javax.swing.JTextField();
        btnSendEmergency = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("House Keeping Emergency Request");

        btnBack.setText("Back<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Emergency Type:");

        locationlbl.setText("Location :");

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSendEmergency.setText("Send Emergency");
        btnSendEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendEmergencyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btnBack)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(locationlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(locationtxtfield))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(btnSendEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationlbl)
                    .addComponent(locationtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnSendEmergency)
                .addContainerGap(229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HouseKeepingWorkAreaJPanel HKWA = (HouseKeepingWorkAreaJPanel) component;
        HKWA.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSendEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendEmergencyActionPerformed
        // TODO add your handling code here:
         String location = locationtxtfield.getText();
        erequest.setLocation(location);
        erequest.setEmergencytype((HotelOrganization.Type) combo.getSelectedItem());
        erequest.setEmail(userAccount.getEmail());
        HotelOrganization org = null;
        HotelOrganization.Type sel = (HotelOrganization.Type) combo.getSelectedItem();
        if(location.isEmpty())
        {
            
            JOptionPane.showMessageDialog(null,"Location field should not be empty");
        }

        else
        {

            if(sel.equals(HotelOrganization.Type.Theft))
            {
                for (HotelEnterprise enterprise: network.getEnterpriseDirectory().getHotelEnterpriseList())
                {
                    for(HotelOrganization organization:enterprise.getOrganizationDirectory().getHotelOrganizationList())
                    {
                        if (organization instanceof TheftOrganization){
                            org = organization;
                            break;
                        }
                    }
                }
                if (org!=null){
                    org.getStatusQueue().getStatusRequestList().add(erequest);
                    userAccount.getStatusQueue().getStatusRequestList().add(erequest);
                }
            }
            else if(sel.equals(HotelOrganization.Type.Assault))
            {

                for (HotelEnterprise enterprise: network.getEnterpriseDirectory().getHotelEnterpriseList())
                {
                    for(HotelOrganization organization:enterprise.getOrganizationDirectory().getHotelOrganizationList())
                    {
                        if (organization instanceof AssaultOrganization){
                            org = organization;
                            break;
                        } }
                    }

                    if (org!=null){
                        org.getStatusQueue().getStatusRequestList().add(erequest);
                        userAccount.getStatusQueue().getStatusRequestList().add(erequest);
                    }
                }

                JOptionPane.showMessageDialog(null,"Your emergency request has been sent! An officer will notify you shortly");

            }
    }//GEN-LAST:event_btnSendEmergencyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSendEmergency;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel locationlbl;
    private javax.swing.JTextField locationtxtfield;
    // End of variables declaration//GEN-END:variables
}
