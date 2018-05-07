/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.fifa.jdbc.dao;


import com.ubosque.fifa.jhs.persistence.Alumnos;
import com.ubosque.fifa.jsf.bean.BeanAlumno;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public interface IfaceAlumno {
    void insert(Alumnos obj);
    void delete(Alumnos obj);
    void update(Alumnos obj);
    List<Alumnos> getAll();
    List<Alumnos> getAllByFechas(BeanAlumno bean);
    List<Alumnos> getAllByNombre(BeanAlumno bean);
    List<Alumnos> buscarByCriterio(BeanAlumno bean);
}
