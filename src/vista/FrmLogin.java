/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Alexis
 */
public class FrmLogin extends javax.swing.JFrame {
    private int id;
    
    FrmFactura frmFactura;
    //public static final int id_sesionUsuario;
    /**
     * Creates new form FrmLogin
     */
    
    public FrmLogin(int id) {
        this.id = id;       
        initComponents();
        this.setLocationRelativeTo(null); 
    }
    
    public FrmLogin() {
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btn_salir1 = new javax.swing.JButton();
        lb_imagenID = new javax.swing.JLabel();
        lb_confirmacionAcceso = new javax.swing.JLabel();
        lb_ID = new javax.swing.JLabel();
        txt_idUsuario = new javax.swing.JTextField();
        lb_imagenContrasenia = new javax.swing.JLabel();
        lb_contraseña = new javax.swing.JLabel();
        passwordField_Contrasenia = new javax.swing.JPasswordField();
        btn_salir = new javax.swing.JButton();
        btn_acceder = new javax.swing.JButton();
        lb_titulo = new javax.swing.JLabel();
        comboBox_tipoUsuario = new javax.swing.JComboBox<>();
        panel_header = new javax.swing.JPanel();
        panel_body = new javax.swing.JPanel();

        jLabel3.setText("jLabel1");

        btn_salir1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_salir1.setText("Salir");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_imagenID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imegenes Proyecto/desconocido.png"))); // NOI18N
        getContentPane().add(lb_imagenID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        lb_confirmacionAcceso.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(lb_confirmacionAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 360, 53));

        lb_ID.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_ID.setText("Ingrese su ID de usuario");
        getContentPane().add(lb_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, 44));

        txt_idUsuario.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(txt_idUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 120, 43));

        lb_imagenContrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imegenes Proyecto/contrasena.png"))); // NOI18N
        getContentPane().add(lb_imagenContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, 75));

        lb_contraseña.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_contraseña.setText("Ingrese su contraseña");
        getContentPane().add(lb_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, 44));

        passwordField_Contrasenia.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(passwordField_Contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 230, 44));

        btn_salir.setBackground(new java.awt.Color(255, 102, 102));
        btn_salir.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 400, 170, 42));

        btn_acceder.setBackground(new java.awt.Color(153, 255, 153));
        btn_acceder.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_acceder.setText("Entrar");
        btn_acceder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_accederActionPerformed(evt);
            }
        });
        getContentPane().add(btn_acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 150, 42));

        lb_titulo.setBackground(new java.awt.Color(255, 255, 255));
        lb_titulo.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("Login");
        getContentPane().add(lb_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        comboBox_tipoUsuario.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        comboBox_tipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Admin" }));
        comboBox_tipoUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(comboBox_tipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 100, 40));

        panel_header.setBackground(new java.awt.Color(105, 105, 105));
        getContentPane().add(panel_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 120));

        panel_body.setBackground(new java.awt.Color(228, 249, 224));
        getContentPane().add(panel_body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 510, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_accederActionPerformed
        String contrasenia = passwordField_Contrasenia.getText().trim();
        String id_usuario = txt_idUsuario.getText().trim();
        int sesion = comboBox_tipoUsuario.getSelectedIndex();
        //JOptionPane.showMessageDialog(null, sesion);
        if (comboBox_tipoUsuario.getSelectedIndex() == 0) {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_punto_de_ventas", "root", "");
                PreparedStatement pst = cn.prepareStatement("select * from usuarios where ID = ? and contrasenia = ?");

                pst.setString(1, txt_idUsuario.getText().trim());
                pst.setString(2, passwordField_Contrasenia.getText().trim());

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    String idCorrecto = rs.getString("ID");
                    String contraseniaCorrecta = rs.getString("contrasenia");
                    String nombreUsuario = rs.getString("usuario");
                    int id_sesionUsuario = Integer.parseInt(idCorrecto);
                    
                    Usuario usuarioNormal = new Usuario(id_sesionUsuario, nombreUsuario, contraseniaCorrecta);
                    
                    frmFactura = new FrmFactura(id_sesionUsuario, sesion);
                    frmFactura.setVisible(true);
                    this.dispose();
                } else {
                    lb_confirmacionAcceso.setText("El usuario o contraseña no son correctos");
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo tener acceso a la base de datos");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo establecer conexion con la base de datos");
            }

        } else if (comboBox_tipoUsuario.getSelectedIndex() == 1) {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_punto_de_ventas", "root", "");
                PreparedStatement pst = cn.prepareStatement("select * from usuarioAdministrador where ID = ? and contrasenia = ?");

                pst.setString(1, txt_idUsuario.getText().trim());
                pst.setString(2, passwordField_Contrasenia.getText().trim());

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    String idCorrecto = rs.getString("ID");
                    String contraseniaCorrecta = rs.getString("contrasenia");
                    String nombreUsuario = rs.getString("usuario");
                    int id_sesionUsuario = Integer.parseInt(idCorrecto);
                    
                    Usuario usuarioNormal = new Usuario((id_sesionUsuario), nombreUsuario, contraseniaCorrecta);
                    
                    frmFactura = new FrmFactura(id_sesionUsuario, sesion);
                    frmFactura.setVisible(true);
                    this.dispose();
                } else {
                    lb_confirmacionAcceso.setText("El usuario o contraseña no son correctos");
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo tener acceso a la base de datos");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo establecer conexion con la base de datos");
            }
        }


       
    }//GEN-LAST:event_btn_accederActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acceder;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_salir1;
    private javax.swing.JComboBox<String> comboBox_tipoUsuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lb_ID;
    private javax.swing.JLabel lb_confirmacionAcceso;
    private javax.swing.JLabel lb_contraseña;
    private javax.swing.JLabel lb_imagenContrasenia;
    private javax.swing.JLabel lb_imagenID;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPanel panel_body;
    private javax.swing.JPanel panel_header;
    private javax.swing.JPasswordField passwordField_Contrasenia;
    private javax.swing.JTextField txt_idUsuario;
    // End of variables declaration//GEN-END:variables
}