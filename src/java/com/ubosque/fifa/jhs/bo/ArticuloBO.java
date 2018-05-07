/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.fifa.jhs.bo;

import com.ubosque.fifa.jsf.bean.BeanArticulo;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public interface ArticuloBO {
    void insert(BeanArticulo obj);
    void delete(BeanArticulo obj);
    void update(BeanArticulo obj);
    List<BeanArticulo> getAll();
}
