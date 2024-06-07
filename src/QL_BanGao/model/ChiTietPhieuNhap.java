/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_BanGao.model;

/**
 *
 * @author Le Van
 */
public class ChiTietPhieuNhap {
//    MACTPN VARCHAR(8) NOT NULL,
//	MAPN VARCHAR(8) NOT NULL,
//	MAG VARCHAR(8) NOT NULL,
//	SoLuong INT,
//	ThanhTien INT
    String MaCTPN;
    String MaPN;
    String MaG;
    int SoLuong;
    int giaNhap;
    int ThanTien;

    public String getMaCTPN() {
        return MaCTPN;
    }

    public void setMaCTPN(String MaCTPN) {
        this.MaCTPN = MaCTPN;
    }

    public String getMaPN() {
        return MaPN;
    }

    public void setMaPN(String MaPN) {
        this.MaPN = MaPN;
    }

    public String getMaG() {
        return MaG;
    }

    public void setMaG(String MaG) {
        this.MaG = MaG;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getThanTien() {
        return ThanTien;
    }

    public void setThanTien(int ThanTien) {
        this.ThanTien = ThanTien;
    }

    public ChiTietPhieuNhap(String MaCTPN, String MaPN, String MaG, int SoLuong, int giaNhap, int ThanTien) {
        this.MaCTPN = MaCTPN;
        this.MaPN = MaPN;
        this.MaG = MaG;
        this.SoLuong = SoLuong;
        this.giaNhap = giaNhap;
        this.ThanTien = ThanTien;
    }

    public ChiTietPhieuNhap() {
    }

    
    
}
