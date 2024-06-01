/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_BanGao.model;

/**
 *
 * @author ADMIN
 */
public class Log {
    int Log_id;
    String MAG;
    float giaban;
    float gianhap;
    String Ngay;

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }
    public Log(int Log_id, String MAG, float giaban, float gianhap,String Ngay) {
        this.Log_id = Log_id;
        this.MAG = MAG;
        this.giaban = giaban;
        this.gianhap = gianhap;
        this.Ngay = Ngay;
    }

    public Log() {
    }

    public int getLog_id() {
        return Log_id;
    }

    public void setLog_id(int Log_id) {
        this.Log_id = Log_id;
    }

    public String getMAG() {
        return MAG;
    }

    public void setMAG(String MAG) {
        this.MAG = MAG;
    }

    public float getGiaban() {
        return giaban;
    }

    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }

    public float getGianhap() {
        return gianhap;
    }

    public void setGianhap(float gianhap) {
        this.gianhap = gianhap;
    }
    
}
