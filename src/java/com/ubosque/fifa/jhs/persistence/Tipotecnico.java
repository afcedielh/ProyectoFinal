package com.ubosque.fifa.jhs.persistence;
// Generated 8/05/2018 07:48:31 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Tipotecnico generated by hbm2java
 */
public class Tipotecnico  implements java.io.Serializable {


     private BigDecimal id;
     private String descripcion;
     private Set tecnicos = new HashSet(0);

    public Tipotecnico() {
    }

	
    public Tipotecnico(BigDecimal id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    public Tipotecnico(BigDecimal id, String descripcion, Set tecnicos) {
       this.id = id;
       this.descripcion = descripcion;
       this.tecnicos = tecnicos;
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
    public Set getTecnicos() {
        return this.tecnicos;
    }
    
    public void setTecnicos(Set tecnicos) {
        this.tecnicos = tecnicos;
    }




}


