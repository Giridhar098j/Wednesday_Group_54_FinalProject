/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.ServicesAdmin;

import Business.HotelEnterprise.HotelEnterprise;
import Business.Network.HotelNetwork;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Atharva
 */
public class ServicesAdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    HotelNetwork network;
    HotelEnterprise enterprise;

    /**
     * Creates new form ServicesWorkAreaJPanel
     */
    public ServicesAdminWorkAreaJPanel(JPanel userProcessContainer, HotelEnterprise enterprise,HotelNetwork network) {
        initComponents();
        this.network=network;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        valueLbl.setText(enterprise.getName());
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
        enterpriselbl = new javax.swing.JLabel();
        valueLbl = new javax.swing.JTextField();
        btnManageOrganizations = new javax.swing.JButton();
        btnManagingEmployee = new javax.swing.JButton();
        btnManagingUsers = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("Services Admin Enterprises");

        enterpriselbl.setText("Enterprise:");

        btnManageOrganizations.setText("Managing Organizations");
        btnManageOrganizations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationsActionPerformed(evt);
            }
        });

        btnManagingEmployee.setText("Managing Employees");
        btnManagingEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagingEmployeeActionPerformed(evt);
            }
        });

        btnManagingUsers.setText("Managing Users");
        btnManagingUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagingUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(enterpriselbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valueLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnManageOrganizations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManagingEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManagingUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriselbl)
                    .addComponent(valueLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnManageOrganizations)
                .addGap(18, 18, 18)
                .addComponent(btnManagingEmployee)
                .addGap(18, 18, 18)
                .addComponent(btnManagingUsers)
                .addContainerGap(265, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganizationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationsActionPerformed
        // TODO add your handling code here:
        ServicesManageOrganizationJPanel manageOrganizationJPanel = new ServicesManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationsActionPerformed

    private void btnManagingUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagingUsersActionPerformed
        // TODO add your handling code here:
        ServicesManageUserAccountJPanel MUAJP = new ServicesManageUserAccountJPanel(userProcessContainer, enterprise,network);
        userProcessContainer.add("ManageUserAccountJPanel", MUAJP);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagingUsersActionPerformed

    private void btnManagingEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagingEmployeeActionPerformed
        // TODO add your handling code here:
        ServicesManageEmployeeJPanel manageEmployeeJPanel = new ServicesManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagingEmployeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrganizations;
    private javax.swing.JButton btnManagingEmployee;
    private javax.swing.JButton btnManagingUsers;
    private javax.swing.JLabel enterpriselbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField valueLbl;
    // End of variables declaration//GEN-END:variables
}