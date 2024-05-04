/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_BanGao.dao;
import QL_BanGao.model.KhachHang;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.*;
/**
 *
 * @author ADMIN
 */
public class KhachHangDAO {

    public KhachHangDAO() {
    }
    Connectionn con = new Connectionn();
   
    public int themKH(KhachHang x)
    {
        int result = 0;
        try {
            
            con.open();

            // Chuẩn bị lời gọi cho stored procedure
            String sql = "{CALL themKhachHang(?, ?, ?, ?, ?)}o";
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
        catch(Exception e)
        {
             e.printStackTrace();
        }
        if(result != 0)
        {
         System.out.println("Lỗi xảy ra khi thêm khách hàng.");}
        return result;
    }
}
