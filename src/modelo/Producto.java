/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alexis
 */
public class Producto implements Monto{
    
    private String contenidoNeto;
    
    /*
        public Abarrotes(int id, String nombre, double precio, double cantidad, String contenidoNeto) {
        super(id, nombre, precio, cantidad);
        this.contenidoNeto = contenidoNeto;
    }
    */

    
    private int id;
    private String nombre;
    private double precio;
    private double cantidad;

    public Producto(int id, String nombre, double precio, double cantidad, String contenidoNeto) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.contenidoNeto = contenidoNeto;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getContenidoNeto() {
        return contenidoNeto;
    }

    public void setContenidoNeto(String contenidoNeto) {
        this.contenidoNeto = contenidoNeto;
    }
    
    public double calcularMonto() {
        double monto = getPrecio() * getCantidad();
        return monto;
    }

    @Override
    public String toString() {
        return "Abarrotes: " + super.toString() + ", Contenido neto: " + getContenidoNeto();
    }  
}
