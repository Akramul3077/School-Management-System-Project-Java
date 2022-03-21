/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import com.sun.jndi.ldap.Connection;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AKRAMUL
 */
public class Login extends javax.swing.JFrame {

    java.sql.Connection conn = null;
    ResultSet rs = null;
    Statement st;

    private JFrame frame;

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Stencil Std", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login Page");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 100);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("User Name  :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 130, 120, 35);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Password    :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 180, 120, 37);

        User.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(User);
        User.setBounds(202, 128, 285, 40);

        Pass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(Pass);
        Pass.setBounds(202, 181, 285, 38);

        Login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Access_30px_1.png"))); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login);
        Login.setBounds(202, 240, 116, 40);

        message.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        message.setText("Click hear to Create Account");
        message.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                messageMouseClicked(evt);
            }
        });
        jPanel1.add(message);
        message.setBounds(200, 290, 240, 36);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Checked_User_Male_30px.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(490, 120, 50, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Password_30px_2.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(490, 180, 50, 38);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background Image/ak.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 650, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        String username = User.getText();
        String password = Pass.getText();
        try {
            int log = 1;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/school management", "root", "");
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("Select * from login");
            
            while (rs.next()) {
                if (rs.getString(1).equals(username) && rs.getString(2).equals(password)) {
                    log = 0;
                    break;
                }
            }
            if (log == 0) {
                CloseMe();
                dispose();
                Welcome info = new Welcome();
                info.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Worng User Name Or password !!!", "Logined System", JOptionPane.ERROR_MESSAGE);
                User.setText("");
                Pass.setText("");
                User.grabFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void CloseMe() {
        WindowEvent meClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSED);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(meClose);
    }

    /*
          String na = User.getText();
          String pa = Pass.getText();
                if (na.equals("bubt") && pa.equals("bubt")) {
                    message.setText( "You are Successfully Login");
                   dispose();
                   Welcome we = new Welcome();
                   we.setVisible(true);
                } else {
                    message.setText( "Worng Username or Password !!!");
                    User.setText("");
                    Pass.setText("");
                }
        
    }//GEN-LAST:event_LoginActionPerformed
*/
    private void messageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messageMouseClicked
        // TODO add your handling code here:
        dispose();
        CreateAccount newacc=new CreateAccount();
        newacc.setVisible(true);
    }//GEN-LAST:event_messageMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables
}