package com.ubosque.fifa.jhs.persistence;
// Generated 6/05/2018 04:13:47 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Posiciones generated by hbm2java
 */
public class Posiciones  implements java.io.Serializable {


     private BigDecimal id;
     private String nombre;
     private String descripcion;

    public Posiciones() {
    }

    public Posiciones(BigDecimal id, String nombre, String descripcion) {
       this.id = id;
       this.nombre = nombre;
       this.descripcion = descripcion;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}

