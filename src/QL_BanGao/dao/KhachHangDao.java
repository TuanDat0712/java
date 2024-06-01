/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_BanGao.dao;
import QL_BanGao.model.KhachHang;
import java.sql.CallableStatement;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author ADMIN
 */
public class KhachHangDao {
    Connectionn con = new Connectionn();
    public KhachHangDao() {
    }
    public int themKH(KhachHang x)
    {
        int result = 0;
        try {
            
            con.open();
            // Chuẩn bị lời gọi cho stored procedure
            String sql = "{CALL themKhachHang(?, ?, ?, ?, ?)}";
            CallableStatement stmt;
            stmt = con.getConnection().prepareCall(sql);
            
            // Truyền giá trị cho các tham số
            stmt.setString(1, x.getMaKH());
            stmt.setString(2, x.getTenKH());
            stmt.setString(3, x.getDiaChi());
            stmt.setString(4, x.getSDT());
            stmt.setString(5, x.getEmail());

            result = stmt.executeUpdate(); 
        }
        catch(SQLException e)
        {
        }
        if(result != 0)
        {
         System.out.println("Lỗi xảy ra khi thêm khách hàng.");}
        con.close();
        return result;
    }
    
     public int updateKH(String ma,String ten,String diachi)
    {
        int result = 0;
        try {
            
            con.open();
            // Chuẩn bị lời gọi cho stored procedure
            String sql = "{CALL updateKhachHang(?, ?, ?)}";
            CallableStatement stmt;
            stmt = con.getConnection().prepareCall(sql);
            
            // Truyền giá trị cho các tham số
            stmt.setString(1, ma);
            stmt.setString(2, ten);
            stmt.setString(3, diachi);
            result = stmt.executeUpdate(); 
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        con.close();
        return result;
    }
        public int xoaKH(String x)
        {
        int result = 0;
        CallableStatement stmt = null;
        try {
            // Mở kết nối
            con.open(); // Nếu 'con' là một đối tượng kết nối, không cần mở nó một cách tường minh
            // Chuẩn bị câu lệnh gọi thủ tục
            String sql = "{call xoaKhachHang(?)}";
            stmt = con.getConnection().prepareCall(sql);
            stmt.setString(1, x);

            // Thực thi câu lệnh
            result = stmt.executeUpdate();

        } catch (Exception e) {
            // Xử lý lỗi
            e.printStackTrace();}
        return result;
        }
    
    public ArrayList<KhachHang> getListKH() {
    ArrayList<KhachHang> listKh = new ArrayList<>();
    String sql = "{CALL xuatKhachHang}";
    con.open();
    try {
        CallableStatement stmt = con.getConnection().prepareCall(sql);
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                KhachHang k = new KhachHang();
                k.setMaKH(rs.getString("MaKH"));
                k.setTenKH(rs.getString("TenKH"));
                k.setDiaChi(rs.getString("DiaChi"));
                k.setSDT(rs.getString("SDT"));
                k.setEmail(rs.getString("Email"));
                listKh.add(k);
            }
        }
    } catch (SQLException e) {
    } 
        con.close(); 
    
    return listKh;
}
    
    
    public ArrayList<KhachHang> findKH(String SDT) {
    ArrayList<KhachHang> listKh = new ArrayList<>();
    String sql = "{CALL TimKhachHangTheoSDTLike(?)}";
    con.open();
    try {
        CallableStatement stmt = con.getConnection().prepareCall(sql);
        stmt.setString(1,SDT);
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                KhachHang k = new KhachHang();
                k.setMaKH(rs.getString("MaKH"));
                k.setTenKH(rs.getString("TenKH"));
                k.setDiaChi(rs.getString("DiaChi"));
                k.setSDT(rs.getString("SDT"));
                k.setEmail(rs.getString("Email"));
                listKh.add(k);
            }
        }
    } catch (SQLException e) {
    } 
        con.close(); 
    
    return listKh;
}
    
    
    public String phatsinhMaKH()
   {
       String makh="";
       con.open();
       if(con!=null)
       {
           String sql = "{CALL GetMaKH()}";
        try (CallableStatement stmt = con.getConnection().prepareCall(sql)) {
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String ma = rs.getString("MaKH");
                String so = ma.substring(2,ma.length()); 
               if(Integer.parseInt(so)>=0&&Integer.parseInt(so)<=9)
                   makh="KH"+"00"+(Integer.parseInt(so)+1);
               else
                   if(Integer.parseInt(so)>=10&&Integer.parseInt(so)<=99)
                       makh="KH"+"0"+(Integer.parseInt(so)+1);
               else
                       makh="KH"+(Integer.parseInt(so)+1);
        }
    }      catch (SQLException ex) {    
           }
       }
       
        return makh;
   }
    
    
}


