/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.poly.utils;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author LENOVO T560
 */
public class XImage {

    // Hàm lấy icon của ứng dụng
    public static Image getAppIcon() {
        URL url = XImage.class.getResource("/com/eduSys/File_Hinh_Anh/logo_nen.png");
        return new ImageIcon(url).getImage();

    }
}
