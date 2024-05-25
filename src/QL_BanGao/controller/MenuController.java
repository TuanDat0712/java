package QL_BanGao.controller;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import QL_BanGao.view.TrangChuJPanel;
import QL_BanGao.view.KhachHangJPanel;
import QL_BanGao.bean.Menu;
import QL_BanGao.view.GaoJPanel;
import QL_BanGao.view.HoaDonBanJPanel;
import QL_BanGao.view.HoaDonNhap;
import QL_BanGao.view.NhaCungCapJPanel;
import QL_BanGao.view.NhanVienJPanel;
import QL_BanGao.view.TaiKhoanJPanel;
import QL_BanGao.view.ThongKeJPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
public class MenuController {
    private JPanel root;
    private String kindSelected = "";
    private List<Menu> listItem = null;
    public MenuController (JPanel jpnRoot){
        this.root = jpnRoot;
    }
    public void setView(JPanel jpnItem, JLabel jbnItem){
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(128, 215, 255));
        jbnItem.setBackground(new Color(128, 215, 255));
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChuJPanel());
        root.validate();
        root.repaint(); 
    }
    public void setEvent(List<Menu> listItem){
        this.listItem = listItem;
        for (Menu item : listItem) {
           item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    class LabelEvent implements MouseListener {

      private JPanel node;
      private String kind;

      private JPanel jpnItem;
      private JLabel jlbItem;

      public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
           this.kind = kind;
           this.jpnItem = jpnItem;
           this.jlbItem = jlbItem;
      }

      @Override
      public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new TrangChuJPanel();
                    break;
                case "Gao":
                    node = new GaoJPanel();
                    break;
                case "HoaDon":
                    node = new HoaDonBanJPanel();
                    break;
                case "KhachHang":
                    node = new KhachHangJPanel();
                    break;
                case "NhaCungCap":
                    node = new NhaCungCapJPanel();
                    break;
                case "NhanVien":
                    node = new NhanVienJPanel();
                    break;
                case "TaiKhoan":
                    node = new TaiKhoanJPanel();
                    break;
                case "NhapHang":
                    node = new HoaDonNhap();
                    break;
                case "ThongKe":
                    node = new ThongKeJPanel();
                    break;
                // more
                default:
                    node = new TrangChuJPanel();
                    break;
           }
           root.removeAll();
           root.setLayout(new BorderLayout());
           root.add(node);
           root.validate();
           root.repaint();
           setChangeBackground(kind);
      }

      @Override
      public void mousePressed(MouseEvent e) {
           kindSelected = kind;
           jpnItem.setBackground(new Color(255, 230, 249));
           jlbItem.setBackground(new Color(255, 230, 249));
      }
      @Override
      public void mouseReleased(MouseEvent e) {

      }
      @Override
      public void mouseEntered(MouseEvent e) {
          jpnItem.setBackground(new Color(225, 225, 234));
          jlbItem.setBackground(new Color(225, 225, 234));
      }
      @Override
      public void mouseExited(MouseEvent e) {
          if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(225, 225, 234));
                jlbItem.setBackground(new Color(225, 225, 234));
          }
      }
    }
    private void setChangeBackground(String kind){
        for (Menu item : listItem) {
           if(item.getKind().equalsIgnoreCase(kind)){
               item.getJpn().setBackground(new Color(128, 215, 255));
               item.getJlb().setBackground(new Color(128, 215, 255));
           }else{
               item.getJpn().setBackground(new Color(225, 225, 234));
               item.getJlb().setBackground(new Color(225, 225, 234));
           }
        }
    }
}