/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduSys.entity;

import java.util.Date;

/**
 *
 * @author LENOVO T560
 */
public class KhoaHoc {

    private Integer maKH;
    private String maCD;
    private float hocPhi;
    private Integer thoiLuong;
    private Date ngayKG;
    private String ghiChu;
    private String maNV;
    private Date ngayTao;

    public KhoaHoc() {
    }

    public KhoaHoc(Integer maKH, String maCD, float hocPhi, Integer thoiLuong, Date ngayKG, String ghiChu, String maNV, Date ngayTao) {
        this.maKH = maKH;
        this.maCD = maCD;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.ngayKG = ngayKG;
        this.ghiChu = ghiChu;
        this.maNV = maNV;
        this.ngayTao = ngayTao;
    }

    public Integer getMaKH() {
        return maKH;
    }

    public void setMaKH(Integer maKH) {
        this.maKH = maKH;
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public Integer getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(Integer thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public Date getNgayKG() {
        return ngayKG;
    }

    public void setNgayKG(Date ngayKG) {
        this.ngayKG = ngayKG;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
    
    
   
    
}
