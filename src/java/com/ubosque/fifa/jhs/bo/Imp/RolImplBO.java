/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.fifa.jhs.bo.Imp;

import com.ubosque.fifa.jdbc.dao.Imp.ImplRol;
import com.ubosque.fifa.jhs.bo.RolBO;
import com.ubosque.fifa.jhs.persistence.Rol;
import java.util.List;

/**
 *
 * @author afced
 */
public class RolImplBO implements RolBO {

    private ImplRol RolDAO;

    public ImplRol getRolDAO() {
        return RolDAO;
    }

    public void setRolDAO(ImplRol RolDAO) {
        this.RolDAO = RolDAO;
    }

    @Override
    public List<Rol> ConsultarTodos() {
        return RolDAO.TraerTodos();
    }
}
