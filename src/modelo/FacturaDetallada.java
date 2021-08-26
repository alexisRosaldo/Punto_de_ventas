/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis
 */
public class FacturaDetallada extends Factura{
    
    private String nombreCliente;
    private String descripccion;

    public FacturaDetallada(int id, String fechaFactura, int idUsuario, String listaProductos, double montoTotal, String nombreCliente, String descripccion) {
        super(id, fechaFactura, idUsuario, listaProductos, montoTotal);
        this.nombreCliente = nombreCliente;
        this.descripccion = descripccion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }
    
    @Override
    public void generarFactura() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_punto_de_ventas", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into facturadetallada values(?,?,?,?,?,?,?)");
            pst.setString(1, ("" + super.getId()).trim());
            pst.setString(2, super.getFechaFactura().trim());
            pst.setString(3, ("" + super.getIdUsuario()).trim());
            pst.setString(4, super.getListaProductos().trim());
            pst.setString(5, ("" + super.getMontoTotal()).trim());
            pst.setString(6, getNombreCliente().trim());
            pst.setString(7, getDescripccion().trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Facturacion exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo efectuar la creacion de la factura...\n"
                    + "Existe algun/algunos campos invalido...");
        }
    }
   
}
