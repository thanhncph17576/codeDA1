/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author TRUNG HÒA
 */
public class JFsetting extends javax.swing.JPanel {

    /**
     * Creates new form JpSetting
     */
    public JFsetting() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnGiaoDien = new javax.swing.JButton();
        btnThongTin = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnGoCaiDat = new javax.swing.JButton();
        JpPaneSetting = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1255, 500));

        jPanel1.setPreferredSize(new java.awt.Dimension(1255, 500));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnGiaoDien.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnGiaoDien.setForeground(new java.awt.Color(51, 0, 51));
        btnGiaoDien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/theme.png"))); // NOI18N
        btnGiaoDien.setText("GIAO DIỆN");
        btnGiaoDien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGiaoDien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGiaoDien.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGiaoDien.setIconTextGap(7);
        btnGiaoDien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaoDienActionPerformed(evt);
            }
        });

        btnThongTin.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnThongTin.setForeground(new java.awt.Color(51, 0, 51));
        btnThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info.png"))); // NOI18N
        btnThongTin.setText("THÔNG TIN");
        btnThongTin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongTin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongTin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnThongTin.setIconTextGap(7);
        btnThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(51, 0, 51));
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        btnCapNhat.setText("ĐỔI MẬT KHẨU");
        btnCapNhat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCapNhat.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCapNhat.setIconTextGap(7);
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnGoCaiDat.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnGoCaiDat.setForeground(new java.awt.Color(51, 0, 51));
        btnGoCaiDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unistall.png"))); // NOI18N
        btnGoCaiDat.setText("HỖ TRỢ");
        btnGoCaiDat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoCaiDat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGoCaiDat.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGoCaiDat.setIconTextGap(7);
        btnGoCaiDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoCaiDatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(btnThongTin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGiaoDien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGoCaiDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGiaoDien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCapNhat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGoCaiDat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThongTin)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        JpPaneSetting.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JpPaneSetting.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpPaneSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpPaneSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGiaoDienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaoDienActionPerformed
        JpPaneSetting.removeAll();
        JpPaneSetting.updateUI();
        JOptionPane.showMessageDialog(null, "Chức năng này sẽ được hòn thiện sau");
       
            
    }//GEN-LAST:event_btnGiaoDienActionPerformed

    private void btnThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinActionPerformed
        JpPaneSetting.removeAll();
        JpPaneSetting.updateUI();
        JOptionPane.showMessageDialog(null, "Chức năng này sẽ được hòn thiện sau");
            
    }//GEN-LAST:event_btnThongTinActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        
        // TODO add your handling code here:
        JFdoiMK doi = new JFdoiMK();
        JpPaneSetting.add(doi);
        JpPaneSetting.updateUI();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnGoCaiDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoCaiDatActionPerformed
        // TODO add your handling code here:
        JpPaneSetting.removeAll();
        JpPaneSetting.updateUI();
        JOptionPane.showMessageDialog(null, "Chức năng này sẽ được hòn thiện sau");
    }//GEN-LAST:event_btnGoCaiDatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpPaneSetting;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnGiaoDien;
    private javax.swing.JButton btnGoCaiDat;
    private javax.swing.JButton btnThongTin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
