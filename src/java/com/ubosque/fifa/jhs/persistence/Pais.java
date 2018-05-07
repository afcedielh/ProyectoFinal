package com.ubosque.fifa.jhs.persistence;
// Generated 6/05/2018 04:13:47 PM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Pais generated by hbm2java
 */
public class Pais implements java.io.Serializable {

    private BigDecimal id;
    private String nombre;
    private BigDecimal poblacion;
    private String capital;
    private Set tipodocumentos = new HashSet(0);
    private Set partidosForEquipolocal = new HashSet(0);
    private Set tecnicos = new HashSet(0);
    private Set partidosForEquipovisitante = new HashSet(0);

    public Pais() {
    }

    public Pais(BigDecimal id, String nombre, BigDecimal poblacion, String capital) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.capital = capital;
    }

    public Pais(BigDecimal id, String nombre, BigDecimal poblacion, String capital, Set tipodocumentos, Set partidosForEquipolocal, Set tecnicos, Set partidosForEquipovisitante) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.capital = capital;
        this.tipodocumentos = tipodocumentos;
        this.partidosForEquipolocal = partidosForEquipolocal;
        this.tecnicos = tecnicos;
        this.partidosForEquipovisitante = partidosForEquipovisitante;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(BigDecimal poblacion) {
        this.poblacion = poblacion;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Set getTipodocumentos() {
        return tipodocumentos;
    }

    public void setTipodocumentos(Set tipodocumentos) {
        this.tipodocumentos = tipodocumentos;
    }

    public Set getPartidosForEquipolocal() {
        return partidosForEquipolocal;
    }

    public void setPartidosForEquipolocal(Set partidosForEquipolocal) {
        this.partidosForEquipolocal = partidosForEquipolocal;
    }

    public Set getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(Set tecnicos) {
        this.tecnicos = tecnicos;
    }

    public Set getPartidosForEquipovisitante() {
        return partidosForEquipovisitante;
    }

    public void setPartidosForEquipovisitante(Set partidosForEquipovisitante) {
        this.partidosForEquipovisitante = partidosForEquipovisitante;
    }
    
}
