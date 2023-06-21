/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduSys.dao;

import com.eduSys.entity.KhoaHoc;
import com.eduSys.entity.NguoiHoc;
import com.eduSys.poly.utils.JdbcHalper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO T560
 */
public class NguoiHocDAO extends EduSysDAO<NguoiHoc, String> {

    String INSERT_SQL = "INSERT INTO NGUOIHOC(MANH,HOTEN,NGAYSINH,GIOITINH,SDT,EMAIL,GHICHU,MANV,NGAYDK)VALUES(?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NGUOIHOC SET HOTEN = ?, NGAYSINH = ?, GIOITINH = ?,SDT = ?,EMAIL = ?,GHICHU = ?,MANV = ?,NGAYDK = ? WHERE MANH = ?";
    String DELETE_SQL = "DELETE FROM NGUOIHOC WHERE MANH = ?  ";
    String SELECT_ALL = "SELECT MANH,HOTEN,NGAYSINH,GIOITINH,SDT,EMAIL,GHICHU,MANV,NGAYDK FROM NGUOIHOC";
    String SELECT_BY_ID_SQL = "SELECT HOTEN,NGAYSINH,GIOITINH,SDT,EMAIL,GHICHU,MANV,NGAYDK FROM NGUOIHOC WHERE MANH = ?";

    @Override
    public void insert(NguoiHoc nh) {
        try {
            JdbcHalper.update(INSERT_SQL, nh.getMaNH(), nh.getHoTen(), nh.getNgaySinh(), nh.isGioiTinh(), nh.getSoDT(), nh.getEmail(), nh.getGhiChu(), nh.getMaNV(), nh.getNgayDk());
        } catch (SQLException ex) {
            // ex.printStackTrace();
        }
    }

    // Hàm sửa NV
    @Override
    public void update(NguoiHoc nh) {
        try {
            JdbcHalper.update(UPDATE_SQL, nh.getHoTen(), nh.getNgaySinh(), nh.isGioiTinh(), nh.getSoDT(), nh.getEmail(), nh.getGhiChu(), nh.getMaNV(), nh.getNgayDk());
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
    public List<NguoiHoc> selectALL() {
        return this.selectBySQL(SELECT_ALL);
    }

    @Override
    public NguoiHoc sellectById(String id) {
        List<NguoiHoc> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    // Truy vấn dữ liệu từ CSDL và biến nó thành List entity, hàm này trả về 1 listNV 
    @Override
    public List<NguoiHoc> selectBySQL(String sql, Object... args) { 
        List<NguoiHoc> listNH = new ArrayList<>();
        try {
            ResultSet rs = JdbcHalper.query(sql, args);
            while (rs.next()) {
                NguoiHoc nh = new NguoiHoc();
                nh.setHoTen(rs.getString("HoTen"));
                nh.setNgaySinh(rs.getDate("NgaySinh"));
                nh.setGioiTinh(rs.getBoolean("GIOITINH"));
                nh.setSoDT(rs.getString("SDT"));
                nh.setEmail(rs.getString("Email"));
                nh.setGhiChu(rs.getString("GhiChu"));
                nh.setMaNV(rs.getString("MaNV"));
                nh.setNgayDk(rs.getDate("NgayDK"));
                nh.setMaNH(rs.getString("MANH"));

                listNH.add(nh);
            }
            rs.getStatement().getConnection().close();
            return listNH;
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

    public List<NguoiHoc> selectByKeyWord(String keyword) {
        String sql = "SELECT MANH,HOTEN,NGAYSINH,GIOITINH,SDT,EMAIL,GHICHU,MANV,NGAYDK FROM NGUOIHOC WHERE HOTEN LIKE ?";
        return this.selectBySQL(sql, "%" + keyword + "%");
    }

    public List<NguoiHoc> selectNotInCourse(int maKH, String keyword) {
        String sql = "SELECT * FROM NGUOIHOC \n"
                + "WHERE HOTEN LIKE ? AND \n"
                + "MANH NOT IN(SELECT MANH FROM HOCVIEN WHERE MAKH = ?)";
        return this.selectBySQL(sql, "%" + keyword + "%", maKH);
    }

}
