/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduSys.dao;

import com.eduSys.entity.ChuyenDe;
import com.eduSys.entity.HocVien;
import com.eduSys.poly.utils.JdbcHalper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO T560
 */
public class HocVienDAO extends EduSysDAO<HocVien, String> {

    String INSERT_SQL = "INSERT INTO HOCVIEN(MAHV,MAKH,MANH,DIEM) VALUES(?,?,?,?)";
    String UPDATE_SQL = "UPDATE HOCVIEN SET MAKH = ?, MANH = ?, DIEM = ? WHERE MAHV = ?";
    String DELETE_SQL = "DELETE FROM HOCVIEN WHERE MAHV = ?  ";
    String SELECT_ALL = "SELECT MaHV,MaKH,MaNH,Diem FROM HOCVIEN";
    String SELECT_BY_ID_SQL = "SELECT MaHV,MaKH,Diem FROM HOCVIEN WHERE MAHV = ?";

    @Override
    public void insert(HocVien hv) {
        try {
            JdbcHalper.update(INSERT_SQL, hv.getMaHV(), hv.getMaKH(), hv.getMaNH(), hv.getDiem());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Hàm sửa NV
    @Override
    public void update(HocVien hv) {
        try {
            JdbcHalper.update(UPDATE_SQL, hv.getMaKH(), hv.getMaNH(), hv.getDiem(), hv.getMaHV());
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
    public List<HocVien> selectALL() {
        return this.selectBySQL(SELECT_ALL);
    }

    @Override
    public HocVien sellectById(String id) {
        List<HocVien> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    // Truy vấn dữ liệu từ CSDL và biến nó thành List entity, hàm này trả về 1 listNV 
    @Override
    public List<HocVien> selectBySQL(String sql, Object... args) {
        List<HocVien> listHV = new ArrayList<>();
        try {
            ResultSet rs = JdbcHalper.query(sql, args);
            while (rs.next()) {
                HocVien hv = new HocVien();
                hv.setMaHV(rs.getInt("MaHV"));
                hv.setMaKH(rs.getInt("MaKH"));
                hv.setMaNH(rs.getString("MaNH"));
                hv.setDiem(rs.getFloat("Diem"));

                listHV.add(hv);
            }
            rs.getStatement().getConnection().close();
            return listHV;
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

    public List<HocVien> selectByKhoaHoc(int maKH) {
        String sql = "SELECT * FROM HOCVIEN WHERE MAKH = ?";
        return this.selectBySQL(sql, maKH);
    }

}
