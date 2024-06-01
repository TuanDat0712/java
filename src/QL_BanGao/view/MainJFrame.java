package QL_BanGao.view;

import QL_BanGao.bean.Menu;
import QL_BanGao.controller.MenuController;
import java.util.ArrayList;
import java.util.List;

public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
        setTitle("QUẢN LÝ BÁN GẠO");
        
        MenuController controller = new MenuController(jpnView);
        controller.setView(jpnTrangChu,jlbTrangChu);
        
        List<Menu>listItem = new ArrayList<>();
        listItem.add(new Menu("TrangChu", jpnTrangChu, jlbTrangChu));
        listItem.add(new Menu("Gao", jpnGao, jlbGao));
        listItem.add(new Menu("HoaDon", jpnHoaDon, jlbHoaDon));
        listItem.add(new Menu("KhachHang", jpnKhachHang, jlbKhachHang));
        listItem.add(new Menu("NhaCungCap", jpnNhaCungCap, jlbNhaCungCap));
        listItem.add(new Menu("NhanVien", jpnNhanVien, jlbNhanVien));
        listItem.add(new Menu("TaiKhoan", jpnTaiKhoan, jlbTaiKhoan));
        listItem.add(new Menu("ThongKe", jpnThongKe, jlbThongKe));
        controller.setEvent(listItem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jpnNhom = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jpnGao = new javax.swing.JPanel();
        jlbGao = new javax.swing.JLabel();
        jpnHoaDon = new javax.swing.JPanel();
        jlbHoaDon = new javax.swing.JLabel();
        jpnKhachHang = new javax.swing.JPanel();
        jlbKhachHang = new javax.swing.JLabel();
        jpnNhaCungCap = new javax.swing.JPanel();
        jlbNhaCungCap = new javax.swing.JLabel();
        jpnNhanVien = new javax.swing.JPanel();
        jlbNhanVien = new javax.swing.JLabel();
        jpnTaiKhoan = new javax.swing.JPanel();
        jlbTaiKhoan = new javax.swing.JLabel();
        jpnThongKe = new javax.swing.JPanel();
        jlbThongKe = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setBackground(new java.awt.Color(230, 247, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NHÓM 02");

        javax.swing.GroupLayout jpnNhomLayout = new javax.swing.GroupLayout(jpnNhom);
        jpnNhom.setLayout(jpnNhomLayout);
        jpnNhomLayout.setHorizontalGroup(
            jpnNhomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jpnNhomLayout.setVerticalGroup(
            jpnNhomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhomLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jlbTrangChu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTrangChu.setText("Trang Chủ");

        javax.swing.GroupLayout jpnTrangChuLayout = new javax.swing.GroupLayout(jpnTrangChu);
        jpnTrangChu.setLayout(jpnTrangChuLayout);
        jpnTrangChuLayout.setHorizontalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTrangChuLayout.setVerticalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTrangChuLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jlbTrangChu)
                .addGap(10, 10, 10))
        );

        jpnGao.setPreferredSize(new java.awt.Dimension(76, 37));

        jlbGao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbGao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbGao.setText("Gạo");

        javax.swing.GroupLayout jpnGaoLayout = new javax.swing.GroupLayout(jpnGao);
        jpnGao.setLayout(jpnGaoLayout);
        jpnGaoLayout.setHorizontalGroup(
            jpnGaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnGaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbGao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnGaoLayout.setVerticalGroup(
            jpnGaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnGaoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbGao)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jpnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnHoaDonMouseClicked(evt);
            }
        });

        jlbHoaDon.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHoaDon.setText("Hóa Đơn");

        javax.swing.GroupLayout jpnHoaDonLayout = new javax.swing.GroupLayout(jpnHoaDon);
        jpnHoaDon.setLayout(jpnHoaDonLayout);
        jpnHoaDonLayout.setHorizontalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnHoaDonLayout.setVerticalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbHoaDon)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jlbKhachHang.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbKhachHang.setText("Khách Hàng");

        javax.swing.GroupLayout jpnKhachHangLayout = new javax.swing.GroupLayout(jpnKhachHang);
        jpnKhachHang.setLayout(jpnKhachHangLayout);
        jpnKhachHangLayout.setHorizontalGroup(
            jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnKhachHangLayout.setVerticalGroup(
            jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnKhachHangLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jlbKhachHang)
                .addGap(10, 10, 10))
        );

        jlbNhaCungCap.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbNhaCungCap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbNhaCungCap.setText("Nhà Cung Cấp");

        javax.swing.GroupLayout jpnNhaCungCapLayout = new javax.swing.GroupLayout(jpnNhaCungCap);
        jpnNhaCungCap.setLayout(jpnNhaCungCapLayout);
        jpnNhaCungCapLayout.setHorizontalGroup(
            jpnNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnNhaCungCapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnNhaCungCapLayout.setVerticalGroup(
            jpnNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhaCungCapLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbNhaCungCap)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jlbNhanVien.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbNhanVien.setText("Nhân Viên");

        javax.swing.GroupLayout jpnNhanVienLayout = new javax.swing.GroupLayout(jpnNhanVien);
        jpnNhanVien.setLayout(jpnNhanVienLayout);
        jpnNhanVienLayout.setHorizontalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnNhanVienLayout.setVerticalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhanVienLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbNhanVien)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jlbTaiKhoan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTaiKhoan.setText("Tài Khoản");

        javax.swing.GroupLayout jpnTaiKhoanLayout = new javax.swing.GroupLayout(jpnTaiKhoan);
        jpnTaiKhoan.setLayout(jpnTaiKhoanLayout);
        jpnTaiKhoanLayout.setHorizontalGroup(
            jpnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTaiKhoanLayout.setVerticalGroup(
            jpnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTaiKhoanLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbTaiKhoan)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jlbThongKe.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbThongKe.setText("Thống Kê");

        javax.swing.GroupLayout jpnThongKeLayout = new javax.swing.GroupLayout(jpnThongKe);
        jpnThongKe.setLayout(jpnThongKeLayout);
        jpnThongKeLayout.setHorizontalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnThongKeLayout.setVerticalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThongKeLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jlbThongKe)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnNhom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnGao, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
            .addComponent(jpnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jpnNhom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnGao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpnHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnHoaDonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpnHoaDonMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JLabel jlbGao;
    private javax.swing.JLabel jlbHoaDon;
    private javax.swing.JLabel jlbKhachHang;
    private javax.swing.JLabel jlbNhaCungCap;
    private javax.swing.JLabel jlbNhanVien;
    private javax.swing.JLabel jlbTaiKhoan;
    private javax.swing.JLabel jlbThongKe;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JPanel jpnGao;
    private javax.swing.JPanel jpnHoaDon;
    private javax.swing.JPanel jpnKhachHang;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnNhaCungCap;
    private javax.swing.JPanel jpnNhanVien;
    private javax.swing.JPanel jpnNhom;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnTaiKhoan;
    private javax.swing.JPanel jpnThongKe;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
