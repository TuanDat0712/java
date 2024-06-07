/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_BanGao.dao;
import QL_BanGao.dao.Connectionn;
import QL_BanGao.model.TaiKhoan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**

/**
 *
 * @author Le Van
 */
public class TAIKHOANDAO {
    public TAIKHOANDAO(){        
    }
    Connectionn con = new Connectionn();
    public TaiKhoan dangNhap(String tenTK, String matKhau) {
        //TaiKhoan taiKhoan = null;
        //ResultSet rs = null;
        TaiKhoan taiKhoan = null;
        try {
            con.open();
            String sql = "{CALL checkTaiKhoan(?, ?)}";
            CallableStatement stmt;
            stmt = con.getConnection().prepareCall(sql);
            stmt.setString(1, tenTK);
            stmt.setString(2, matKhau);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                taiKhoan = new TaiKhoan();
                taiKhoan.setTenTK(rs.getString("TenTK"));
                taiKhoan.setMatKhau(rs.getString("MatKhau"));
                taiKhoan.setMaNV(rs.getString("MaNV"));
                taiKhoan.setCapQuyen(rs.getInt("CapQuyen"));
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return taiKhoan;
    }
    
    public int themtk(TaiKhoan x)
    {
        int result = 0;
        try {
            
            con.open();
            // Chuẩn bị lời gọi cho stored procedure
            String sql = "{CALL ThemTaiKhoan(?, ?, ?, ?, ?)}";
            CallableStatement stmt;
            stmt = con.getConnection().prepareCall(sql);
            stmt.setString(1, x.getTenTK());
            stmt.setString(2, x.getMatKhau());
            stmt.setString(3, x.getMaNV());
            stmt.setInt(4, x.getCapQuyen());
            result = stmt.executeUpdate(); 
        }
        catch(SQLException e)
        {
        }
        if(result != 0)
        {
         System.out.println("Lỗi xảy ra khi thêm tài khoản.");}
        con.close();
        return result;
    }
    
    public ArrayList<TaiKhoan> getListTaiKhoan() {
    ArrayList<TaiKhoan> listTaiKhoan = new ArrayList<>();
    try {
        con.open(); 
        CallableStatement stmt = con.getConnection().prepareCall("{CALL GetTaiKhoans}"); 
        ResultSet rs = stmt.executeQuery(); 
       
        while (rs.next()) {
            TaiKhoan tk = new TaiKhoan();
            tk.setTenTK(rs.getString("TenTk"));
            tk.setMatKhau(rs.getString("MatKhau"));
            tk.setMaNV(rs.getString("MaNV"));
            tk.setCapQuyen(rs.getInt("CapQuyen"));
            listTaiKhoan.add(tk);
        }
        rs.close(); 
    } catch (SQLException e) {
        e.printStackTrace(); 
    } finally {
        con.close(); 
    }
    return listTaiKhoan;
    }
     public int xoaTaiKhoan(String x)
        {
        int result = 0;
        CallableStatement stmt = null;
        try {
            con.open(); 
            String sql = "{call DeleteTaiKhoan(?)}";
            stmt = con.getConnection().prepareCall(sql);
            stmt.setString(1, x);
            result = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();}
        return result;
        }
         public int updateTaiKhoan(TaiKhoan x) {
    int result = 0;
    try {    
        con.open();
        String sql = "{CALL UpdateTaiKhoan(?, ?, ?, ?)}";
        CallableStatement stmt;
        stmt = con.getConnection().prepareCall(sql);
        stmt.setString(1, x.getTenTK());
        stmt.setString(2, x.getMatKhau());
        stmt.setString(3, x.getMaNV());
        stmt.setInt(4, x.getCapQuyen()); 
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
    
}
