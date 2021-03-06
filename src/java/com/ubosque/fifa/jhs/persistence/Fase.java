package com.ubosque.fifa.jhs.persistence;
// Generated 8/05/2018 07:48:31 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Fase generated by hbm2java
 */
public class Fase  implements java.io.Serializable {


     private BigDecimal id;
     private String descripcion;
     private Set partidos = new HashSet(0);

    public Fase() {
    }

	
    public Fase(BigDecimal id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    public Fase(BigDecimal id, String descripcion, Set partidos) {
       this.id = id;
       this.descripcion = descripcion;
       this.partidos = partidos;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getPartidos() {
        return this.partidos;
    }
    
    public void setPartidos(Set partidos) {
        this.partidos = partidos;
    }




}


