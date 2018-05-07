/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.fifa.jsf.bean;

import com.ubosque.fifa.jhs.bo.ArticuloBO;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;

/**
 *
 * @author SergioRios
 */
public class BeanArticulo {
    private BigDecimal idArticulo;
    private String nombre;
    private String descripcion;
    private double costo;
    private double precio;
    private ArticuloBO articuloBO;
    private List<BeanArticulo> lista;
    private Map<String, BigDecimal> mapa;

    /**
     * @return the idArticulo
     */
    public BigDecimal getIdArticulo() {
        return idArticulo;
    }

    /**
     * @param idArticulo the idArticulo to set
     */
    public void setIdArticulo(BigDecimal idArticulo) {
        this.idArticulo = idArticulo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String insert() {
        articuloBO.insert(this);
        getAll();
        return "";
    }
    
    public String delete() {
        articuloBO.delete(this);
        getAll();
        return "";
    }
    
    public String update() {
        articuloBO.update(this);
        getAll();
        return "";
    }
    
    public void getAll() {
        setLista(articuloBO.getAll());
    }
    
    @PostConstruct
    public void llenaMapa() {
        getAll();
        mapa = new HashMap();
        for(BeanArticulo obj: getLista()) {
            mapa.put(obj.getDescripcion(), obj.getIdArticulo());
        }
    }

    /**
     * @return the lista
     */
    public List<BeanArticulo> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<BeanArticulo> lista) {
        this.lista = lista;
    }

    /**
     * @return the articuloBO
     */
    public ArticuloBO getArticuloBO() {
        return articuloBO;
    }

    /**
     * @param articuloBO the articuloBO to set
     */
    public void setArticuloBO(ArticuloBO articuloBO) {
        this.articuloBO = articuloBO;
    }

    /**
     * @return the mapa
     */
    public Map<String, BigDecimal> getMapa() {
        return mapa;
    }

    /**
     * @param mapa the mapa to set
     */
    public void setMapa(Map<String, BigDecimal> mapa) {
        this.mapa = mapa;
    }
}
