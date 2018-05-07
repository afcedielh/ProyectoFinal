/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.fifa.jhs.bo.Imp;

import com.ubosque.fifa.jdbc.dao.Imp.ImplLogin;
import com.ubosque.fifa.jhs.bo.LoginBO;
import com.ubosque.fifa.jhs.persistence.Login;
import com.ubosque.fifa.jsf.bean.BeanLogin;
/**
 *
 * @author SergioRios
 */
public class LoginImplBO implements LoginBO {
    private ImplLogin loginDAO;
    /**
     * @return the loginDAO
     */
    public ImplLogin getLoginDAO() {
        return loginDAO;
    }

    /**
     * @param loginDAO the loginDAO to set
     */
    public void setLoginDAO(ImplLogin loginDAO) {
        this.loginDAO = loginDAO;
    }
    
    @Override
    public void validaLogin(BeanLogin obj) {
        Login login = new Login();
        login.setUsuario(obj.getUser());
        login.setPassword(obj.getPassword());
        login = getLoginDAO().validaLogin(login);
        if(login != null) {
            obj.setUrl(login.getUrl());
            obj.setStatus(true);
            obj.setMensaje("Usuario encontrado");
        } else {
            obj.setStatus(false);
            obj.setMensaje("El usuario no existe");
        }
    }
}
