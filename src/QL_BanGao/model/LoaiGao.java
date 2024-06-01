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
public class LoaiGao {

    public LoaiGao() {
    }
    
    String MaLG;
    String TenLoaiGao;

    public LoaiGao(String MaLG, String TenLoaiGao) {
        this.MaLG = MaLG;
        this.TenLoaiGao = TenLoaiGao;
    }

    public String getMaLG() {
        return MaLG;
    }

    public void setMaLG(String MaLG) {
        this.MaLG = MaLG;
    }

    public String getTenLoaiGao() {
        return TenLoaiGao;
    }

    public void setTenLoaiGao(String TenLoaiGao) {
        this.TenLoaiGao = TenLoaiGao;
    } 
}
