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
}
