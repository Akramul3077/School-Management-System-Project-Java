/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import com.sun.jndi.ldap.Connection;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.security.acl.GroupImpl;

/**
 *
 * @author AKRAMUL
 */
public class StudentList extends javax.swing.JFrame {

    java.sql.Connection con = null;
    ResultSet rs = null;
    Statement st;

    private JFrame frame;

    /**
     * Creates new form StudentList
     */
    public StudentList() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    private void Update_Table() {
        try {
            java.sql.Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("select * from student");

            String sql = "select * from student";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            Student_Info.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    public java.sql.Connection getConnection() {
        java.sql.Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/school management", "root", "");
            //JOptionPane.showMessageDialog(null, "Connected");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null, "Not Connected");
            return null;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Class = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        section = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        session = new javax.swing.JComboBox<>();
        Add = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Student_Info = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Main = new javax.swing.JMenuItem();
        CreateAccount = new javax.swing.JMenuItem();
        ChPassword = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Students = new javax.swing.JMenu();
        AddStudent = new javax.swing.JMenuItem();
        RemoveStudent = new javax.swing.JMenuItem();
        ViewStudentList = new javax.swing.JMenuItem();
        Teachers = new javax.swing.JMenu();
        AddTeachers = new javax.swing.JMenuItem();
        RemoveTeachers = new javax.swing.JMenuItem();
        ViewTeachersList = new javax.swing.JMenuItem();
        Informaiton = new javax.swing.JMenu();
        StudentsInfo = new javax.swing.JMenuItem();
        TeachersInfo = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Home_50px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        jLabel1.setFont(new java.awt.Font("Stencil Std", 1, 48)); // NOI18N
        jLabel1.setText("Students List");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 11, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background Image/ak.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Class :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 112, -1, -1));

        Class.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Class -", "Class 1", "Class 2", "Class 3", "Class 4", "Class 5", "Class 6", "Class 7", "Class 8", "Class 9", "Class 10" }));
        Class.setName("Class"); // NOI18N
        jPanel1.add(Class, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 106, 228, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Section :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 147, -1, -1));

        section.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        section.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Section-", "1", "2", "3", "4" }));
        jPanel1.add(section, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 141, 228, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Session :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 189, -1, -1));

        session.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        session.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Session-", "2019", "2018", "2017", "2016", "2015" }));
        jPanel1.add(session, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 183, 228, -1));

        Add.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/View.png"))); // NOI18N
        Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel1.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 229, 123, -1));

        Clear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/Clear.png"))); // NOI18N
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 229, 118, -1));

        Student_Info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Roll", "Name", "Father Name", "Mother Name", "Phone", "Distric", "Upazila", "Post", "Village", "Religion", "Class", "Section", "Session", "Gender", "Date of Birth", "Blood Group"
            }
        ));
        jScrollPane1.setViewportView(Student_Info);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 89, 560, 440));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background Image/maxresdefault (1).jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 890, 430));

        File.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Settings_30px.png"))); // NOI18N
        File.setText("File");
        File.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileActionPerformed(evt);
            }
        });

        Main.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Home_30px_2.png"))); // NOI18N
        Main.setText("Home");
        Main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainActionPerformed(evt);
            }
        });
        File.add(Main);

        CreateAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CreateAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Checked_User_Male_30px.png"))); // NOI18N
        CreateAccount.setText("Create Account");
        CreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountActionPerformed(evt);
            }
        });
        File.add(CreateAccount);

        ChPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ChPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Denied_30px_1.png"))); // NOI18N
        ChPassword.setText("Delete User");
        ChPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChPasswordActionPerformed(evt);
            }
        });
        File.add(ChPassword);

        Exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Shutdown_30px.png"))); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        MenuBar.add(File);

        Students.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Students_30px.png"))); // NOI18N
        Students.setText("Students");
        Students.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentsActionPerformed(evt);
            }
        });

        AddStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Add_User_Male_30px.png"))); // NOI18N
        AddStudent.setText("Add Student");
        AddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentActionPerformed(evt);
            }
        });
        Students.add(AddStudent);

        RemoveStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RemoveStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Denied_30px.png"))); // NOI18N
        RemoveStudent.setText("Remove Student");
        RemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveStudentActionPerformed(evt);
            }
        });
        Students.add(RemoveStudent);

        ViewStudentList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewStudentList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_User_Group_30px.png"))); // NOI18N
        ViewStudentList.setText("View Student List");
        ViewStudentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewStudentListActionPerformed(evt);
            }
        });
        Students.add(ViewStudentList);

        MenuBar.add(Students);

        Teachers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Classroom_30px.png"))); // NOI18N
        Teachers.setText("Teachers");
        Teachers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        AddTeachers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddTeachers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_School_Director_30px.png"))); // NOI18N
        AddTeachers.setText("Add Teachers");
        AddTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTeachersActionPerformed(evt);
            }
        });
        Teachers.add(AddTeachers);

        RemoveTeachers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RemoveTeachers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Man_face_30px.png"))); // NOI18N
        RemoveTeachers.setText("Remove Teachers");
        RemoveTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTeachersActionPerformed(evt);
            }
        });
        Teachers.add(RemoveTeachers);

        ViewTeachersList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewTeachersList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Conference_30px.png"))); // NOI18N
        ViewTeachersList.setText("View Teachers List");
        ViewTeachersList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTeachersListActionPerformed(evt);
            }
        });
        Teachers.add(ViewTeachersList);

        MenuBar.add(Teachers);

        Informaiton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_More_Info_30px.png"))); // NOI18N
        Informaiton.setText("Information");
        Informaiton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        StudentsInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StudentsInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_User_Group_30px.png"))); // NOI18N
        StudentsInfo.setText("Students");
        StudentsInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentsInfoActionPerformed(evt);
            }
        });
        Informaiton.add(StudentsInfo);

        TeachersInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TeachersInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Conference_30px.png"))); // NOI18N
        TeachersInfo.setText("Teachers");
        TeachersInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeachersInfoActionPerformed(evt);
            }
        });
        Informaiton.add(TeachersInfo);

        MenuBar.add(Informaiton);

        Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Help_30px.png"))); // NOI18N
        Help.setText("Help");
        Help.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MenuBar.add(Help);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        session.setSelectedIndex(0);
        section.setSelectedIndex(0);
        Class.setSelectedIndex(0);
        Student_Info.setVisible(false);


    }//GEN-LAST:event_ClearActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        Student_Info.setVisible(true);
        Update_Table();
    }//GEN-LAST:event_AddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        Home framemain = new Home();
        framemain.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainActionPerformed
        dispose();
        Home framemain = new Home();
        framemain.setVisible(true);
    }//GEN-LAST:event_MainActionPerformed

    private void CreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountActionPerformed
        dispose();
        CreateAccount framecacc = new CreateAccount();
        framecacc.setVisible(true);
    }//GEN-LAST:event_CreateAccountActionPerformed

    private void ChPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChPasswordActionPerformed
        dispose();
        ChangePassword framecpass = new ChangePassword();
        framecpass.setVisible(true);
    }//GEN-LAST:event_ChPasswordActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileActionPerformed

    }//GEN-LAST:event_FileActionPerformed

    private void AddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentActionPerformed
        dispose();
        StudentAdd frameadds = new StudentAdd();
        frameadds.setVisible(true);
    }//GEN-LAST:event_AddStudentActionPerformed

    private void RemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveStudentActionPerformed
        dispose();
        StudentRemove frameRemove = new StudentRemove();
        frameRemove.setVisible(true);
    }//GEN-LAST:event_RemoveStudentActionPerformed

    private void ViewStudentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewStudentListActionPerformed
        dispose();
        StudentList framelist = new StudentList();
        framelist.setVisible(true);
    }//GEN-LAST:event_ViewStudentListActionPerformed

    private void StudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentsActionPerformed

    private void AddTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTeachersActionPerformed
        dispose();
        TeacherAdd frameaddT = new TeacherAdd();
        frameaddT.setVisible(true);
    }//GEN-LAST:event_AddTeachersActionPerformed

    private void RemoveTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTeachersActionPerformed
        dispose();
        TeacherRemove frameremove = new TeacherRemove();
        frameremove.setVisible(true);
    }//GEN-LAST:event_RemoveTeachersActionPerformed

    private void ViewTeachersListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTeachersListActionPerformed
        dispose();
        TeacherList frameList = new TeacherList();
        frameList.setVisible(true);
    }//GEN-LAST:event_ViewTeachersListActionPerformed

    private void StudentsInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentsInfoActionPerformed
        dispose();
        StudentInfo framesinfo = new StudentInfo();
        framesinfo.setVisible(true);
    }//GEN-LAST:event_StudentsInfoActionPerformed

    private void TeachersInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeachersInfoActionPerformed
        dispose();
        TeacherInfo frameInfo = new TeacherInfo();
        frameInfo.setVisible(true);
    }//GEN-LAST:event_TeachersInfoActionPerformed

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
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JMenuItem AddStudent;
    private javax.swing.JMenuItem AddTeachers;
    private javax.swing.JMenuItem ChPassword;
    private javax.swing.JComboBox<String> Class;
    private javax.swing.JButton Clear;
    private javax.swing.JMenuItem CreateAccount;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File;
    private javax.swing.JMenu Help;
    private javax.swing.JMenu Informaiton;
    private javax.swing.JMenuItem Main;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem RemoveStudent;
    private javax.swing.JMenuItem RemoveTeachers;
    private javax.swing.JTable Student_Info;
    private javax.swing.JMenu Students;
    private javax.swing.JMenuItem StudentsInfo;
    private javax.swing.JMenu Teachers;
    private javax.swing.JMenuItem TeachersInfo;
    private javax.swing.JMenuItem ViewStudentList;
    private javax.swing.JMenuItem ViewTeachersList;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> section;
    private javax.swing.JComboBox<String> session;
    // End of variables declaration//GEN-END:variables
}