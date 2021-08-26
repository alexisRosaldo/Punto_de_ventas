/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Alexis
 */
public abstract class Factura {
    
    private int id;
    private String fechaFactura;
    private int idUsuario;
    private String listaProductos;
    private double montoTotal;


    public Factura(int id, String fechaFactura, int idUsuario, String listaProductos, double montoTotal) {
        this.id = id;
        this.fechaFactura = fechaFactura;
        this.idUsuario = idUsuario;
        this.listaProductos = listaProductos;
        this.montoTotal = montoTotal;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(String listaProductos) {
        this.listaProductos = listaProductos;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public abstract void generarFactura();

    @Override
    public String toString() {
        return "Factura: " ;
    }
}
