/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Cleaning.Admin;

import Business.EcoSystem;
import Business.HotelEmployee.HotelEmployee;
import Business.HotelEmployee.HotelEmployeeDirectory;
import Business.HotelEnterprise.HotelEnterprise;
import Business.Network.HotelNetwork;
import Business.Organization.HotelOrganization;
import Business.Organization.HotelOrganizationDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Validations.Validate;

/**
 *
 * @author Atharva
 */
public class CleaningManageUserAccountsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CleaningManageUserAccountsJPanel
     */
    private JPanel container;
    private HotelEnterprise enterprise;
    HotelNetwork net;
    public CleaningManageUserAccountsJPanel(JPanel container, HotelEnterprise enterprise,HotelNetwork net) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;
        this.net=net;
        popOrganizationComboBox();
        popData();
    }
    
    public void popOrganizationComboBox() {
       try {
            
            organizationJComboBox.removeAllItems();
            if (enterprise.getOrganizationDirectory() == null) {
                enterprise.setOrganizationDirectory(new HotelOrganizationDirectory());
            }
            if (enterprise.getOrganizationDirectory().getHotelOrganizationList().size() > 0) {
                for (HotelOrganization organization : enterprise.getOrganizationDirectory().getHotelOrganizationList()) {
                    organizationJComboBox.addItem(organization.toString());
                }
            } else {
                JOptionPane.showMessageDialog(null,"There is no Organization");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Please try again later");
        }
    }
    
    public void populateEmployeeComboBox(HotelOrganization organization){
         try {
            
            employeeJComboBox.removeAllItems();
            if (organization.getEmployeeDirectory() == null) {
                organization.setEmployeeDirectory(new HotelEmployeeDirectory());
            }
            if (organization.getEmployeeDirectory().getHotelEmployeeList().size() > 0) {
              
                for (HotelEmployee employee : organization.getEmployeeDirectory().getHotelEmployeeList()) {
                    employeeJComboBox.addItem(employee.toString());
                }

            } else {
                JOptionPane.showMessageDialog(null,"There is no Employee for this Organization");
            }
        } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,"Please try again later");

        }
    }
    
    private void populateRoleComboBox(HotelOrganization organization){
       try {
            
            roleJComboBox.removeAllItems();
            if (organization.getSupportedRole() != null) {
                
                for (Role role : organization.getSupportedRole()) {
                    roleJComboBox.addItem(role.toString());
                }
            } else {
                  JOptionPane.showMessageDialog(null,"There is no Organization");
            }
        } catch (Exception ex) {
                         JOptionPane.showMessageDialog(null,"Please try again later");

        }
    }

    public void popData() {

         try {
            
            DefaultTableModel model = (DefaultTableModel) UsersJTable.getModel();

            model.setRowCount(0);
            if (enterprise.getOrganizationDirectory() == null) {
                enterprise.setOrganizationDirectory(new HotelOrganizationDirectory());
            }
            if (enterprise.getOrganizationDirectory().getHotelOrganizationList().size() > 0) {
               
                for (HotelOrganization organization : enterprise.getOrganizationDirectory().getHotelOrganizationList()) {
                    if(organization.getUserAccountDirectory()== null){
                        organization.setUserAccountDirectory(new UserAccountDirectory());
                    }
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        Object row[] = new Object[2];
                        row[0] = ua;
                        row[1] = ua.getRole();
                        ((DefaultTableModel) UsersJTable.getModel()).addRow(row);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null,"There is no organization");
            }
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null,"Please try again later");

        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox<>();
        employeeJComboBox = new javax.swing.JComboBox<>();
        roleJComboBox = new javax.swing.JComboBox<>();
        emailtxtfield = new javax.swing.JTextField();
        nameJTextField = new javax.swing.JTextField();
        passwordJTextField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("Cleaning Managing Users");

        btnBack.setText("Back<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        UsersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "User Name", "Role"
            }
        ));
        jScrollPane1.setViewportView(UsersJTable);

        jLabel2.setText("Organization:");

        jLabel3.setText("Employee:");

        jLabel4.setText("Email ID:");

        jLabel5.setText("Role:");

        jLabel6.setText("User Name:");

        jLabel7.setText("Password:");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnBack)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(employeeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(passwordJTextField))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nameJTextField))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(emailtxtfield))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnCreate)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(employeeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreate)
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String email = emailtxtfield.getText();
            String userName = nameJTextField.getText();
            String password = passwordJTextField.getText();
            if (employeeJComboBox.getSelectedItem() != null) {
                if (!((userName.equals("")))) {
                    if (!(password.equals(""))) {
                        if(!email.equals("")){
                         if (EcoSystem.checkIfUsernameIsUnique(userName,net)) {
                            
                            HotelOrganization organization = (HotelOrganization) organizationJComboBox.getSelectedItem();
                            HotelEmployee employee = (HotelEmployee) employeeJComboBox.getSelectedItem();
                            Role role = (Role) roleJComboBox.getSelectedItem();
                            if (!Validate.validatePassword(password)) {
                                JOptionPane.showMessageDialog(null, "Password should Contain \n"
                                        + "       - At least one digit\n"
                                        + "       - At least one lower case letter\n"
                                        + "       - At least one upper case letter\n"
                                        + "       - At least one special character(!@#$%^&+=~|?)\n"
                                        + "       - no whitespace allowed in the entire string\n"
                                        + "       - at least eight characters");
                                passwordJTextField.setText("");
                                return;
                            }
                            if(!Validate.validateEmail(email))
                            {
                                 JOptionPane.showMessageDialog(null,"Enter a valid email id ");
                                 emailtxtfield.setText("");
                                return;
                            
                            }
                           

                            organization.getUserAccountDirectory().createUserAccount(userName, password,email ,employee, role);
                            JOptionPane.showMessageDialog(null, "Account has been acreated succesfull");
                            nameJTextField.setText("");
                            passwordJTextField.setText("");
                            popData();
                       } else {
                            JOptionPane.showMessageDialog(null, "Please enter  aunique username", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                        else{
                            JOptionPane.showMessageDialog(null, "Enter a value for email", "Warning", JOptionPane.WARNING_MESSAGE);
                        }}
                        else {
                        JOptionPane.showMessageDialog(null, "Enter a value for password", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Enter a value for username", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No Employee is available", "Warning", JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
        HotelOrganization organization = (HotelOrganization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);}
    }//GEN-LAST:event_organizationJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UsersJTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JTextField emailtxtfield;
    private javax.swing.JComboBox<String> employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox<String> organizationJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox<String> roleJComboBox;
    // End of variables declaration//GEN-END:variables
}
