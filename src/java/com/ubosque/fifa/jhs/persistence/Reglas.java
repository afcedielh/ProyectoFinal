package com.ubosque.fifa.jhs.persistence;
// Generated 8/05/2018 07:48:31 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Reglas generated by hbm2java
 */
public class Reglas  implements java.io.Serializable {


     private BigDecimal idregla;
     private String descripcon;
     private Set penalizacions = new HashSet(0);

    public Reglas() {
    }

	
    public Reglas(BigDecimal idregla, String descripcon) {
        this.idregla = idregla;
        this.descripcon = descripcon;
    }
    public Reglas(BigDecimal idregla, String descripcon, Set penalizacions) {
       this.idregla = idregla;
       this.descripcon = descripcon;
       this.penalizacions = penalizacions;
    }
   
    public BigDecimal getIdregla() {
        return this.idregla;
    }
    
    public void setIdregla(BigDecimal idregla) {
        this.idregla = idregla;
    }
    public String getDescripcon() {
        return this.descripcon;
    }
    
    public void setDescripcon(String descripcon) {
        this.descripcon = descripcon;
    }
    public Set getPenalizacions() {
        return this.penalizacions;
    }
    
    public void setPenalizacions(Set penalizacions) {
        this.penalizacions = penalizacions;
    }




}


