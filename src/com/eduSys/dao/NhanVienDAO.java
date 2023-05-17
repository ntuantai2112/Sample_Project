/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduSys.dao;

import com.eduSys.entity.NhanVien;
import com.eduSys.poly.utils.JdbcHalper;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO T560
 */
public class NhanVienDAO extends EduSysDAO<NhanVien, String> {

    String INSERT_SQL = "INSERT INTO nhanvien (MaNV, MatKhau, HoTen, Vaitro) VALUES (?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE nhanvien SET MatKhau = ?, HoTen = ?, Vaitro = ? WHERE MaNV = ?";
    String DELETE_SQL = "DELETE FROM nhanvien WHERE MaNV = ?  ";
    String SELECT_ALL = "SELECT * FROM nhanvien";
    String SELECT_BY_ID_SQL = "SELECT * FROM nhanvien WHERE MANV = ?";
    
    // Hàm thêm nhân viên
    @Override
    public void insert(NhanVien entity) {
        try {
            JdbcHalper.update(INSERT_SQL, entity.getMaNV(), entity.getHoTen(), entity.getMatKhau(), entity.isVaiTro());
        } catch (SQLException ex) {
             ex.printStackTrace();
        }
    }
    // Hàm sửa NV
    @Override
    public void update(NhanVien entity) {
        try {
            JdbcHalper.update(UPDATE_SQL, entity.getHoTen(), entity.getMatKhau(), entity.isVaiTro(), entity.getMaNV());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            JdbcHalper.update(DELETE_SQL, id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<NhanVien> selectALL() {
        return this.selectBySQL(SELECT_ALL);
    }

    @Override
    public NhanVien sellectById(String id) {
        List<NhanVien> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    // Truy vấn dữ liệu từ CSDL và biến nó thành List entity, hàm này trả về 1 listNV 
    @Override
    public List<NhanVien> selectBySQL(String sql, Object... args) {
        List<NhanVien> listNV = new ArrayList<>();
        try {
            ResultSet rs = JdbcHalper.query(sql, args);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setVaiTro(rs.getBoolean("VaiTro"));

                listNV.add(nv);
            }
            rs.getStatement().getConnection().close();
            return listNV;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
