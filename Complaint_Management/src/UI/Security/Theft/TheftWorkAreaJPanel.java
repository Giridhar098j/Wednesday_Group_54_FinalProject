/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Security.Theft;

import Business.EcoSystem;
import Business.Network.HotelNetwork;
import Business.Organization.HotelOrganization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Giridhar
 */
public class TheftWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TheftWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private TheftOrganization theftOrganization;
    private HotelEnterprise enterprise;
    HotelNetwork network;
    
    public TheftWorkAreaJPanel(JPanel container, UserAccount acc, HotelOrganization org, HotelEnterprise enterprise, EcoSystem business, HotelNetwork network) {
        initComponents();
        this.network=network;
        userProcessContainer = container;
        userAccount = acc;
        this.business = business;
        this.theftOrganization = (TheftOrganization)org;
        this.enterprise=enterprise;
        populateTable();
        populateEmergencyTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkReq = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmrgcy = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnProccess = new javax.swing.JButton();
        lblEmg = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();

        lblTitle.setText("Theft Organization Work Area");

        tblWorkReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkReq);

        tblEmrgcy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Location"
            }
        ));
        jScrollPane2.setViewportView(tblEmrgcy);

        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnProccess.setText("Proccess");
        btnProccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProccessActionPerformed(evt);
            }
        });

        lblEmg.setText("Emergency Locations :");

        btnSend.setText("Send Team");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRefresh)
                                .addGap(125, 125, 125)
                                .addComponent(lblTitle))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAssign)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnProccess))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmg)
                            .addComponent(btnSend))))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnRefresh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(btnProccess))
                .addGap(41, 41, 41)
                .addComponent(lblEmg)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSend)
                .addGap(83, 83, 83))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkReq.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        StatusRequest request = (StatusRequest)tblWorkReq.getValueAt(selectedRow, 0);
        if(request.getReceiver()!=null)
            JOptionPane.showMessageDialog(null,"Request has already been assigned");
        else {
            if(request.getStatus()=="Completed")
            {
                JOptionPane.showMessageDialog(null,"Request has already been proccessed");
            }
            else
                request.setReceiver(userAccount);
            request.setStatus("Pending");
        }
        populateTable();
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProccessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkReq.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        Complaints_Suggestions_Request request = (Complaints_Suggestions_Request)tblWorkReq.getValueAt(selectedRow, 0);
        
        if(request.getStatus()=="Completed")    
            JOptionPane.showMessageDialog(null,"Request has already been proccessed");
        else if(request.getStatus()=="Sent"   || request.getStatus()==null)
            JOptionPane.showMessageDialog(null,"Request has to be assigned first");
        else { 
            request.setStatus("Processing");
            TheftProcessStatusRequestJPanel processWorkRequestJPanel = new TheftProcessStatusRequestJPanel(userProcessContainer, request);
            userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnProccessActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmrgcy.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        EmergencyRequest request = (EmergencyRequest)tblEmrgcy.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        
        ValidateMail valMail = new ValidateMail();
        valMail.sendAttachment();
        JOptionPane.showMessageDialog(this,"Mail has been sent");
    }//GEN-LAST:event_btnSendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProccess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSend;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEmg;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEmrgcy;
    private javax.swing.JTable tblWorkReq;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel)tblWorkReq.getModel();
        
        model.setRowCount(0);
        
        for(StatusRequest request : theftOrganization.getStatusQueue().getStatusRequestList()){
            if(request instanceof Complaints_Suggestions_Request) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            model.addRow(row);
            }
        }
    }

    public void populateEmergencyTable() {
        DefaultTableModel model = (DefaultTableModel)tblEmrgcy.getModel();
        
        model.setRowCount(0);
        
        for(StatusRequest request : theftOrganization.getStatusQueue().getStatusRequestList()) {
            if (request instanceof EmergencyRequest) {
                EmergencyRequest s = (EmergencyRequest) request;
                Object[] row = new Object[1];
                row[0] = s;

                model.addRow(row);
            }
        }
    }
}