/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_BanGao.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Le Van
 */
public class HoaDonBanDAO {
    public HoaDonBanDAO(){
        
    }
    
    Connectionn con = new Connectionn();
    public String phatsinhMaHoaDon() {
    String maPhieuNhap="";
       con.open();
       if(con!=null)
       {
           String sql = "{CALL GetMaHD()}";
        try (CallableStatement stmt = con.getConnection().prepareCall(sql)) {
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String ma = rs.getString("MaHD");
                String so = ma.substring(3,ma.length()); 
               if(Integer.parseInt(so)>=0&&Integer.parseInt(so)<=9)
                   maPhieuNhap="HD"+"00"+(Integer.parseInt(so)+1);
               else
                   if(Integer.parseInt(so)>=10&&Integer.parseInt(so)<=99)
                       maPhieuNhap="HD"+"0"+(Integer.parseInt(so)+1);
               else
                       maPhieuNhap="HD"+(Integer.parseInt(so)+1);
        }
    }      catch (SQLException ex) {    
           }
       }
       
        return maPhieuNhap;
}
}
