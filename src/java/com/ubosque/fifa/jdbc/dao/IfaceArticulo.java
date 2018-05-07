/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.fifa.jdbc.dao;

import com.ubosque.fifa.jhs.persistence.Articulos;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public interface IfaceArticulo {
    void insert(Articulos obj);
    void delete(Articulos obj);
    void update(Articulos obj);
    List<Articulos> getAll();
}
