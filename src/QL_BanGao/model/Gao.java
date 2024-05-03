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
    String DacDiemBenNgoai;
    String DoThom;
    String TinhChatCom;
    int SoLuong;
    float GiaBan;
    float GiaNhap;
    String MaHG;
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

    public String getDacDiemBenNgoai() {
        return DacDiemBenNgoai;
    }

    public void setDacDiemBenNgoai(String DacDiemBenNgoai) {
        this.DacDiemBenNgoai = DacDiemBenNgoai;
    }

    public String getDoThom() {
        return DoThom;
    }

    public void setDoThom(String DoThom) {
        this.DoThom = DoThom;
    }

    public String getTinhChatCom() {
        return TinhChatCom;
    }

    public void setTinhChatCom(String TinhChatCom) {
        this.TinhChatCom = TinhChatCom;
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

    public String getMaHG() {
        return MaHG;
    }

    public void setMaHG(String MaHG) {
        this.MaHG = MaHG;
    }

    public String getLinkImage() {
        return LinkImage;
    }

    public void setLinkImage(String LinkImage) {
        this.LinkImage = LinkImage;
    }
    
    public Gao(String MAG, String MALG, String DacDiemBenNgoai, String DoThom, String TinhChatCom, int SoLuong, float GiaBan, float GiaNhap, String MaHG, String LinkImage) {
        this.MAG = MAG;
        this.MALG = MALG;
        this.DacDiemBenNgoai = DacDiemBenNgoai;
        this.DoThom = DoThom;
        this.TinhChatCom = TinhChatCom;
        this.SoLuong = SoLuong;
        this.GiaBan = GiaBan;
        this.GiaNhap = GiaNhap;
        this.MaHG = MaHG;
        this.LinkImage = LinkImage;
    }
}
