/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_BanGao.dao;

import QL_BanGao.model.NhaCungCap;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Le Van
 */
public class NhaCungCapDAO {
    public NhaCungCapDAO(){
        
    }
    Connectionn con = new Connectionn();
    public int themNhaCungCap(NhaCungCap x)
    {
        int result = 0;
        try {
            
            con.open();
            String sql = "{CALL themNhaCungCap(?, ?, ?, ?,?)}";
            CallableStatement stmt;
            stmt = con.getConnection().prepareCall(sql);
            
            // Truyền giá trị cho các tham số
            stmt.setString(1, x.getMaNCC());
            stmt.setString(2, x.getTenNCC());
            stmt.setString(3, x.getDiaChi());
            stmt.setString(4, x.getSDT());
            stmt.setString(5, x.getEmail());
            result = stmt.executeUpdate(); 
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
        if(result != 0)
        {
         System.out.println("Lỗi xảy ra khi thêm nhà cung cấp.");}
        con.close();
        return result;
    }
    public int xoaNhaCungCap(String x)
        {
        int result = 0;
        CallableStatement stmt = null;
        try {
            con.open(); 
            String sql = "{call xoaNhaCungCap(?)}";
            stmt = con.getConnection().prepareCall(sql);
            stmt.setString(1, x);
            result = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();}
        return result;
        }
    public int updateNhaCungCap(NhaCungCap x) {
    int result = 0;
    try {    
        con.open();
        String sql = "{CALL UpdateNhaCungCap(?, ?, ?, ?, ?)}";
        CallableStatement stmt;
        stmt = con.getConnection().prepareCall(sql);
        stmt.setString(1, x.getMaNCC());
        stmt.setString(2, x.getTenNCC());
        stmt.setString(3, x.getDiaChi());
        stmt.setString(4, x.getSDT()); 
        stmt.setString(5, x.getEmail());
  
        result = stmt.executeUpdate(); 
        
        if(result != 0) {
            System.out.println("Lỗi xảy ra khi cập nhật nhà cung cấp.");
        }
    } catch(SQLException e) {
        e.printStackTrace();
    } finally {
        con.close();
    }
    return result;
}

         
    public ArrayList<NhaCungCap> findNhaCungCap(String SDT) {
    ArrayList<NhaCungCap> listNCC = new ArrayList<>();
    String sql = "{CALL TimNhaCungCapBySDT(?)}";
    con.open();
    try {
        CallableStatement stmt = con.getConnection().prepareCall(sql);
        stmt.setString(1,SDT);
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                NhaCungCap k = new NhaCungCap();
                k.setMaNCC(rs.getString("MaKH"));
                k.setTenNCC(rs.getString("TenKH"));
                k.setDiaChi(rs.getString("DiaChi"));
                k.setSDT(rs.getString("SDT"));
                k.setEmail(rs.getString("Email"));
                listNCC.add(k);
            }
        }
    } catch (SQLException e) {
    } 
        con.close(); 
    
    return listNCC;
}
    public ArrayList<NhaCungCap> getListNCC() {
    ArrayList<NhaCungCap> listNCC = new ArrayList<>();
    try {
        con.open(); // Mở kết nối tới cơ sở dữ liệu
        CallableStatement stmt = con.getConnection().prepareCall("{CALL GetNhaCungCap}"); // Gọi procedure GetNhaCungCap
        ResultSet rs = stmt.executeQuery(); // Thực hiện truy vấn và nhận kết quả
        
        // Duyệt qua kết quả trả về và thêm từng nhà cung cấp vào danh sách
        while (rs.next()) {
            NhaCungCap ncc = new NhaCungCap();
            ncc.setMaNCC(rs.getString("MaNCC"));
            ncc.setTenNCC(rs.getString("TenNCC"));
            ncc.setDiaChi(rs.getString("DiaChi"));
            ncc.setSDT(rs.getString("SDT"));
            ncc.setEmail(rs.getString("Email"));
            listNCC.add(ncc);
        }
        rs.close(); // Đóng ResultSet
    } catch (SQLException e) {
        e.printStackTrace(); // In ra lỗi nếu có
    } finally {
        con.close(); // Đóng kết nối sau khi hoàn thành
    }
    return listNCC;
}
    
}
