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
public class ChiTietHoaDon {
    String MaCTHD;
    String MaHD;
    String MaG;
    float DonGia;
    int SoLuong;
    String DonVi;
    float ThanhTien;

    public ChiTietHoaDon() {
    }

    public String getMaCTHD() {
        return MaCTHD;
    }

    public void setMaCTHD(String MaCTHD) {
        this.MaCTHD = MaCTHD;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaG() {
        return MaG;
    }

    public void setMaG(String MaG) {
        this.MaG = MaG;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }

    public float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public ChiTietHoaDon(String MaCTHD, String MaHD, String MaG, float DonGia, int SoLuong, String DonVi, float ThanhTien) {
        this.MaCTHD = MaCTHD;
        this.MaHD = MaHD;
        this.MaG = MaG;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.DonVi = DonVi;
        this.ThanhTien = ThanhTien;
    }
}
