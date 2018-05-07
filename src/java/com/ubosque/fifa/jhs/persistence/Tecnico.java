package com.ubosque.fifa.jhs.persistence;
// Generated 6/05/2018 04:13:47 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Tecnico generated by hbm2java
 */
public class Tecnico  implements java.io.Serializable {


     private BigDecimal id;
     private Persona persona;
     private Pais pais;
     private Tipotecnico tipotecnico;

    public Tecnico() {
    }

    public Tecnico(BigDecimal id, Persona persona, Pais pais, Tipotecnico tipotecnico) {
       this.id = id;
       this.persona = persona;
       this.pais = pais;
       this.tipotecnico = tipotecnico;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Pais getPais() {
        return this.pais;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public Tipotecnico getTipotecnico() {
        return this.tipotecnico;
    }
    
    public void setTipotecnico(Tipotecnico tipotecnico) {
        this.tipotecnico = tipotecnico;
    }




}


