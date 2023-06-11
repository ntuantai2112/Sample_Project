/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduSys.dao;

import com.eduSys.entity.ChuyenDe;
import com.eduSys.entity.HocVien;
import com.eduSys.entity.KhoaHoc;
import com.eduSys.poly.utils.JdbcHalper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO T560
 */
public class KhoaHocDAO extends EduSysDAO<KhoaHoc, Integer> {

    String INSERT_SQL = "INSERT INTO KHOAHOC(MaKH,MACD,HOCPHI,THOILUONG,NGAYKG,GHICHU,MANV,NGAYTAO) VALUES (?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE KHOAHOC SET HOCPHI = ?, THOILUONG = ?, NGAYKG = ?,GHICHU = ?,MANV = ?,NGAYTAO = ? , MACD = ? WHERE MaKH = ?";
    String DELETE_SQL = "DELETE FROM KHOAHOC WHERE MACD = ?  ";
    String SELECT_ALL = "SELECT MAKH,THOILUONG,HOCPHI,NGAYKG,MANV,NGAYTAO FROM KHOAHOC";
    String SELECT_BY_ID_SQL = "SELECT * FROM KHOAHOC WHERE MACD = ?";

    @Override
    public void insert(KhoaHoc kh) {
        try {
            JdbcHalper.update(INSERT_SQL, kh.getMaKH(), kh.getMaCD(), kh.getHocPhi(), kh.getThoiLuong(), kh.getNgayKG(), kh.getGhiChu(), kh.getMaNV(), kh.getNgayTao());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Hàm sửa NV
    @Override
    public void update(KhoaHoc kh) {
        try {
            JdbcHalper.update(UPDATE_SQL, kh.getHocPhi(), kh.getThoiLuong(), kh.getNgayKG(), kh.getGhiChu(), kh.getMaNV(), kh.getNgayTao(), kh.getMaCD(), kh.getMaKH());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            JdbcHalper.update(DELETE_SQL, id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<KhoaHoc> selectALL() {
        return this.selectBySQL(SELECT_ALL);
    }

    @Override
    public KhoaHoc sellectById(Integer id) {
        List<KhoaHoc> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    // Truy vấn dữ liệu từ CSDL và biến nó thành List entity, hàm này trả về 1 listNV 
    @Override
    public List<KhoaHoc> selectBySQL(String sql, Object... args) {
        List<KhoaHoc> listKH = new ArrayList<>();
        try {
            ResultSet rs = JdbcHalper.query(sql, args);
            while (rs.next()) {
                KhoaHoc kh = new KhoaHoc();
                kh.setMaKH(rs.getInt("MaKH"));
                kh.setThoiLuong(rs.getInt("THOILUONG"));
                kh.setHocPhi(rs.getInt("HocPhi"));
                kh.setNgayKG(rs.getDate("NgayKG"));
                kh.setMaNV(rs.getString("MaNV"));
                kh.setNgayTao(rs.getDate("NgayTao"));

                listKH.add(kh);
            }
            rs.getStatement().getConnection().close();
            return listKH;
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }
    
     public List<KhoaHoc> selectByChuyenDe(String chuyenDe) {
         ArrayList<KhoaHoc> listKH = new ArrayList<>();
         return listKH;
//        return this.selectBySQL(SELECT_ALL);
    }

}
