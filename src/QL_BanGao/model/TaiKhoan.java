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
public class TaiKhoan {
    String TenTK;
    String MatKhau;
    String MaNV;
    int CapQuyen;

    public TaiKhoan(String TenTK, String MatKhau, String MaNV, int CapQuyen) {
        this.TenTK = TenTK;
        this.MatKhau = MatKhau;
        this.MaNV = MaNV;
        this.CapQuyen = CapQuyen;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public int getCapQuyen() {
        return CapQuyen;
    }

    public void setCapQuyen(int CapQuyen) {
        this.CapQuyen = CapQuyen;
    }
    
    
}
