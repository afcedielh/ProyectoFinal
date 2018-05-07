/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.fifa.jhs.bo;

import com.ubosque.fifa.jsf.bean.BeanEquipo;
import java.util.List;

/**
 *
 * @author afced
 */
public interface EquipoBO {

    void Crear(BeanEquipo equipo);

    void Editar(BeanEquipo equipo);

    void Eliminar(BeanEquipo equipo);

    List<BeanEquipo> TraerTodos();

    // List<Pais> TraerPorNombre(int a);
}
