/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.fifa.jsf.bean;

import com.ubosque.fifa.jhs.bo.EquipoBO;
import java.math.BigDecimal;
import java.util.List;

public class BeanEquipo {

    private BigDecimal id;
    private String nombre;
    private BigDecimal poblacion;
    private String capital;
    private BigDecimal idequipo;
    private EquipoBO equipoBO;
    private List<BeanEquipo> lista;
    private BeanEquipo seleccionado;

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

    public BigDecimal getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(BigDecimal idequipo) {
        this.idequipo = idequipo;
    }

    public EquipoBO getEquipoBO() {
        return equipoBO;
    }

    public void setEquipoBO(EquipoBO equipoBO) {
        this.equipoBO = equipoBO;
    }

    public List<BeanEquipo> getLista() {
        return lista;
    }

    public void setLista(List<BeanEquipo> lista) {
        this.lista = lista;
    }

    public BeanEquipo getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(BeanEquipo seleccionado) {
        this.seleccionado = seleccionado;
    }

    public String Guardar() {
        List<BeanEquipo> Lista3 = this.getLista();
        TraerTodos();
        return "";
    }

    public String delete() {
        equipoBO.Eliminar(this);
        TraerTodos();
        return "";
    }

    public String update() {
        equipoBO.Editar(this);
        TraerTodos();
        return "";
    }

    public String AgregarNuevo() {
        setLista(equipoBO.TraerTodos());
        List<BeanEquipo> listaEquipo = this.getLista();
        listaEquipo.add(new BeanEquipo());       
        setLista(listaEquipo);
        return "";
    }

    public String TraerTodos() {
        setLista(equipoBO.TraerTodos());        
        return "";
    }
}
