/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_BanGao.dao;
import QL_BanGao.model.LoaiGao;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class LoaiGaoDao {

    Connectionn con = new Connectionn();
    public LoaiGaoDao() {
    }
    public ArrayList<LoaiGao> getListLG()
    {
        ArrayList<LoaiGao> LG = new ArrayList<>();
        con.open();
        try {
            String sql = "{call xuatLoaiGao}";
             CallableStatement stmt = con.getConnection().prepareCall(sql);
             ResultSet rs = stmt.executeQuery();
             while(rs.next())
             {
                 LoaiGao l = new LoaiGao();
                 l.setMaLG(rs.getString("MaLG"));
                 l.setTenLoaiGao(rs.getString("TenLoaiGao"));
                 LG.add(l);
             }
        } catch (Exception e) {
        }
        return LG;
    }
}
