/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HotelManagement.HotelAdmin;

import Business.HotelEmployee.HotelEmployee;
import Business.Organization.HotelOrganization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Giridhar
 */
public class ManageHotelEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHotelEmployeeJPanel
     */
    
    public String message1 = null; 
    private HotelOrganizationDirectory orgDir;
    private JPanel userProcessContainer;
    
    public ManageHotelEmployeeJPanel(JPanel userProcessContainer,HotelOrganizationDirectory orgDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.orgDir = orgDir;
        populateOrganizationEmpComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        lblOrg = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        cmbOrgEmp = new javax.swing.JComboBox<>();
        txtName = new javax.swing.JTextField();

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setText("Hotel Employee Management");

        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganization);

        lblOrg.setText("Organization :");

        lblName.setText("Name :");

        btnCreate.setText("Create Employee");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        cmbOrgEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnBack)
                        .addGap(87, 87, 87)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblOrg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbOrgEmp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrg)
                    .addComponent(cmbOrgEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addGap(120, 120, 120))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        HotelOrganization organization = (HotelOrganization) cmbOrgEmp.getSelectedItem();
        if(txtName.getText().isEmpty())
            JOptionPane.showMessageDialog(null," Enter the Organisation Name ");
        else 
        {
            organization.getEmployeeDirectory().createHotelEmployee(txtName.getText());
            populateTable(organization);
            txtName.setText("");
            JOptionPane.showMessageDialog(null,"Employee has been created sucessfully");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void populateTable(HotelOrganization organization){
        DefaultTableModel model = (DefaultTableModel) OrganizationsJTable.getModel();
        
        model.setRowCount(0);
        
        for (HotelEmployee employee : organization.getEmployeeDirectory().getHotelEmployeeList()){
            Object[] row = new Object[1];
          
            row[0] = employee.getName();
            model.addRow(row);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        cmbOrgEmp.removeAllItems();
        
        for (HotelOrganization org : orgDir.getHotelOrganizationList()){
            cmbOrgEmp.addItem(org);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> cmbOrgEmp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrg;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblOrganization;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}