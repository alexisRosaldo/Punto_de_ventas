/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Factura;
import modelo.FacturaDetallada;
import modelo.FacturaNormal;

/**
 *
 * @author Alexis
 */
public class FrmVisualizarFacturaDetallada extends javax.swing.JFrame {
    private int idUsuario;
    private int sesion;
    ArrayList <FacturaDetallada> listaFacturasDet =  new ArrayList <FacturaDetallada>();
    /**
     * Creates new form FrmVisualizarFacturaDetallada
     */
    public FrmVisualizarFacturaDetallada() {
        initComponents();
        this.setLocationRelativeTo(null);
        tb_facturas.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 18));
        recuperarBaseDeDatosProducto();
        inicializaTabla(tb_facturas);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                FrmFactura frmFactura = new FrmFactura(idUsuario, sesion);
                frmFactura.setVisible(true);
                dispose();
            }
        });
    }
    
    public FrmVisualizarFacturaDetallada(int id, int sesion) {
        initComponents();
        idUsuario = id;
        this.sesion = sesion;
        this.setLocationRelativeTo(null);
        tb_facturas.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 18));
        recuperarBaseDeDatosProducto();
        inicializaTabla(tb_facturas);

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

        panel_fondo1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_facturas = new javax.swing.JTable();
        btn_salir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lb_titulo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_fondo1.setBackground(new java.awt.Color(225, 205, 160));

        tb_facturas.setBackground(new java.awt.Color(204, 255, 153));
        tb_facturas.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tb_facturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_facturas.setRowHeight(20);
        jScrollPane1.setViewportView(tb_facturas);

        btn_salir.setBackground(new java.awt.Color(247, 101, 67));
        btn_salir.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_fondo1Layout = new javax.swing.GroupLayout(panel_fondo1);
        panel_fondo1.setLayout(panel_fondo1Layout);
        panel_fondo1Layout.setHorizontalGroup(
            panel_fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fondo1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panel_fondo1Layout.setVerticalGroup(
            panel_fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fondo1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(panel_fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1120, 400));

        jPanel3.setBackground(new java.awt.Color(105, 105, 105));

        lb_titulo2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lb_titulo2.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo2.setText("Lista de facturas detalladas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(lb_titulo2)
                .addContainerGap(404, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lb_titulo2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FrmFactura frmFactura = new FrmFactura(idUsuario, sesion);
        frmFactura.setVisible(true);
        frmFactura.setVisible(true);
    }//GEN-LAST:event_btn_salirActionPerformed
    
    public void recuperarBaseDeDatosProducto() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_punto_de_ventas", "root", "");
            PreparedStatement pst = cn.prepareStatement("SELECT * FROM facturadetallada");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int idFactura = rs.getInt("ID");
                String fechaFactura = rs.getString("fecha");
                int idUsuario = rs.getInt("IDUsuario");
                String listaProductos = rs.getString("listaProductos");
                double monto = rs.getDouble("monto");
                String nombreComprador = rs.getString("nombreComprador");
                String descripccion = rs.getString("descripccion");
                FacturaDetallada facturaDetallada = new FacturaDetallada(idFactura, fechaFactura, idUsuario, listaProductos, monto, nombreComprador, descripccion);
                listaFacturasDet.add(facturaDetallada);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo tener acceso a la base de datos");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Entrada de ID no valida");
        }
    }
    
    public void inicializaTabla(JTable tabla) {

        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        
        titulos.add("ID factura");
        titulos.add("Fecha facturación");
        titulos.add("ID usuario");
        titulos.add("Lista productos");
        titulos.add("Monto total");
        titulos.add("Nombre Cliente");
        titulos.add("Descripcción");
        
        for (int i = 0; i < listaFacturasDet.size(); i++) {
            Vector<Object> row = new Vector<Object>();
            if (listaFacturasDet.get(i) instanceof FacturaDetallada) {
                FacturaDetallada facturaDetallada = (FacturaDetallada) listaFacturasDet.get(i);
                row.add(facturaDetallada.getId());
                row.add(facturaDetallada.getFechaFactura());
                row.add(facturaDetallada.getIdUsuario());
                row.add(facturaDetallada.getListaProductos());
                row.add(facturaDetallada.getMontoTotal());
                row.add(facturaDetallada.getNombreCliente());
                row.add(facturaDetallada.getDescripccion());
            }
            data.add(row);
        }
        tb_facturas.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 18));
        
        DefaultTableModel modelo = new DefaultTableModel(data, titulos);
        tabla.setPreferredScrollableViewportSize(new Dimension(450, 63));
        tabla.setFillsViewportHeight(true);
        tabla.setModel(modelo);

        
    }
    
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
            java.util.logging.Logger.getLogger(FrmVisualizarFacturaDetallada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarFacturaDetallada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarFacturaDetallada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarFacturaDetallada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVisualizarFacturaDetallada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_titulo2;
    private javax.swing.JPanel panel_fondo1;
    private javax.swing.JTable tb_facturas;
    // End of variables declaration//GEN-END:variables
}