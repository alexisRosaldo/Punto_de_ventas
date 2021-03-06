/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis
 */
public class FrmEliminarUsuario extends javax.swing.JFrame {
    private int idUsuario;
    private int sesion;
    /**
     * Creates new form FrmEliminarUsuario
     */
    public FrmEliminarUsuario() {
        initComponents();
        this.setLocationRelativeTo(null); 
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                FrmFactura frmFactura = new FrmFactura(idUsuario, sesion);
                frmFactura.setVisible(true);
                dispose();
            }
        });
    }
    
     public FrmEliminarUsuario(int id, int sesion) {
      
        initComponents();
        idUsuario = id;
        this.sesion = sesion;
        this.setLocationRelativeTo(null); 
       addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                FrmFactura frmFactura = new FrmFactura(idUsuario, sesion);
                frmFactura.setVisible(true);
                dispose();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titulo = new javax.swing.JLabel();
        txt_idUsuario = new javax.swing.JTextField();
        lb_nombreUsuario1 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        lb_resultadosUsuario = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        lb_nombreUsuario2 = new javax.swing.JLabel();
        lb_pantallaAviso = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_titulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("Eliminar Usuario");
        getContentPane().add(lb_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 200, 30));

        txt_idUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txt_idUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_idUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txt_idUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_idUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 230, 40));

        lb_nombreUsuario1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_nombreUsuario1.setText("Resultados del usuario");
        getContentPane().add(lb_nombreUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 240, 30));

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imegenes Proyecto/Buscar lupa muy pequenia.png"))); // NOI18N
        btn_buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 40, 40));

        lb_resultadosUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lb_resultadosUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lb_resultadosUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 300, 40));

        btn_salir.setBackground(new java.awt.Color(255, 102, 102));
        btn_salir.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 110, 40));

        btn_eliminar.setBackground(new java.awt.Color(153, 255, 153));
        btn_eliminar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imegenes Proyecto/Eliminar basura muy peque??o.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 120, 40));

        lb_nombreUsuario2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_nombreUsuario2.setText("Ingrese el ID del usuario");
        getContentPane().add(lb_nombreUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 240, 30));

        lb_pantallaAviso.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(lb_pantallaAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 240, 30));

        jPanel1.setBackground(new java.awt.Color(105, 105, 105));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 80));

        jPanel3.setBackground(new java.awt.Color(226, 241, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 410, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idUsuarioActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_punto_de_ventas", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from usuarios where ID = ?");
            
            pst.setString(1, txt_idUsuario.getText().trim());

            pst.executeUpdate();
            this.txt_idUsuario.setText("");
            lb_pantallaAviso.setText("Eliminacion exitosa!!!");
                
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo tener acceso a la base de datos");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El ID del usuario es incorrecto");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_punto_de_ventas", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from usuarios where ID = ?");

            pst.setString(1, this.txt_idUsuario.getText().trim());

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                lb_resultadosUsuario.setText("ID:  " + rs.getString("ID") + "      Usuario:  " + rs.getString("usuario"));

            } else {
                //JOptionPane.showMessageDialog(null, "Producto no encontrado");
                lb_resultadosUsuario.setText("El ID del usuario ingresado no es v??lido!");
            }

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo tener acceso a la base de datos");
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Entrada de ID no valida");
            lb_resultadosUsuario.setText("Entrada de ID no valida");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        FrmFactura frmFactura = new FrmFactura(idUsuario, sesion);
        frmFactura.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(FrmEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEliminarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_nombreUsuario1;
    private javax.swing.JLabel lb_nombreUsuario2;
    private javax.swing.JLabel lb_pantallaAviso;
    private javax.swing.JLabel lb_resultadosUsuario;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JTextField txt_idUsuario;
    // End of variables declaration//GEN-END:variables
}
