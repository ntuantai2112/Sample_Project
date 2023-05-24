/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduSys.poly.utils;

import com.eduSys.entity.NhanVien;

/**
 *
 * @author LENOVO T560
 */
public class Auth {

    public static NhanVien user = null;

    // Chức năng đăng xuất 
    public static void clear() {
        Auth.user = null;
    }

    // Chức năng ktra đăng nhập
    public static boolean isLogin() {
        return Auth.user != null;

    }

    // Chức năng kiểm tra quyền quản lý
    public static boolean isManager() {
        return Auth.isLogin() && user.isVaiTro();
    }
}
