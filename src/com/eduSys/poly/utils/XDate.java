/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduSys.poly.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author LENOVO T560
 */
public class XDate {

    static SimpleDateFormat formater = new SimpleDateFormat();

    // Hàm chuyển đổi chuỗi sang dạng Date
    public static Date toDate(String date, String pattern) {
        try {
            formater.applyPattern(pattern);
            return formater.parse(date);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Hàm chuyển đổi ngày giờ sang dạng chuỗi
    public static String toString(Date date, String pattern) {
        try {
            formater.applyPattern(pattern);
            return formater.format(date);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Hàm thêm ngày
    public static Date addDays(Date date, long days) {

        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;

    }

}
