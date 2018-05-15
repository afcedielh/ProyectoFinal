package com.ubosque.fifa.jdbc.dao.Imp;

import com.ubosque.fifa.jdbc.dao.IfaceRoles;
import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author afced
 */
public class ImplRol extends HibernateDaoSupport implements IfaceRoles {

    @Override
    public List TraerTodos() {
        return getHibernateTemplate().find("from Rol");
    }

}
