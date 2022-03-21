/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AKRAMUL
 */
public class TeacherAdd extends javax.swing.JFrame {

    /**
     * Creates new form TeacherAdd
     */
    public TeacherAdd() {
        initComponents();
        setLocationRelativeTo(null);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Date = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        MName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Subject = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        NationalID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Degree = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Religion = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        Blood = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
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

        Date.setDateFormatString("yyyy,MM,dd");
        Date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 250, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Home_50px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        jLabel1.setFont(new java.awt.Font("Stencil Std", 1, 48)); // NOI18N
        jLabel1.setText("Add Teacher");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 11, 440, 60));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background Image/ak.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Address.setColumns(20);
        Address.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Address.setRows(5);
        jScrollPane1.setViewportView(Address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 270, 180));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ID No :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 118, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 156, -1, -1));

        ID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 115, 250, -1));

        Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 151, 250, 33));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Father Name :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 195, 135, -1));

        FName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameActionPerformed(evt);
            }
        });
        jPanel1.add(FName, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 190, 250, 33));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Mother Name :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 234, 257, -1));

        MName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNameActionPerformed(evt);
            }
        });
        jPanel1.add(MName, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 229, 250, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Designation :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 273, -1, -1));

        Subject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectActionPerformed(evt);
            }
        });
        jPanel1.add(Subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 268, 250, 33));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("National ID No :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 312, -1, -1));

        NationalID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NationalID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalIDActionPerformed(evt);
            }
        });
        jPanel1.add(NationalID, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 307, 250, 33));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Address  :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 118, -1, -1));

        Degree.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Degree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Degree-", "SSC", "HSC", "BSC", "MSC", " " }));
        jPanel1.add(Degree, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 270, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Religion :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 312, -1, -1));

        Religion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Religion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Religion -", "Islam", "Hindu", "Bodho", "Khristan", " " }));
        Religion.setName("Village"); // NOI18N
        Religion.setPreferredSize(new java.awt.Dimension(230, 28));
        Religion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReligionActionPerformed(evt);
            }
        });
        jPanel1.add(Religion, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 307, 270, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Blood Group:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 347, -1, -1));

        Blood.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Blood Group -", "A+", "A-", "AB+", "AB-", "B+", "B-", "O+", "O-", " " }));
        Blood.setName("Village"); // NOI18N
        Blood.setPreferredSize(new java.awt.Dimension(230, 28));
        Blood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodActionPerformed(evt);
            }
        });
        jPanel1.add(Blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 346, 250, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Phone");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 346, -1, -1));

        Phone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneActionPerformed(evt);
            }
        });
        jPanel1.add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 343, 270, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Date Of Birth :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 383, 135, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Gender :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 414, -1, -1));

        Male.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Male);
        Male.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Male.setText("Male");
        Male.setName("Gender"); // NOI18N
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });
        jPanel1.add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 410, -1, -1));

        Female.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Female);
        Female.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Female.setText("Female");
        Female.setName("Gender"); // NOI18N
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });
        jPanel1.add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Degree :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 377, -1, -1));

        Add.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/Add.png"))); // NOI18N
        Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel1.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 127, -1));

        Clear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/Clear.png"))); // NOI18N
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 124, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background Image/maxresdefault (1).jpg"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 890, 430));

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

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_IDActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_NameActionPerformed

    private void FNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_FNameActionPerformed

    private void MNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MNameActionPerformed

    private void SubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_SubjectActionPerformed

    private void NationalIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalIDActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_NationalIDActionPerformed

    private void ReligionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReligionActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ReligionActionPerformed

    private void BloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BloodActionPerformed

    private void PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_PhoneActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MaleActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_FemaleActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed

        ID.setText("");
        Name.setText("");
        Subject.setText("");
        FName.setText("");
        MName.setText("");
        Date.setDate(null);
        Phone.setText("");
        NationalID.setText("");
        Address.setText("");
        Religion.setSelectedIndex(0);
        Degree.setSelectedIndex(0);
        Blood.setSelectedIndex(0);
        buttonGroup1.clearSelection();

        //=============================================

    }//GEN-LAST:event_ClearActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        String male = "Male", female;
        if (Male.isSelected()) {
            male = "Male";
        }
        if (Female.isSelected()) {
            male = "Female";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String addDate = dateFormat.format(Date.getDate());

        try {
            java.sql.Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO teacher(id,name,father_name,mother_name,designation,national_id,blood,date,address,religion,phone,degree,gender)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?) ");
            ps.setString(1, ID.getText());
            ps.setString(2, Name.getText());
            ps.setString(3, FName.getText());
            ps.setString(4, MName.getText());
            ps.setString(5, Subject.getText());
            ps.setString(6, NationalID.getText());
            ps.setString(7, Blood.getSelectedItem().toString());
            ps.setString(8, addDate);
            ps.setString(9, Address.getText());
            ps.setString(10, Religion.getSelectedItem().toString());
            ps.setString(11, Phone.getText());
            ps.setString(12, Degree.getSelectedItem().toString());
            ps.setString(13, male);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Teacher Add Successful !!!!!");
            ID.setText("");
            Name.setText("");
            Subject.setText("");
            FName.setText("");
            MName.setText("");
            Date.setDate(null);
            Phone.setText("");
            NationalID.setText("");
            Address.setText("");
            Religion.setSelectedIndex(0);
            Degree.setSelectedIndex(0);
            Blood.setSelectedIndex(0);
            buttonGroup1.clearSelection();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
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
            java.util.logging.Logger.getLogger(TeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JMenuItem AddStudent;
    private javax.swing.JMenuItem AddTeachers;
    private javax.swing.JTextArea Address;
    private javax.swing.JComboBox<String> Blood;
    private javax.swing.JMenuItem ChPassword;
    private javax.swing.JButton Clear;
    private javax.swing.JMenuItem CreateAccount;
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JComboBox<String> Degree;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JTextField FName;
    private javax.swing.JRadioButton Female;
    private javax.swing.JMenu File;
    private javax.swing.JMenu Help;
    private javax.swing.JTextField ID;
    private javax.swing.JMenu Informaiton;
    private javax.swing.JTextField MName;
    private javax.swing.JMenuItem Main;
    private javax.swing.JRadioButton Male;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField NationalID;
    private javax.swing.JTextField Phone;
    private javax.swing.JComboBox<String> Religion;
    private javax.swing.JMenuItem RemoveStudent;
    private javax.swing.JMenuItem RemoveTeachers;
    private javax.swing.JMenu Students;
    private javax.swing.JMenuItem StudentsInfo;
    private javax.swing.JTextField Subject;
    private javax.swing.JMenu Teachers;
    private javax.swing.JMenuItem TeachersInfo;
    private javax.swing.JMenuItem ViewStudentList;
    private javax.swing.JMenuItem ViewTeachersList;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
