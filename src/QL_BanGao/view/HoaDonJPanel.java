/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QL_BanGao.view;

/**
 *
 * @author Le Van
 */
public class HoaDonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HoaDonJPanel
     */
    public HoaDonJPanel() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        listdanhmuc = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblsanpham = new javax.swing.JTable();
        lbltongsp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        txtsoluong = new javax.swing.JTextField();
        txttensp = new javax.swing.JTextField();
        txtmasp = new javax.swing.JTextField();
        cbodm = new javax.swing.JComboBox<>();
        txttim = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnlui = new javax.swing.JButton();
        btntoi = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();

        listdanhmuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listdanhmucMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listdanhmuc);

        tblsanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MaHD", "NgayLap", "ThanhTien", "TrangThai"
            }
        ));
        tblsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsanphamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblsanpham);

        lbltongsp.setText("lbltennhanvien");
        lbltongsp.setToolTipText("Tong so san pham");

        jLabel1.setText("MaHD");

        jLabel3.setText("ThanhTien");

        jLabel2.setText("NgayLap");

        jLabel4.setText("TrangThai");

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        txttim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttimKeyPressed(evt);
            }
        });

        jLabel6.setText("Tim");

        btnlui.setText("<");
        btnlui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluiActionPerformed(evt);
            }
        });

        btntoi.setText(">");
        btntoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntoiActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlui)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btntoi)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbltongsp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnthem)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtsoluong, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtmasp, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txttensp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnxoa)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnsua))
                                            .addComponent(cbodm, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnLuu)))))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lbltongsp)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbodm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlui)
                    .addComponent(btntoi))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnxoa)
                    .addComponent(btnsua)
                    .addComponent(btnLuu))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listdanhmucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listdanhmucMouseClicked
        // TODO add your handling code here:
        SanPhamDao sp = new SanPhamDao();
        hienthilentable();
        lbltongsp.setText("tong so sp: " + String.valueOf(sp.tongsp(listdanhmuc.getSelectedValue().getMadm())));

        //

        //

    }//GEN-LAST:event_listdanhmucMouseClicked

    private void tblsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsanphamMouseClicked
        // TODO add your handling code here:

        row = tblsanpham.getSelectedRow();
        if (row== -1) return ;
        SanPham sp = dssp.get(row);
        txttensp.setText(sp.getTensp()); // viet gon hon
        txtmasp.setText(dssp.get(row).getMasp());
        txtsoluong.setText(String.valueOf(sp.getSoluong()));
        //txtsoluong.setText(sp.getSoluong()+""); //viet gon hon
        txtdongia.setText(sp.getDongia()+ "");

    }//GEN-LAST:event_tblsanphamMouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        SanPham sp =  new SanPham();
        sp.setMadm(listdanhmuc.getSelectedValue().getMadm());
        sp.setMasp(txtmasp.getText());
        sp.setTensp(txttensp.getText());
        sp.setSoluong(Integer.parseInt(txtsoluong.getText()));
        sp.setDongia(Integer.parseInt(txtdongia.getText()));
        SanPhamDao spdao =new SanPhamDao() ;

        if (spdao.luusanpham(sp)>0 )
        {
            JOptionPane.showMessageDialog(null, "lưu thành công");
            hienthilentable();
        }
        else
        JOptionPane.showMessageDialog(null, "lưu that bại");

    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        int index = tblsanpham.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 Sản Phẩm trong bảng để xóa", "Thông Báo", 1);
            return;
        }
        SanPhamDao spdao = new SanPhamDao();

        int tk = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không");
        if (tk==JOptionPane.YES_OPTION)
        {
            if (spdao.XoaSanPham(tblsanpham.getValueAt(index,0).toString()))
            {
                JOptionPane.showMessageDialog(this, "Xóa Sản Phẩm thành công", "Thông Báo", 1);
                hienthilentable();
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi hệ thống", "Thông Báo", 0);
            }

        }
        else
        {
            return;

        }

    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        SanPham sp = new SanPham();
        sp.setMadm(cbodm.getItemAt(cbodm.getSelectedIndex()).getMadm());
        sp.setMasp(txtmasp.getText());
        sp.setTensp(txttensp.getText());
        sp.setSoluong(Integer.parseInt(txtsoluong.getText()));
        sp.setDongia(Integer.parseInt(txtdongia.getText()));
        SanPhamDao spdao =new SanPhamDao() ;
        if (spdao.capnhatsanpham(sp)>0 )
        {
            JOptionPane.showMessageDialog(null, "câp nhật thành công");
            hienthilentable();
        }
        else
        JOptionPane.showMessageDialog(null, "cập nhật that bại,khong duoc sua ma");

    }//GEN-LAST:event_btnsuaActionPerformed

    private void txttimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimKeyPressed
        // TODO add your handling code here:
        SanPhamDao sp = new SanPhamDao();

        dssp=sp.timtheoten(txttim.getText());
        DefaultTableModel dftbl = (DefaultTableModel)tblsanpham.getModel();
        dftbl.setRowCount(0);

        for(int i=0;i<dssp.size(); i++)
        //for (SanPham sp: dssp)

        {/* Vector<Object> vec = new Vector<>();

            vec.add(dssp.get(i).getMasp());
            vec.add(dssp.get(i).getTensp());
            vec.add(dssp.get(i).getSoluong());
            vec.add(dssp.get(i).getDongia());
            dftbl.addRow(vec);
            */
            /*    cách 2
            vec.add(sp.getMadm());
            vec.add(sp.getTensp());
            vec.add(sp.getSoluong());
            vec.add(sp.getDongia());
            dftbl.addRow(vec);
            */
            //cách 3
            String masp=dssp.get(i).getMasp();
            String tensp=dssp.get(i).getTensp();
            int soluong=dssp.get(i).getSoluong();
            int dongia=dssp.get(i).getDongia();
            Object[] row= new Object[]{masp,tensp,soluong,dongia};
            dftbl.addRow(row);
        }

        cbodm.setSelectedItem(listdanhmuc.getSelectedValue());

    }//GEN-LAST:event_txttimKeyPressed

    private void btnluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluiActionPerformed
        // TODO add your handling code here:
        try
        {
            lui=tblsanpham.getSelectedRow();
            lui--;
            if (lui==0)
            lui=0;

            tblsanpham.setRowSelectionInterval(lui, lui);

            duyet(lui);

        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Đã về vị trí đầu tiên");
        }

    }//GEN-LAST:event_btnluiActionPerformed

    private void btntoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntoiActionPerformed
        // TODO add your handling code here:

        try
        {
            toi=tblsanpham.getSelectedRow();
            toi++;
            if (toi==dssp.size())
            toi=0;

            tblsanpham.setRowSelectionInterval(toi, toi);

            duyet(toi);

        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "chọn vào danh sách");
        }

    }//GEN-LAST:event_btntoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnlui;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntoi;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<DanhMuc> cbodm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbltongsp;
    private javax.swing.JList<DanhMuc> listdanhmuc;
    private javax.swing.JTable tblsanpham;
    private javax.swing.JTextField txtmasp;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txttensp;
    private javax.swing.JTextField txttim;
    // End of variables declaration//GEN-END:variables
}
