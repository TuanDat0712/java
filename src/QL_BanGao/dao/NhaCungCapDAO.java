/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_BanGao.dao;

import QL_BanGao.model.NhaCungCap;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Le Van
 */
public class NhaCungCapDAO {
    public NhaCungCapDAO(){
        
    }
    Connectionn con = new Connectionn();
    public int themNhaCungCap(NhaCungCap x)
    {
        int result = 0;
        try {
            
            con.open();
            // Chuẩn bị lời gọi cho stored procedure
            String sql = "{CALL themNhaCungCap(?, ?, ?, ?)}";
            CallableStatement stmt;
            stmt = con.getConnection().prepareCall(sql);
            
            // Truyền giá trị cho các tham số
            stmt.setString(1, x.getMaNCC());
            stmt.setString(2, x.getTenNCC());
            stmt.setString(3, x.getDiaChi());
            stmt.setString(5, x.getEmail());
            result = stmt.executeUpdate(); 
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
        if(result != 0)
        {
         System.out.println("Lỗi xảy ra khi thêm nhà cung cấp.");}
        con.close();
        return result;
    }
    
    public ArrayList<NhaCungCap> getListNCC() {
    ArrayList<NhaCungCap> listNCC = new ArrayList<>();
    String sql = "{CALL xuatNhaCungCap}";
    con.open();
    try {
        CallableStatement stmt = con.getConnection().prepareCall(sql);
        ResultSet rs = stmt.executeQuery(); 

        while (rs.next()) { 
            NhaCungCap k = new NhaCungCap();
            k.setMaNCC(rs.getString("MaNCC"));
            k.setTenNCC(rs.getString("TenNCC"));
            k.setDiaChi(rs.getString("DiaChi"));
            k.setEmail(rs.getString("Email"));
            listNCC.add(k);
        }
        rs.close(); 
    } catch (Exception e) {
        e.printStackTrace();
    } 
        con.close(); 
    
    return listNCC;
}
    
}
