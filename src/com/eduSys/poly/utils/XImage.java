/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.poly.utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

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

    // Đưa 1 cái file vào và cất đi, hàm lưu
    public static void save(File src) {
        // Tạo file đích đến
        File dst = new File("logos", src.getName());
        //Kiểm tra file xem có tồn tại k ,nếu chưa tồn tại tạo thư mục
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdir();
        }

        try {
            //
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Hàm đọc file là hiển thị hình ảnh lên
    public static ImageIcon read(String fileName) {
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
