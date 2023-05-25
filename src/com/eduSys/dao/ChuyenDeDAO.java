/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduSys.dao;

import com.eduSys.entity.ChuyenDe;
import com.eduSys.entity.NhanVien;
import com.eduSys.poly.utils.JdbcHalper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO T560
 */
public class ChuyenDeDAO extends EduSysDAO<ChuyenDe, String> {

    // Các câu lệnh SQL
    String INSERT_SQL = "INSERT INTO CHUYENDE(MACD,TENCD,HOCPHI,THOILUONG,HINHLOGO,MOTACD) VALUES(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE ChuyenDe SET TENCD = ?, HOCPHI = ?, THOILUONG = ?,HINHLOGO = ?,MOTACD = ? WHERE MACD = ?";
    String DELETE_SQL = "DELETE FROM ChuyenDe WHERE MACD = ?  ";
    String SELECT_ALL = "SELECT MACD,TENCD,HOCPHI,THOILUONG,HINHLOGO,MOTACD FROM CHUYENDE";
    String SELECT_BY_ID_SQL = "SELECT * FROM ChuyenDe WHERE MACD = ?";

    @Override
    public void insert(ChuyenDe cd) {
        try {
            JdbcHalper.update(INSERT_SQL, cd.getMaCD(), cd.getTenCD(), cd.getHocPhi(), cd.getThoiLuong(), cd.getHinhLogo(), cd.getMoTaChuyenDe());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Hàm sửa NV
    @Override
    public void update(ChuyenDe cd) {
        try {
            JdbcHalper.update(UPDATE_SQL, cd.getTenCD(), cd.getHocPhi(), cd.getThoiLuong(), cd.getHinhLogo(), cd.getMaCD(), cd.getMaCD());
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
    public List<ChuyenDe> selectALL() {
        return this.selectBySQL(SELECT_ALL);
    }

    @Override
    public ChuyenDe sellectById(String id) {
        List<ChuyenDe> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    // Truy vấn dữ liệu từ CSDL và biến nó thành List entity, hàm này trả về 1 listNV 
    @Override
    public List<ChuyenDe> selectBySQL(String sql, Object... args) {
        List<ChuyenDe> listCD = new ArrayList<>();
        try {
            ResultSet rs = JdbcHalper.query(sql, args);
            while (rs.next()) {
                ChuyenDe cd = new ChuyenDe();
                cd.setMaCD(rs.getString("MaCD"));
                cd.setTenCD(rs.getString("TenCD"));
                cd.setHocPhi(rs.getFloat("HocPhi"));
                cd.setThoiLuong(rs.getInt("ThoiLuong"));
                cd.setHinhLogo(rs.getString("HinhLogo"));
                cd.setMoTaChuyenDe(rs.getString("MOTACD"));

                listCD.add(cd);
            }
            rs.getStatement().getConnection().close();
            return listCD;
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

}
