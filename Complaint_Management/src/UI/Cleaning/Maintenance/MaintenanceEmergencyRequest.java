/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Cleaning.Maintenance;

/**
 *
 * @author pulakantidikshithreddy
 */
public class MaintenanceEmergencyRequest extends javax.swing.JPanel {

    /**
     * Creates new form MaintenanceEmergencyRequest
     */
    public MaintenanceEmergencyRequest() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        locationlbl = new javax.swing.JLabel();
        locationtxtfield = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        btnSendEmergency = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setText("Maintainance Emergency Requests");

        jLabel2.setText("Emergency Type");

        locationlbl.setText("Location");

        locationtxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationtxtfieldActionPerformed(evt);
            }
        });

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSendEmergency.setText("Send Emergency");
        btnSendEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendEmergencyActionPerformed(evt);
            }
        });

        btnBack.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(locationlbl))
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSendEmergency)
                    .addComponent(locationtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationlbl)
                    .addComponent(locationtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnSendEmergency)
                .addContainerGap(286, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void locationtxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationtxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationtxtfieldActionPerformed

    private void btnSendEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendEmergencyActionPerformed
        // TODO add your handling code here:
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