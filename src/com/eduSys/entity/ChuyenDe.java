/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduSys.entity;

/**
 *
 * @author LENOVO T560
 */
public class ChuyenDe {

    private String maCD;
    private String tenCD;
    private float hocPhi;
    private Integer thoiLuong;
    private String hinhLogo;
    private String moTaChuyenDe;

    public ChuyenDe() {
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getHinhLogo() {
        return hinhLogo;
    }

    public void setHinhLogo(String hinhLogo) {
        this.hinhLogo = hinhLogo;
    }

    public String getMoTaChuyenDe() {
        return moTaChuyenDe;
    }

    public void setMoTaChuyenDe(String moTaChuyenDe) {
        this.moTaChuyenDe = moTaChuyenDe;
    }

    public ChuyenDe(String maCD, String tenCD, float hocPhi, int thoiLuong, String hinhLogo, String moTaChuyenDe) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.hinhLogo = hinhLogo;
        this.moTaChuyenDe = moTaChuyenDe;
    }

    @Override
    public String toString() {
        return this.tenCD;
    }

    @Override
    public boolean equals(Object obj) {
        ChuyenDe other = (ChuyenDe) obj;
        return other.getMaCD().endsWith(this.getMaCD());
    }

}
