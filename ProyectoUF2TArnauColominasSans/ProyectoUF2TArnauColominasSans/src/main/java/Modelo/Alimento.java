/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author st2021061
 */
public class Alimento {

    private String NombreProducto, tipo, descripcion;
    private int Id, Precio, stock, Producto, intCont;
    private boolean caducado;
    public static int contEntidades;

    /* Constructores */
    // Opciones Obligatorias (Primary Key)
    public Alimento(String NombreProducto, int Id, double pesoProducto, int Precio, String marcaProducto, String distribuido) {
        this.NombreProducto = NombreProducto;
        this.Id = Id;
        this.Precio = Precio;
        intCont();
    }

    // No obligatorios
    public Alimento(String NombreProducto, int Id, double pesoProducto, int Precio, String marcaProducto, String distribuido, String tipo, int stock, String descripcion, int FechaCaducidad, int Producto, boolean caducado) {
        this.NombreProducto = NombreProducto;
        this.Id = Id;
        this.Precio = Precio;
        this.tipo = tipo;
        this.stock = stock;
        this.descripcion = descripcion;
        this.caducado = caducado;
        this.Producto = Producto;
        intCont();
    }

    // ZONA IMPRESCINDIBLE (Todos los parámetros que hay dentro tienen que aplicarse)
    public int getId() {
        return Id;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public int getPrecio() {
        return Precio;
    }

    // ZONA SECUNDARIA NO OBLIGATORIA PARA RELLENAR
    public String getTipo() {
        return tipo;
    }

    public int getStock() {
        return stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCaducado(boolean caducado) {
        this.caducado = caducado;
    }

    public int getProducto() {
        return Producto;
    }

    public void decCont() {
        contEntidades--;
    }

    public void intCont() {
        contEntidades++;
    }

    public int getContEntidades() {
        return contEntidades;
    }

    // Constructor que establece el tipo
    public Alimento(String tipo) {
        this.tipo = tipo;
    }

    // Setter para el tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombreProducto(String nombreProducto) {
        this.NombreProducto = nombreProducto;
    }

    public void setPesoProducto(double pesoProducto) {

    }

    public void setCantidadProducto(int cantidadProducto) {
    }

    public void setMarcaProducto(String marcaProducto) {
    }

    public void setDistribuido(String distribuido) {
    }
}
