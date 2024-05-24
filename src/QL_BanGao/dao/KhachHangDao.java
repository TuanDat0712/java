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
    
    public int xoaKH(KhachHang x)
    {
        int result = 0;
        try {
            con.open();
            String sql = "{call xoaKhachHang(?)}";
            CallableStatement stmt;
            stmt = con.getConnection().prepareCall(sql);
            stmt.setString(1,x.getMaKH());
        } catch (Exception e) {
            
        }
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
}
