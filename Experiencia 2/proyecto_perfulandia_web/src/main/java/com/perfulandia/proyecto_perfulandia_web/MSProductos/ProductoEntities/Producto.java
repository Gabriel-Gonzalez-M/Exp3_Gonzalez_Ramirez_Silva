package com.perfulandia.proyecto_perfulandia_web.MSProductos.ProductoEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private int precio;
    private float descuentoporc;
    private String marca;
    private int tamano;
    private int stock;
    private String nombreImg;
    private String categoria1;
    private String categoria2;
    private String categoria3;
    
    public Producto() {
    }

    

    public Producto(Long id, String nombre, String descripcion, int precio, float descuentoporc, String marca,
            int tamano, int stock, String nombreImg, String categoria1, String categoria2, String categoria3) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuentoporc = descuentoporc;
        this.marca = marca;
        this.tamano = tamano;
        this.stock = stock;
        this.nombreImg = nombreImg;
        this.categoria1 = categoria1;
        this.categoria2 = categoria2;
        this.categoria3 = categoria3;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public float getDescuentoporc() {
        return descuentoporc;
    }

    public void setDescuentoporc(float descuentoporc) {
        this.descuentoporc = descuentoporc;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombreImg() {
        return nombreImg;
    }

    public void setNombreImg(String nombreImg) {
        this.nombreImg = nombreImg;
    }

    public String getCategoria1() {
        return categoria1;
    }

    public void setCategoria1(String categoria1) {
        this.categoria1 = categoria1;
    }

    public String getCategoria2() {
        return categoria2;
    }

    public void setCategoria2(String categoria2) {
        this.categoria2 = categoria2;
    }

    public String getCategoria3() {
        return categoria3;
    }

    public void setCategoria3(String categoria3) {
        this.categoria3 = categoria3;
    }

    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
                + ", descuentoporc=" + descuentoporc + ", marca=" + marca + ", tamano=" + tamano + ", nombreImg="
                + nombreImg + ", categoria1=" + categoria1 + ", categoria2=" + categoria2 + ", categoria3=" + categoria3
                + "]";
    }



    

}
