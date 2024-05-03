/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_BanGao.model;

/**
 *
 * @author ADMIN
 */
public class HangGao {
   String MaHG;
   String TenHangGao;
   String MaNCC;

    public HangGao(String MaHG, String TenHangGao, String MaNCC) {
        this.MaHG = MaHG;
        this.TenHangGao = TenHangGao;
        this.MaNCC = MaNCC;
    }

    public String getMaHG() {
        return MaHG;
    }

    public void setMaHG(String MaHG) {
        this.MaHG = MaHG;
    }

    public String getTenHangGao() {
        return TenHangGao;
    }

    public void setTenHangGao(String TenHangGao) {
        this.TenHangGao = TenHangGao;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }
   
    
}
