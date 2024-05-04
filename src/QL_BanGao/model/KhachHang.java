/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_BanGao.model;

import java.awt.List;
import java.util.ArrayList;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    
    
    public KhachHang()
    {       
    };
    public KhachHang(String MaKH, String TenKH, String DiaChi, String SDT, String Email) {
      
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.Email = Email;
    }
    String MaKH;
    String TenKH;
    String DiaChi;
    String SDT;
    String Email;
    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
