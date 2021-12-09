/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.banDAO;
import Entity.Ban;
import Helper.Messages;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFquanLy_ban extends javax.swing.JPanel {

    banDAO dao = new banDAO();
    public static JFquanLy_ban B;

    public JFquanLy_ban() {
        initComponents();
        B = this;
        FillTable();

    }

    public void FillTable() {
        DefaultTableModel model = (DefaultTableModel) tbBan.getModel();
        model.setRowCount(0);
        List<Ban> arrTable = dao.selectAll();
        DefaultTableModel tbmodel = new DefaultTableModel();

        tbmodel.addColumn("Mã Bàn");
        tbmodel.addColumn("Tên bàn");
        tbmodel.addColumn("Trạng thái");

        if (arrTable != null) {
            int soban = 0;
            for (Ban b : arrTable) {
                soban++;
                tbmodel.addRow(new Object[]{b.getMaBan(), b.getTenBan(), b.getTrangThai()});
            }
            lblthongtin.setText(String.valueOf(soban) + " bàn");
        } else {
            JOptionPane.showMessageDialog(null, "Không có bàn nào");
        }
        tbBan.setModel(tbmodel);
        for (int i = 0; i < tbBan.getColumnCount(); i++) {
            Class<?> col = tbBan.getColumnClass(i);
            tbBan.setDefaultEditor(col, null);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbBan = new javax.swing.JTable();
        bntThem = new javax.swing.JButton();
        bntSua = new javax.swing.JButton();
        bntXoa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblthongtin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txttim = new javax.swing.JTextField();

        tbBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbBan);

        bntThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntThem.setForeground(new java.awt.Color(51, 51, 0));
        bntThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file_add.png"))); // NOI18N
        bntThem.setText("Thêm");
        bntThem.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThemActionPerformed(evt);
            }
        });

        bntSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntSua.setForeground(new java.awt.Color(51, 51, 0));
        bntSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/document_edit.png"))); // NOI18N
        bntSua.setText("Sửa");
        bntSua.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSuaActionPerformed(evt);
            }
        });

        bntXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntXoa.setForeground(new java.awt.Color(51, 51, 0));
        bntXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file_delete.png"))); // NOI18N
        bntXoa.setText("Xóa");
        bntXoa.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntXoaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Quản lý bàn");

        lblthongtin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblthongtin.setForeground(new java.awt.Color(153, 0, 0));
        lblthongtin.setText("Total");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Tổng số bàn:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Tìm bàn:");

        txttim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bntThem, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bntSua, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bntXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(309, 309, 309)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblthongtin))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntThem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntSua, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblthongtin)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbBanMouseClicked

    private void bntThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntThemActionPerformed
        JFquanLy_ban_them ban = new JFquanLy_ban_them(RUN.QLTS, true);
        ban.setVisible(true);
    }//GEN-LAST:event_bntThemActionPerformed

    private void bntSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSuaActionPerformed
        int select = tbBan.getSelectedRow();
        if (select < 0) {
            Messages.alert(this, "Bạn chưa chọn bàn nào?");
        } else {
            int MaBan = (int) tbBan.getValueAt(select, 0);
            JFquanLy_ban_sua sua = new JFquanLy_ban_sua(RUN.QLTS, true, MaBan);
            sua.setVisible(true);
        }
    }//GEN-LAST:event_bntSuaActionPerformed

    private void bntXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntXoaActionPerformed
        int[] selectedRows = tbBan.getSelectedRows();

        if (selectedRows.length <= 0) {
            Messages.alert(this, "Bạn chưa chọn bàn nào? ");
        } else {
            ArrayList<Integer> ListMaBan = new ArrayList<Integer>();
            String sp = "";
            for (int i : selectedRows) {
                int ma = (int) tbBan.getValueAt(i, 0);
                ListMaBan.add(ma);
                String tenban = (String) tbBan.getValueAt(i, 1);

                sp += tenban + "\n";
            }
            int nutbam = JOptionPane.showConfirmDialog(new JFrame(), "Bạn chắc chắn xóa?", "Trà sữa Goky", JOptionPane.YES_NO_OPTION);
            if (nutbam == JOptionPane.YES_OPTION) {
                int cacdong[] = tbBan.getSelectedRows();
                for (int i = 0; i < cacdong.length; i++) {
                    String MaPhong = tbBan.getValueAt(cacdong[i], 0).toString();
                    dao.delete(MaPhong);
                    FillTable();
                }
            }
        }
        JFquanLy_ban.B.FillTable();
        JFquanLy_ban.B.updateUI();
        JFbanHang.bh.FillBan();
        JFbanHang.bh.updateUI();
    }//GEN-LAST:event_bntXoaActionPerformed

    private void txttimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimKeyReleased
        List<Ban> arrTable = dao.selectByKeyword(txttim.getText());
        if (arrTable != null) {
            DefaultTableModel tbmodel = new DefaultTableModel();

            tbmodel.addColumn("Mã Bàn");
            tbmodel.addColumn("Tên bàn");
            tbmodel.addColumn("Trạng thái");

            int soban = 0;
            for (Ban b : arrTable) {
                soban++;
                tbmodel.addRow(new Object[]{b.getMaBan(), b.getTenBan(), b.getTrangThai()});
            }
            lblthongtin.setText(String.valueOf(soban) + " bàn");
            tbBan.setModel(tbmodel);
            for (int i = 0; i < tbBan.getColumnCount(); i++) {
                Class<?> col = tbBan.getColumnClass(i);
                tbBan.setDefaultEditor(col, null);
            }
        }
    }//GEN-LAST:event_txttimKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSua;
    private javax.swing.JButton bntThem;
    private javax.swing.JButton bntXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblthongtin;
    private javax.swing.JTable tbBan;
    private javax.swing.JTextField txttim;
    // End of variables declaration//GEN-END:variables
}
