package com.ubosque.fifa.jhs.persistence;
// Generated 6/05/2018 04:13:47 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Partido generated by hbm2java
 */
public class Partido  implements java.io.Serializable {


     private BigDecimal id;
     private Pais paisByEquipolocal;
     private Pais paisByEquipovisitante;
     private Estadopartido estadopartido;
     private Estadio estadio;
     private Arbitro arbitro;
     private Fase fase;
     private Date fecha;
     private String marcador;
     private BigDecimal temperatura;
     private Set penalizacions = new HashSet(0);
     private Set partidoconvocadoses = new HashSet(0);

    public Partido() {
    }

	
    public Partido(BigDecimal id, Pais paisByEquipolocal, Pais paisByEquipovisitante, Estadopartido estadopartido, Estadio estadio, Arbitro arbitro, Fase fase, BigDecimal temperatura) {
        this.id = id;
        this.paisByEquipolocal = paisByEquipolocal;
        this.paisByEquipovisitante = paisByEquipovisitante;
        this.estadopartido = estadopartido;
        this.estadio = estadio;
        this.arbitro = arbitro;
        this.fase = fase;
        this.temperatura = temperatura;
    }
    public Partido(BigDecimal id, Pais paisByEquipolocal, Pais paisByEquipovisitante, Estadopartido estadopartido, Estadio estadio, Arbitro arbitro, Fase fase, Date fecha, String marcador, BigDecimal temperatura, Set penalizacions, Set partidoconvocadoses) {
       this.id = id;
       this.paisByEquipolocal = paisByEquipolocal;
       this.paisByEquipovisitante = paisByEquipovisitante;
       this.estadopartido = estadopartido;
       this.estadio = estadio;
       this.arbitro = arbitro;
       this.fase = fase;
       this.fecha = fecha;
       this.marcador = marcador;
       this.temperatura = temperatura;
       this.penalizacions = penalizacions;
       this.partidoconvocadoses = partidoconvocadoses;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public Pais getPaisByEquipolocal() {
        return this.paisByEquipolocal;
    }
    
    public void setPaisByEquipolocal(Pais paisByEquipolocal) {
        this.paisByEquipolocal = paisByEquipolocal;
    }
    public Pais getPaisByEquipovisitante() {
        return this.paisByEquipovisitante;
    }
    
    public void setPaisByEquipovisitante(Pais paisByEquipovisitante) {
        this.paisByEquipovisitante = paisByEquipovisitante;
    }
    public Estadopartido getEstadopartido() {
        return this.estadopartido;
    }
    
    public void setEstadopartido(Estadopartido estadopartido) {
        this.estadopartido = estadopartido;
    }
    public Estadio getEstadio() {
        return this.estadio;
    }
    
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    public Arbitro getArbitro() {
        return this.arbitro;
    }
    
    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }
    public Fase getFase() {
        return this.fase;
    }
    
    public void setFase(Fase fase) {
        this.fase = fase;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getMarcador() {
        return this.marcador;
    }
    
    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }
    public BigDecimal getTemperatura() {
        return this.temperatura;
    }
    
    public void setTemperatura(BigDecimal temperatura) {
        this.temperatura = temperatura;
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

