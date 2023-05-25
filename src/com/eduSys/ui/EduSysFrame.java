/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.eduSys.ui;

import com.eduSys.entity.NhanVien;
import com.eduSys.entity.ThongKe;
import com.eduSys.poly.utils.Auth;
import com.eduSys.poly.utils.MsgBox;
import com.edusys.poly.utils.XImage;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author LENOVO T560
 */
public class EduSysFrame extends javax.swing.JFrame {

    /**
     * Creates new form EduSysFrame
     */
    public EduSysFrame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jToolBar2 = new javax.swing.JToolBar();
        btnLog_Out = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnEnd = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btnThematic = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnLearner = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnCourse = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnStudent = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnInstruct = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mniLogin = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        mniLog_out = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        minChane_Password = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        mniEnd = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniThematic = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        mniCourse = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        mniLearner = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        mniStudent = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        mniEmployee = new javax.swing.JMenuItem();
        mniTranscrip = new javax.swing.JMenu();
        mni_Transcript = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        mniNumber_Learner = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        mniThemetic_Point = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        mniRevenue = new javax.swing.JMenuItem();
        mniUser_Manual = new javax.swing.JMenu();
        mni_Instruct = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        mniProduct_Introduction = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ QUẢN LÝ ĐÀO TẠO");

        jToolBar2.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar2.setRollover(true);
        jToolBar2.setMargin(new java.awt.Insets(0, 20, 0, 20));

        btnLog_Out.setBackground(new java.awt.Color(204, 204, 204));
        btnLog_Out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/logout (1).png"))); // NOI18N
        btnLog_Out.setText("Đăng Xuất");
        btnLog_Out.setFocusable(false);
        btnLog_Out.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLog_Out.setMargin(new java.awt.Insets(0, 10, 0, 10));
        btnLog_Out.setMaximumSize(new java.awt.Dimension(90, 46));
        btnLog_Out.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLog_Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLog_OutActionPerformed(evt);
            }
        });
        jToolBar2.add(btnLog_Out);
        jToolBar2.add(jSeparator5);

        btnEnd.setBackground(new java.awt.Color(204, 204, 204));
        btnEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/stop.png"))); // NOI18N
        btnEnd.setText("Kết Thúc");
        btnEnd.setFocusable(false);
        btnEnd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnd.setMargin(new java.awt.Insets(0, 18, 0, 18));
        btnEnd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndActionPerformed(evt);
            }
        });
        jToolBar2.add(btnEnd);
        jToolBar2.add(jSeparator9);

        btnThematic.setBackground(new java.awt.Color(204, 204, 204));
        btnThematic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/book-stack.png"))); // NOI18N
        btnThematic.setText("Chuyên Đề");
        btnThematic.setFocusable(false);
        btnThematic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThematic.setMargin(new java.awt.Insets(0, 18, 0, 18));
        btnThematic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThematic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThematicActionPerformed(evt);
            }
        });
        jToolBar2.add(btnThematic);
        jToolBar2.add(jSeparator2);

        btnLearner.setBackground(new java.awt.Color(204, 204, 204));
        btnLearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/meeting.png"))); // NOI18N
        btnLearner.setText("Người Học");
        btnLearner.setFocusable(false);
        btnLearner.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLearner.setMargin(new java.awt.Insets(0, 18, 0, 18));
        btnLearner.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLearnerActionPerformed(evt);
            }
        });
        jToolBar2.add(btnLearner);
        jToolBar2.add(jSeparator8);

        btnCourse.setBackground(new java.awt.Color(204, 204, 204));
        btnCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/online-course.png"))); // NOI18N
        btnCourse.setText("Khóa học");
        btnCourse.setFocusable(false);
        btnCourse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCourse.setMargin(new java.awt.Insets(0, 18, 0, 18));
        btnCourse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseActionPerformed(evt);
            }
        });
        jToolBar2.add(btnCourse);
        jToolBar2.add(jSeparator7);

        btnStudent.setBackground(new java.awt.Color(204, 204, 204));
        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/graduated.png"))); // NOI18N
        btnStudent.setText("Học viên");
        btnStudent.setFocusable(false);
        btnStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStudent.setMargin(new java.awt.Insets(0, 18, 0, 18));
        btnStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        jToolBar2.add(btnStudent);
        jToolBar2.add(jSeparator4);

        btnInstruct.setBackground(new java.awt.Color(204, 204, 204));
        btnInstruct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/planet-earth.png"))); // NOI18N
        btnInstruct.setText("Hướng Dẫn");
        btnInstruct.setFocusable(false);
        btnInstruct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInstruct.setMargin(new java.awt.Insets(0, 18, 0, 18));
        btnInstruct.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInstruct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructActionPerformed(evt);
            }
        });
        jToolBar2.add(btnInstruct);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/letter-i.png"))); // NOI18N
        jLabel2.setText("Hệ quản lí đào tạo");

        lblClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/clock.png"))); // NOI18N
        lblClock.setText(" 08:00 PM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 595, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(lblClock))
                .addGap(14, 14, 14))
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/book.png"))); // NOI18N
        jLabel4.setOpaque(true);

        jMenuBar1.setMaximumSize(new java.awt.Dimension(120, 32768));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(120, 23));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(120, 23));

        mniLogin.setText("Hệ Thống");
        mniLogin.setMargin(new java.awt.Insets(6, 10, 6, 5));

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/key.png"))); // NOI18N
        jMenuItem3.setText("Đăng Nhập");
        jMenuItem3.setMargin(new java.awt.Insets(6, 10, 6, 5));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mniLogin.add(jMenuItem3);
        mniLogin.add(jSeparator10);

        mniLog_out.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniLog_out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/logout (1).png"))); // NOI18N
        mniLog_out.setText("Đăng Xuất");
        mniLog_out.setMargin(new java.awt.Insets(6, 10, 6, 5));
        mniLog_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLog_outActionPerformed(evt);
            }
        });
        mniLogin.add(mniLog_out);
        mniLogin.add(jSeparator1);

        minChane_Password.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        minChane_Password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/repost.png"))); // NOI18N
        minChane_Password.setText("Đổi Mật Khẩu");
        minChane_Password.setMargin(new java.awt.Insets(6, 10, 6, 5));
        minChane_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minChane_PasswordActionPerformed(evt);
            }
        });
        mniLogin.add(minChane_Password);
        mniLogin.add(jSeparator11);

        mniEnd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/stop.png"))); // NOI18N
        mniEnd.setText("Kết Thúc");
        mniEnd.setMargin(new java.awt.Insets(6, 10, 6, 5));
        mniEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEndActionPerformed(evt);
            }
        });
        mniLogin.add(mniEnd);

        jMenuBar1.add(mniLogin);

        jMenu2.setText("Quản lý");
        jMenu2.setMargin(new java.awt.Insets(6, 8, 6, 8));

        mniThematic.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniThematic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/book-stack.png"))); // NOI18N
        mniThematic.setText("Chuyên Đề");
        mniThematic.setMargin(new java.awt.Insets(6, 8, 6, 8));
        mniThematic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThematicActionPerformed(evt);
            }
        });
        jMenu2.add(mniThematic);
        jMenu2.add(jSeparator12);

        mniCourse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/online-course.png"))); // NOI18N
        mniCourse.setText("Khóa Học");
        mniCourse.setMargin(new java.awt.Insets(6, 8, 6, 8));
        mniCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCourseActionPerformed(evt);
            }
        });
        jMenu2.add(mniCourse);
        jMenu2.add(jSeparator13);

        mniLearner.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniLearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/meeting.png"))); // NOI18N
        mniLearner.setText("Người Học");
        mniLearner.setMargin(new java.awt.Insets(6, 8, 6, 8));
        mniLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLearnerActionPerformed(evt);
            }
        });
        jMenu2.add(mniLearner);
        jMenu2.add(jSeparator14);

        mniStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/graduated.png"))); // NOI18N
        mniStudent.setText("Học Viên");
        mniStudent.setMargin(new java.awt.Insets(6, 8, 6, 8));
        mniStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniStudentActionPerformed(evt);
            }
        });
        jMenu2.add(mniStudent);
        jMenu2.add(jSeparator15);

        mniEmployee.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/division.png"))); // NOI18N
        mniEmployee.setText("Nhân Viên");
        mniEmployee.setMargin(new java.awt.Insets(6, 8, 6, 8));
        mniEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEmployeeActionPerformed(evt);
            }
        });
        jMenu2.add(mniEmployee);

        jMenuBar1.add(jMenu2);

        mniTranscrip.setText("Thống Kê");
        mniTranscrip.setMargin(new java.awt.Insets(5, 20, 5, 20));

        mni_Transcript.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mni_Transcript.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/transcript.png"))); // NOI18N
        mni_Transcript.setText("Bảng Điểm");
        mni_Transcript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_TranscriptActionPerformed(evt);
            }
        });
        mniTranscrip.add(mni_Transcript);
        mniTranscrip.add(jSeparator16);

        mniNumber_Learner.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniNumber_Learner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/division.png"))); // NOI18N
        mniNumber_Learner.setText("Lượng Người Học");
        mniNumber_Learner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNumber_LearnerActionPerformed(evt);
            }
        });
        mniTranscrip.add(mniNumber_Learner);
        mniTranscrip.add(jSeparator17);

        mniThemetic_Point.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniThemetic_Point.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/growth.png"))); // NOI18N
        mniThemetic_Point.setText("Điểm Chuyên Đề");
        mniThemetic_Point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThemetic_PointActionPerformed(evt);
            }
        });
        mniTranscrip.add(mniThemetic_Point);
        mniTranscrip.add(jSeparator18);

        mniRevenue.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniRevenue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/dollar-symbol.png"))); // NOI18N
        mniRevenue.setText("Doanh Thu");
        mniRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRevenueActionPerformed(evt);
            }
        });
        mniTranscrip.add(mniRevenue);

        jMenuBar1.add(mniTranscrip);

        mniUser_Manual.setText("Trợ Giúp");
        mniUser_Manual.setMargin(new java.awt.Insets(5, 8, 5, 8));

        mni_Instruct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_Instruct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/planet-earth.png"))); // NOI18N
        mni_Instruct.setText("Hướng Dẫn Sử Dụng");
        mni_Instruct.setMargin(new java.awt.Insets(5, 8, 5, 8));
        mni_Instruct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_InstructActionPerformed(evt);
            }
        });
        mniUser_Manual.add(mni_Instruct);
        mniUser_Manual.add(jSeparator19);

        mniProduct_Introduction.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniProduct_Introduction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/File_Hinh_Anh/house.png"))); // NOI18N
        mniProduct_Introduction.setText("Giới Thiệu Sản Phẩm");
        mniProduct_Introduction.setMargin(new java.awt.Insets(5, 8, 5, 8));
        mniProduct_Introduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniProduct_IntroductionActionPerformed(evt);
            }
        });
        mniUser_Manual.add(mniProduct_Introduction);

        jMenuBar1.add(mniUser_Manual);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Bút chức năng đổi mật khẩu
    private void minChane_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minChane_PasswordActionPerformed
        openDoiMatKhau();
    }//GEN-LAST:event_minChane_PasswordActionPerformed

    private void mniEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEndActionPerformed
        ketThuc();
    }//GEN-LAST:event_mniEndActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    // Nút chức năng đăng xuất
    private void mniLog_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLog_outActionPerformed
        dangXuat();
    }//GEN-LAST:event_mniLog_outActionPerformed

    // Nút chức năng mở chuyên đề
    private void mniThematicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThematicActionPerformed
        openChuyenDe();
    }//GEN-LAST:event_mniThematicActionPerformed
    // Nút chức năng mở Khóa học
    private void mniCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCourseActionPerformed
        openKhoaHoc();
    }//GEN-LAST:event_mniCourseActionPerformed
    // Nút chức năng mở người học
    private void mniLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLearnerActionPerformed
        openNguoiHoc();
    }//GEN-LAST:event_mniLearnerActionPerformed
    // Nút chức năng mở học viên
    private void mniStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniStudentActionPerformed
        openHocVien();
    }//GEN-LAST:event_mniStudentActionPerformed
    // Nút chức năng mở nhân viên
    private void mniEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEmployeeActionPerformed
        openNhanVien();
    }//GEN-LAST:event_mniEmployeeActionPerformed

    private void mni_TranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_TranscriptActionPerformed
        new ThongKeJDiolog().selectTab(0);
    }//GEN-LAST:event_mni_TranscriptActionPerformed

    private void mniNumber_LearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNumber_LearnerActionPerformed
         new ThongKeJDiolog().selectTab(1);
    }//GEN-LAST:event_mniNumber_LearnerActionPerformed

    private void mniThemetic_PointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThemetic_PointActionPerformed
         new ThongKeJDiolog().selectTab(2);
    }//GEN-LAST:event_mniThemetic_PointActionPerformed

    private void mniRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRevenueActionPerformed
         new ThongKeJDiolog().selectTab(3);
    }//GEN-LAST:event_mniRevenueActionPerformed

    private void mni_InstructActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_InstructActionPerformed
        openHuongDan();
    }//GEN-LAST:event_mni_InstructActionPerformed

    private void mniProduct_IntroductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniProduct_IntroductionActionPerformed
        openGioiThieu();
    }//GEN-LAST:event_mniProduct_IntroductionActionPerformed
    
    private void btnLog_OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLog_OutActionPerformed
        // TODO add your handling code here:
        dangXuat();
    }//GEN-LAST:event_btnLog_OutActionPerformed

    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed
        // TODO add your handling code here:
        ketThuc();
    }//GEN-LAST:event_btnEndActionPerformed

    private void btnThematicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThematicActionPerformed
        // TODO add your handling code here:
        openChuyenDe();
    }//GEN-LAST:event_btnThematicActionPerformed

    private void btnLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLearnerActionPerformed
        // TODO add your handling code here:
        openNguoiHoc();
    }//GEN-LAST:event_btnLearnerActionPerformed

    private void btnCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseActionPerformed
        // TODO add your handling code here:
        openKhoaHoc();
    }//GEN-LAST:event_btnCourseActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        // TODO add your handling code here:
        openHocVien();
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnInstructActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstructActionPerformed
        // TODO add your handling code here:
        openHuongDan();
    }//GEN-LAST:event_btnInstructActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EduSysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EduSysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EduSysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EduSysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EduSysFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourse;
    private javax.swing.JButton btnEnd;
    private javax.swing.JButton btnInstruct;
    private javax.swing.JButton btnLearner;
    private javax.swing.JButton btnLog_Out;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnThematic;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblClock;
    private javax.swing.JMenuItem minChane_Password;
    private javax.swing.JMenuItem mniCourse;
    private javax.swing.JMenuItem mniEmployee;
    private javax.swing.JMenuItem mniEnd;
    private javax.swing.JMenuItem mniLearner;
    private javax.swing.JMenuItem mniLog_out;
    private javax.swing.JMenu mniLogin;
    private javax.swing.JMenuItem mniNumber_Learner;
    private javax.swing.JMenuItem mniProduct_Introduction;
    private javax.swing.JMenuItem mniRevenue;
    private javax.swing.JMenuItem mniStudent;
    private javax.swing.JMenuItem mniThematic;
    private javax.swing.JMenuItem mniThemetic_Point;
    private javax.swing.JMenu mniTranscrip;
    private javax.swing.JMenu mniUser_Manual;
    private javax.swing.JMenuItem mni_Instruct;
    private javax.swing.JMenuItem mni_Transcript;
    // End of variables declaration//GEN-END:variables

    // Hàm khởi tạo khi chạy
    private void init() {
        setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        new ChaoJDialog(this, true).setVisible(true);
        new Login(this, true).setVisible(true);
        startDongHo();
        
    }

    // Hàm chạy đồng  hồ
    private void startDongHo() {
        // Lấy thời gian hệ thống hiển thị lên trên màn hình
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                SimpleDateFormat format = new SimpleDateFormat(" hh:mm:ss a");
                String text = format.format(now);
                lblClock.setText(text);
                
            }
        }).start();
    }

    // Hàm mở đổi mật khẩu
    private void openDoiMatKhau() {
        if (Auth.isLogin()) {
            new DoiMatKhau().setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    // Hàm  đăng xuất - chức năng đăng xuất
    private void dangXuat() {
        Auth.clear();
        this.dispose();
        new Login(this, true).setVisible(true);
    }

    // Hàm  kết thúc - chức năng kết thúc
    private void ketThuc() {
        if (MsgBox.confirm(this, "Bạn có chắc chắn muốn thoát không ?")) {
            System.exit(0);
        }
    }
    // Hàm open Nhân Viên

    private void openNhanVien() {
        if (Auth.isLogin()) {
            new QuanLyNhanVien().setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập vào hệ thống!");
        }
        
    }
    // Hàm open Khóa học

    private void openKhoaHoc() {
        
        if (Auth.isLogin()) {
            new QuanLyKhoaHoc().setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập vào hệ thống!");
        }
    }
    // Hàm open Chuyên Đề

    private void openChuyenDe() {
        
        if (Auth.isLogin()) {
            new QuanLyChuyenDe().setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập vào hệ thống!");
        }
        
    }
    // Hàm open Người Học

    private void openNguoiHoc() {
        
        if (Auth.isLogin()) {
            new QuanLyNguoiHoc(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập vào hệ thống!");
        }
    }
    // Hàm open Học Viên

    private void openHocVien() {
        
        if (Auth.isLogin()) {
            new QuanLyHocVien().setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập vào hệ thống!");
        }
    }
    // Hàm open Thống Kê

    private void openThongKe(int index) {
        if (Auth.isLogin()) {
            if (index == 3 && !Auth.isManager()) {
                MsgBox.alert(this, "Bạn không có quyền xem thông tin doanh thu");
            } else {
                ThongKeJDiolog tkwin = new ThongKeJDiolog();
                tkwin.setVisible(true);
                tkwin.selectTab(index);
            }
            
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
        
    }
    // Hàm open Giới thiệu

    private void openGioiThieu() {
        new ChaoJDialog(this, true).setVisible(true);
    }
    // Hàm open Hướng dẫn

    private void openHuongDan() {
        try {
            Desktop.getDesktop().browse(new File("help/index.html").toURI());
        } catch (Exception e) {
            MsgBox.alert(this, "Không tìm thấy file hướng dẫn!");
        }
        
    }
}
