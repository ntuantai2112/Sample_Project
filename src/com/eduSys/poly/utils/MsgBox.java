/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduSys.poly.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO T560
 */
public class MsgBox {

    // Hàm Show Thông báo
    public static void alert(Component parent, String message) {
        JOptionPane.showMessageDialog(parent, message, "Hệ thống đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }

    // Chức năng show Confirm 
    public static boolean confirm(Component parent, String message) {
        int result = JOptionPane.showConfirmDialog(parent, message, "Hệ thống đạo tạo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }

    // Chức năng show Input 
    public static String prompt(Component parent, String message) {
        return JOptionPane.showInputDialog(parent, message, "Hệ thống đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }
}
