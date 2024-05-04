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
    public int insertKH(KhachHang x)
    {
        int result = 0;
        try {
            Connection con = new Connection();
            con.Connect();

            // Chuẩn bị lời gọi cho stored procedure
            String sql = "CALL themKhachHang(?, ?, ?, ?, ?)";
            CallableStatement stmt = con.prepareCall(sql);

            // Truyền giá trị cho các tham số
            stmt.setString(1, x.getMaKH());
            stmt.setString(2, x.getTenKH());
            stmt.setString(3, x.getDiaChi());
            stmt.setString(4, x.getSDT());
            stmt.setString(5, x.getEmail());

            // Thực thi stored procedure và lấy số lượng bản ghi bị ảnh hưởng
            result = stmt.executeUpdate();
            
            
        }
        catch(Exception e)
        {
        }
        return result;
    }
}
