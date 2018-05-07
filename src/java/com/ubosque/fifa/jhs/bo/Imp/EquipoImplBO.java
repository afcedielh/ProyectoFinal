/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.fifa.jhs.bo.Imp;

import com.ubosque.fifa.jdbc.dao.IfaceEquipo;
import com.ubosque.fifa.jhs.bo.EquipoBO;
import com.ubosque.fifa.jhs.persistence.Pais;
import com.ubosque.fifa.jsf.bean.BeanEquipo;
import java.util.ArrayList;
import java.util.List;

public class EquipoImplBO implements EquipoBO {

    private IfaceEquipo equipoDAO;

    @Override
    public void Crear(BeanEquipo equipo) {
        Pais Equipo = new Pais();
        Equipo.setCapital(equipo.getCapital());
        Equipo.setId(equipo.getId());
        Equipo.setNombre(equipo.getNombre());
        Equipo.setPoblacion(equipo.getPoblacion());
        getEquipoDAO().Crear(Equipo);
    }

    @Override
    public void Editar(BeanEquipo equipo) {
        Pais Equipo = new Pais();
        Equipo.setCapital(equipo.getCapital());
        Equipo.setId(equipo.getId());
        Equipo.setNombre(equipo.getNombre());
        getEquipoDAO().Editar(Equipo);
    }

    @Override
    public void Eliminar(BeanEquipo equipo) {
        Pais Equipo = new Pais();
        Equipo.setCapital(equipo.getCapital());
        Equipo.setId(equipo.getId());
        Equipo.setNombre(equipo.getNombre());
        getEquipoDAO().Eliminar(Equipo);
    }

    @Override
    public List<BeanEquipo> TraerTodos() {
        List<BeanEquipo> lista = new ArrayList();
        List<Pais> nuevaLista = equipoDAO.TraerTodos();
        nuevaLista.stream().map((obj) -> {
            BeanEquipo bean = new BeanEquipo();
            bean.setCapital(obj.getCapital());
            bean.setNombre(obj.getNombre());
            bean.setPoblacion(obj.getPoblacion());
            bean.setId(obj.getId());
            return bean;
        }).forEachOrdered((BeanEquipo bean) -> {
            lista.add(bean);
        });
        return lista;
    }

    public IfaceEquipo getEquipoDAO() {
        return equipoDAO;
    }

    public void setEquipoDAO(IfaceEquipo equipoDAO) {
        this.equipoDAO = equipoDAO;
    }

}
