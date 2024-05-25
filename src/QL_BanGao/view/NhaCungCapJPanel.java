/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QL_BanGao.view;

import QL_BanGao.model.NhaCungCap;
import QL_BanGao.dao.NhaCungCapDAO;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Le Van
 */
public class NhaCungCapJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NhaCungCapJPanel
     */
    public NhaCungCapJPanel() {
        initComponents();
        tatBTN();
        showNhaCungCap(tblNhaCungCap);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTimSDT = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMaNCC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhaCungCap = new javax.swing.JTable();
        btnTaiLai = new javax.swing.JButton();

        jLabel6.setText("Nhập SDT:");

        txtTimSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimSDTActionPerformed(evt);
            }
        });

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã NCC:");

        txtMaNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNCCActionPerformed(evt);
            }
        });

        jLabel3.setText("SĐT:");

        jLabel2.setText("Họ tên:");
        jLabel2.setMaximumSize(new java.awt.Dimension(85, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(85, 16));
        jLabel2.setPreferredSize(new java.awt.Dimension(85, 16));

        jLabel5.setText("Email:");

        jLabel4.setText("Địa chỉ:");

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");

        tblNhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblNhaCungCap);

        btnTaiLai.setText("Tải lại");
        btnTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTimSDT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNCC, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTaiLai)))
                .addGap(0, 87, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLuu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(90, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail)
                                    .addComponent(txtSDT))
                                .addContainerGap())))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnTim)
                    .addComponent(btnTaiLai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    NhaCungCapDAO nccdao = new NhaCungCapDAO();
    int flag = 0;
    NhaCungCap ncc = new NhaCungCap();
    public void showNhaCungCap(JTable table) {
    ArrayList<NhaCungCap> listNCC = nccdao.getListNCC(); // Lấy danh sách nhà cung cấp
    String[] header = {"Mã NCC", "Tên NCC", "Địa chỉ","SDT", "Email"};
    DefaultTableModel model = new DefaultTableModel(header, 0); // Tạo model cho table
    // Duyệt qua danh sách nhà cung cấp và thêm vào model
    for (NhaCungCap ncc : listNCC) {
        model.addRow(new Object[]{ncc.getMaNCC(), ncc.getTenNCC(), ncc.getDiaChi(),ncc.getSDT(), ncc.getEmail()});
    }
    table.setModel(model); // Thiết lập model cho table
}
    public void tatBTN()
    {
        btnLuu.setEnabled(false);
        btnThoat.setEnabled(false);
        txtDiaChi.setEnabled(false);
        txtEmail.setEnabled(false);
        txtHoTen.setEnabled(false);
        txtSDT.setEnabled(false);  
    }
    public void batTXT()
    {
        txtDiaChi.setEnabled(true);
        txtEmail.setEnabled(true);
        txtHoTen.setEnabled(true);
        txtSDT.setEnabled(true); 
    }
    public void clearTXT()
    {
        txtMaNCC.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtHoTen.setText("");
        txtEmail.setText("");  
    }
    public boolean isSoDienThoaiTrung(String soDienThoai) {
            ArrayList<NhaCungCap> tempNCC = nccdao.getListNCC();
            for (NhaCungCap sdt: tempNCC) {
                if (sdt.getSDT().equals(soDienThoai)) {
                    return true;
                }
            }
            return false;
        }
        
          public boolean isEmail(String email) {
            ArrayList<NhaCungCap> temptNCC = nccdao.getListNCC();
            for (NhaCungCap sdt: temptNCC) {
                if (sdt.getEmail().equals(email)) {
                    return true;
                }
            }
            return false;
        }
    // Phương thức kiểm tra số điện thoại
    public boolean ktraSDT(String phoneNumber) {
      
        String PHONE_REGEX = "^0\\d{9}$";
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    public boolean ktraEmail(String t)
    {
        String EMAIL = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(EMAIL);
         Matcher matcher = pattern.matcher(t);
         return matcher.matches();
        
    }
     public void them()
    {       //ArrayList<KhachHang> lKH = new ArrayList();
            tblNhaCungCap.setRowSelectionAllowed(false);
            tblNhaCungCap.setColumnSelectionAllowed(false);
            NhaCungCap n = new NhaCungCap();
            try {
            if(txtDiaChi.getText().isEmpty() || txtSDT.getText().isEmpty() || txtHoTen.getText().isEmpty() || txtEmail.getText().isEmpty() )
            {
                    JOptionPane.showMessageDialog(btnThem,"Thiếu thông tin");
                    batTXT();
        
            }
            else if(!ktraEmail(txtEmail.getText()))
            {
                JOptionPane.showMessageDialog(btnThoat,"Sai email");
                batTXT();
            }
            else if(!ktraSDT(txtSDT.getText()) && !isSoDienThoaiTrung(txtSDT.getText()))
            { JOptionPane.showMessageDialog(btnThoat, "Sai số điện thoại");
                batTXT();
            }
            else if(isSoDienThoaiTrung(txtSDT.getText()))
            { JOptionPane.showMessageDialog(btnThoat, "Trùng số điện thoại");
                batTXT();
            }
            else if(isEmail(txtEmail.getText()))
            { JOptionPane.showMessageDialog(btnThoat, "Trùng Email");
                batTXT();
            }
            else
            {
                n.setEmail(txtEmail.getText());
                n.setTenNCC(txtHoTen.getText());
                n.setDiaChi(txtDiaChi.getText());
                n.setMaNCC(txtMaNCC.getText());
                n.setSDT(txtSDT.getText());
                int i = nccdao.themNhaCungCap(n);
                if(i != 0)
                {
                    JOptionPane.showMessageDialog(btnThoat, "Thêm thành công");
                    btnSua.setEnabled(true);
                    btnXoa.setEnabled(true);
                    tatBTN();
                } 
                else
                    JOptionPane.showMessageDialog(btnThoat,"Thêm thất bại");
                clearTXT();
            }
        } catch (Exception e) {
        }
        showNhaCungCap(tblNhaCungCap);
    }
    public void updateKH()
    {
         tblNhaCungCap.setRowSelectionAllowed(false);
         tblNhaCungCap.setColumnSelectionAllowed(false);
            NhaCungCap n = new NhaCungCap();
            try {
            if(txtDiaChi.getText().isEmpty() || txtSDT.getText().isEmpty() || txtHoTen.getText().isEmpty() || txtEmail.getText().isEmpty() )
            {
                    JOptionPane.showMessageDialog(btnSua,"Thiếu thông tin");
                    batTXT();
            }
            else if(!ktraEmail(txtEmail.getText()))
            {
                JOptionPane.showMessageDialog(btnThoat,"Sai email");
                batTXT();
            }
            else if(!ktraSDT(txtSDT.getText()) && !isSoDienThoaiTrung(txtSDT.getText()))
            { JOptionPane.showMessageDialog(btnThoat, "Sai số điện thoại");
                batTXT();
            }
            else if(isSoDienThoaiTrung(txtSDT.getText()))
            { JOptionPane.showMessageDialog(btnThoat, "Trùng số điện thoại");
                batTXT();
            }
            else if(isEmail(txtEmail.getText()))
            { JOptionPane.showMessageDialog(btnThoat, "Trùng Email");
                batTXT();
            }
            else
            {
                n.setEmail(txtEmail.getText());
                n.setTenNCC(txtHoTen.getText());
                n.setDiaChi(txtDiaChi.getText());
                n.setMaNCC(txtMaNCC.getText());
                n.setSDT(txtSDT.getText());
                int i = nccdao.updateNhaCungCap(n);
                if(i != 0)
                {
                    JOptionPane.showMessageDialog(btnThoat, "Cập nhật thành công");
                    btnSua.setEnabled(true);
                    btnXoa.setEnabled(true);
                    tatBTN();
                } 
                else
                    JOptionPane.showMessageDialog(btnThoat,"Cập nhật thất bại");
                clearTXT();
            }
        } catch (Exception e) {
        }
            showNhaCungCap(tblNhaCungCap);
    }
    private void txtMaNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNCCActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
            btnSua.setEnabled(false);
            btnXoa.setEnabled(false);
            btnLuu.setEnabled(true);
            btnThoat.setEnabled(true);
            flag = 1;
            batTXT();    
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        NhaCungCap n = new NhaCungCap();
        try 
       {
             if(txtMaNCC.getText().isEmpty())
                JOptionPane.showMessageDialog(btnXoa,"Thiếu thông tin");
             else 
                {
                  int response = JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa?",
                          "Xác nhận xóa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                     if (response == JOptionPane.YES_OPTION) {
                   int i  = nccdao.xoaNhaCungCap(txtMaNCC.getText());
                   if(i != 0)
                   {JOptionPane.showMessageDialog(btnXoa,"Đã xóa");
                    showNhaCungCap(tblNhaCungCap);}         
                    else
                         JOptionPane.showMessageDialog(btnXoa,"Lỗi");
                    }
                }
                } catch (Exception e) {
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
            btnThem.setEnabled(false);
            btnXoa.setEnabled(false);
            btnLuu.setEnabled(true);
            btnThoat.setEnabled(true);
            flag = 2;
            batTXT(); 
            txtMaNCC.setEnabled(false);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
         if(flag == 1)
             {        
                 them();
                 btnThem.setEnabled(true);
                 btnXoa.setEnabled(true);
             }
             else
             {
                updateKH();
             }
          
                tblNhaCungCap.setRowSelectionAllowed(true);
        tblNhaCungCap.setColumnSelectionAllowed(true);
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        ArrayList<NhaCungCap> lstNCC = nccdao.findNhaCungCap(txtTimSDT.getText());
        String []header={"MaKH","TenKH","DiaChi","SDT","Email"};
        DefaultTableModel model = new DefaultTableModel(header,0);
        for(NhaCungCap n : lstNCC)
        {
            model.addRow(new Object[]{n.getMaNCC(),n.getTenNCC(),n.getDiaChi(),n.getSDT(),n.getEmail()});
        }
        
        tblNhaCungCap.setModel(model);
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiLaiActionPerformed
        // TODO add your handling code here:
        showNhaCungCap(tblNhaCungCap);
    }//GEN-LAST:event_btnTaiLaiActionPerformed

    private void txtTimSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimSDTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaiLai;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblNhaCungCap;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNCC;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTimSDT;
    // End of variables declaration//GEN-END:variables
}
