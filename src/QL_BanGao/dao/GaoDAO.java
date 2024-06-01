/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_BanGao.dao;
import QL_BanGao.model.Gao;
import java.sql.CallableStatement;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author ADMIN
 */
public class GaoDAO {

    Connectionn con = new Connectionn();
    public GaoDAO() {
    }
 
    public ArrayList<Gao> getListGao()
    {
        
        ArrayList<Gao> lsGao = new ArrayList<>();
        con.open();
        try {
            String sql = "{call xuatGao;}";
           CallableStatement stmt = con.getConnection().prepareCall(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
                Gao g = new Gao();
                g.setMAG(rs.getString("MAG"));
                g.setMALG(rs.getString("MALG"));
                g.setMaNCC(rs.getString("MaNCC"));
                g.setMota(rs.getString("Mota"));
                g.setSoLuong(rs.getInt("SoLuong"));
                g.setGiaBan(rs.getFloat("GiaBan"));
                g.setGiaNhap(rs.getFloat("GiaNhap"));
                g.setLinkImage(rs.getString("LinkImage"));
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
    public int themGao(Gao g)
    {
        int result;
        try {
            con.open();
            String sql = "{call ThemGao(?,?,?,?,?,?,?,?)}";
            CallableStatement stmt;
            stmt = con.getConnection().prepareCall(sql);
            stmt.setString(1,g.getMAG());
            stmt.setString(2,g.getMALG());
            stmt.setString(3,g.getMaNCC());
            stmt.setString(4,g.getMota());
            stmt.setInt(5,g.getSoLuong());
            stmt.setFloat(6, g.getGiaBan());
            stmt.setFloat(7, g.getGiaNhap());
            stmt.setString(8, g.getLinkImage());
           result = stmt.executeUpdate(); 
        } catch (SQLException e) {
           e.printStackTrace();
           result = 0;
        }
        con.close();
           return result;
    }
    
    public ArrayList<Gao> findG(String MaG) {
    ArrayList<Gao> listG = new ArrayList<>();
    String sql = "{CALL TimGao(?)}";
    con.open();
    try {
        CallableStatement stmt = con.getConnection().prepareCall(sql);
        stmt.setString(1,MaG);
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Gao k = new Gao();
                k.setMAG(rs.getString("MAG"));
                k.setMALG(rs.getString("MALG"));
                k.setMaNCC(rs.getString("MANCC"));
                k.setGiaBan(rs.getFloat("GiaBan"));
                k.setGiaNhap(rs.getFloat("GiaNhap"));
                k.setMota(rs.getString("MoTa"));
                k.setSoLuong(rs.getInt("SoLuong"));
                k.setLinkImage(rs.getString("LinkImage"));
                listG.add(k);
            }
        }
    } catch (SQLException e) {
    } 
        con.close(); 
    
    return listG;
}
    public String phatsinhMaG()
    {
       String mag="";
       con.open();
       if(con!=null)
       {
           String sql = "{CALL GetMaG()}";
        try (CallableStatement stmt = con.getConnection().prepareCall(sql)) {
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String ma = rs.getString("MAG");
                String so = ma.substring(1,ma.length()); 
               if(Integer.parseInt(so)>=0&&Integer.parseInt(so)<=9)
                   mag="G"+"00"+(Integer.parseInt(so)+1);
               else
                   if(Integer.parseInt(so)>=10&&Integer.parseInt(so)<=99)
                       mag="G"+"00"+(Integer.parseInt(so)+1);
                else
                   if(Integer.parseInt(so)>=100&&Integer.parseInt(so)<=999)
                       mag="G"+"0"+(Integer.parseInt(so)+1);
               else
                       mag="g"+(Integer.parseInt(so)+1);
        }
    }      catch (SQLException ex) {
               ex.printStackTrace();
           }
       }
        return mag;
   }
    public int xoaGao(String x)
    {
         int result = 0;
        CallableStatement stmt = null;
        try {
            // Mở kết nối
            con.open(); // Nếu 'con' là một đối tượng kết nối, không cần mở nó một cách tường minh
            // Chuẩn bị câu lệnh gọi thủ tục
            String sql = "{call xoaGao(?)}";
            stmt = con.getConnection().prepareCall(sql);
            stmt.setString(1, x);

            // Thực thi câu lệnh
            result = stmt.executeUpdate();

        } catch (Exception e) {
            // Xử lý lỗi
            e.printStackTrace();}
        return result;
    }
     public int updateGao(String ma,String MoTa,int sl,float gianhap,float giaban)
    {
        int result = 0;
        try {
            
            con.open();
            // Chuẩn bị lời gọi cho stored procedure
            String sql = "{CALL updateGao(?, ?, ?,?,?)}";
            CallableStatement stmt;
            stmt = con.getConnection().prepareCall(sql);
            
            // Truyền giá trị cho các tham số
            stmt.setString(1, ma);
            stmt.setString(2, MoTa);
            stmt.setInt(3, sl);
            stmt.setFloat(4, gianhap);
            stmt.setFloat(5, giaban);
           
            result = stmt.executeUpdate(); 
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        con.close();
        return result;
    }
}
