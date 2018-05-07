package com.ubosque.fifa.jhs.persistence;
// Generated 6/05/2018 04:13:47 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Jugador generated by hbm2java
 */
public class Jugador  implements java.io.Serializable {


     private BigDecimal id;
     private Persona persona;
     private BigDecimal idposicion;
     private String alias;
     private Set penalizacions = new HashSet(0);
     private Set partidoconvocadoses = new HashSet(0);

    public Jugador() {
    }

	
    public Jugador(BigDecimal id, Persona persona, BigDecimal idposicion, String alias) {
        this.id = id;
        this.persona = persona;
        this.idposicion = idposicion;
        this.alias = alias;
    }
    public Jugador(BigDecimal id, Persona persona, BigDecimal idposicion, String alias, Set penalizacions, Set partidoconvocadoses) {
       this.id = id;
       this.persona = persona;
       this.idposicion = idposicion;
       this.alias = alias;
       this.penalizacions = penalizacions;
       this.partidoconvocadoses = partidoconvocadoses;
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
    public BigDecimal getIdposicion() {
        return this.idposicion;
    }
    
    public void setIdposicion(BigDecimal idposicion) {
        this.idposicion = idposicion;
    }
    public String getAlias() {
        return this.alias;
    }
    
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public Set getPenalizacions() {
        return this.penalizacions;
    }
    
    public void setPenalizacions(Set penalizacions) {
        this.penalizacions = penalizacions;
    }
    public Set getPartidoconvocadoses() {
        return this.partidoconvocadoses;
    }
    
    public void setPartidoconvocadoses(Set partidoconvocadoses) {
        this.partidoconvocadoses = partidoconvocadoses;
    }




}


