/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_BanGao.model;

/**
 *
 * @author Le Van
 */
public class PhieuNhap {
//    MAPN VARCHAR(8) NOT NULL,
//	MANV VARCHAR(8) NOT NULL,
//	MANCC VARCHAR(8) NOT NULL,
//	NgayNhap Date,
//	SoLuong INT,
//	ThanhTien INT,
    String MaPN;
    String MaNV;
    String MaNCC;
    String NgayNhap;
    int SoLuong;
    int ThanhTien;

    public String getMaPN() {
        return MaPN;
    }

    public void setMaPN(String MaPN) {
        this.MaPN = MaPN;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public PhieuNhap(String MaPN, String MaNV, String MaNCC, String NgayNhap, int SoLuong, int ThanhTien) {
        this.MaPN = MaPN;
        this.MaNV = MaNV;
        this.MaNCC = MaNCC;
        this.NgayNhap = NgayNhap;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
    }

    public PhieuNhap() {
    }
    
}
