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
            String sql = "{CALL ThemNhaCungCap(?, ?, ?, ?,?)}";
            CallableStatement stmt;
            stmt = con.getConnection().prepareCall(sql);
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
                k.setMaNCC(rs.getString("MaNCC"));
                k.setTenNCC(rs.getString("TenNCC"));
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
        con.open(); 
        CallableStatement stmt = con.getConnection().prepareCall("{CALL GetNhaCungCap}"); 
        ResultSet rs = stmt.executeQuery();
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
    public String phatsinhMaNCC() {
    String mancc = "";
    con.open();
    if (con != null) {
        String sql = "{CALL GetMaNCC()}";
        try (CallableStatement stmt = con.getConnection().prepareCall(sql)) {
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String ma = rs.getString("MaNCC");
                String so = ma.substring(3);
                try {
                    int soInt = Integer.parseInt(so);
                    if (soInt >= 0 && soInt <= 9)
                        mancc = "NCC" + "00" + (soInt + 1);
                    else if (soInt >= 10 && soInt <= 99)
                        mancc = "NCC" + "0" + (soInt + 1);
                    else
                        mancc = "NCC" + (soInt + 1);
                } catch (NumberFormatException e) {
                }
            }
        } catch (SQLException ex) {
        } finally {
            con.close();
        }
    }
    return mancc;
}

}
