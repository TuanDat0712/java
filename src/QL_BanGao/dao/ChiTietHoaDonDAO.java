/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_BanGao.dao;

import QL_BanGao.model.HoaDonBan;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Le Van
 */
public class ChiTietHoaDonDAO {
    Connectionn con = new Connectionn();
    public ArrayList<HoaDonBan> getListChiTietHoaDonBan() {
    ArrayList<HoaDonBan> listChiTietHoaDonBan = new ArrayList<>();
    try {
        con.open(); 
        CallableStatement stmt = con.getConnection().prepareCall("{CALL GetChiTietHoaDonBan}"); 
        ResultSet rs = stmt.executeQuery(); 
        while (rs.next()) {
            HoaDonBan chiTietHoaDonBan = new HoaDonBan();
            chiTietHoaDonBan.setMaCTHD(rs.getString("MaCTHD"));
            chiTietHoaDonBan.setMaHD(rs.getString("MaHD"));
            chiTietHoaDonBan.setMaG(rs.getString("MaG"));
            chiTietHoaDonBan.setDonGia(rs.getFloat("DonGia"));
            chiTietHoaDonBan.setSoLuong(rs.getInt("SoLuong"));
            chiTietHoaDonBan.setDonVi(rs.getString("DonVi"));
            chiTietHoaDonBan.setThanhTien(rs.getFloat("ThanhTien"));
            listChiTietHoaDonBan.add(chiTietHoaDonBan);
        }
        rs.close(); 
    } catch (SQLException e) {
        e.printStackTrace(); 
    } finally {
    }
    return listChiTietHoaDonBan;
}

}
