/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_BanGao.dao;

import QL_BanGao.model.Log;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class logDAO {
    Connectionn con = new Connectionn();

    public logDAO() {
    }
   public ArrayList<Log> getListLog()
    {
        
        ArrayList<Log> lsGao = new ArrayList<>();
        con.open();
        try {
            String sql = "{call xuatLog;}";
            CallableStatement stmt = con.getConnection().prepareCall(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
                Log g = new Log();
                g.setLog_id(rs.getInt("LogID"));
                g.setMAG(rs.getString("MAG"));
                g.setGiaban(rs.getFloat("GiaBan"));
                g.setGianhap(rs.getFloat("GiaNhap"));
                g.setNgay(rs.getString("ThoiGianThucHien"));
                lsGao.add(g);
            }
            rs.close();
        stmt.close();
        } catch (Exception e) {
            System.out.println("QL_BanGao.dao.GaoDAO.getListGao()");
        }
        con.close();
        return lsGao;
    }
   
   public ArrayList<Log> findG(String MaG) {
    ArrayList<Log> listG = new ArrayList<>();
    String sql = "{CALL TimGao(?)}";
    con.open();
    try {
        CallableStatement stmt = con.getConnection().prepareCall(sql);
        stmt.setString(1,MaG);
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Log k = new Log();
                k.setLog_id(rs.getInt("LogID"));
                k.setMAG(rs.getString("MAG"));
                k.setGiaban(rs.getFloat("GiaBan"));
                k.setGianhap(rs.getFloat("GiaNhap"));
                k.setNgay(rs.getString("ThoiGianThucHien"));
                listG.add(k);
            }
        }
    } catch (SQLException e) {
    } 
        con.close(); 
    
    return listG;
}
}
