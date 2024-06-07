/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_BanGao.dao;

import QL_BanGao.model.NhanVien;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Le Van
 */
public class NhanVienDAO {
    public NhanVienDAO(){
    }
    Connectionn con = new Connectionn();
    public ArrayList<NhanVien> getListNV() {
    ArrayList<NhanVien> listNV = new ArrayList<>();
    try {
        con.open(); 
        CallableStatement stmt = con.getConnection().prepareCall("{CALL getNhanVien}"); 
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setTenNV(rs.getString("TenNV"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setNgayVaoLam(rs.getDate("NgayVaoLam"));
                nv.setLuong(rs.getInt("Luong"));
                nv.setChucVu(rs.getString("ChucVu"));
                nv.setCCCD(rs.getString("CCCD"));
                nv.setSDT(rs.getString("SDT"));
                nv.setEmail(rs.getString("Email"));
                listNV.add(nv);
        }
        rs.close(); 
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        con.close(); 
    }        
    return listNV;
}

}
