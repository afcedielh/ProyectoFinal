/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.fifa.jdbc.dao;

import com.ubosque.fifa.jhs.persistence.Pais;
import java.util.List;

/**
 *
 * @author afced
 */
public interface IfaceEquipo {

    void Crear(Pais equipo);

    void Editar(Pais equipo);

    void Eliminar(Pais equipo);

    List<Pais> TraerTodos();

    // List<Pais> TraerPorNombre(int a);
}
