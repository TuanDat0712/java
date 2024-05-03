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
            String sql = "Execute themKhachHang @MaKH = ?, @TenKH = ?,@DiaChi = ?,@SDT = ?,@Email =?";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
            pst.setString(1,x.getMaKH());
            pst.setString(2, x.getTenKH());
            
            
        }
        catch(Exception e)
        {
        }
        return result;
    }
}
