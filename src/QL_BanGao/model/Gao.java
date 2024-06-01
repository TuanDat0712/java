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
public class Gao {
    
    String MAG;
    String  MALG;
    String MaNCC;
    String Mota;
    int SoLuong;
    float GiaBan;
    float GiaNhap;
    String LinkImage;

    public String getMAG() {
        return MAG;
    }

    public void setMAG(String MAG) {
        this.MAG = MAG;
    }

    public String getMALG() {
        return MALG;
    }

    public void setMALG(String MALG) {
        this.MALG = MALG;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    

   

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(float GiaBan) {
        this.GiaBan = GiaBan;
    }

    public float getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(float GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public String getLinkImage() {
        return LinkImage;
    }

    public void setLinkImage(String LinkImage) {
        this.LinkImage = LinkImage;
    }

    public Gao(String MAG, String MALG, String MaNCC, String MoTa, int SoLuong, float GiaBan, float GiaNhap, String LinkImage) {
        this.MAG = MAG;
        this.MALG = MALG;
        this.MaNCC = MaNCC;
        this.Mota = MoTa;
        this.SoLuong = SoLuong;
        this.GiaBan = GiaBan;
        this.GiaNhap = GiaNhap;
        this.LinkImage = LinkImage;
    }

    public Gao() {
    }
}
