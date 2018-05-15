package com.ubosque.fifa.jdbc.dao.Imp;

import com.ubosque.fifa.jdbc.dao.IfaceEquipo;
import com.ubosque.fifa.jhs.persistence.Pais;
import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author afced
 */
public class ImplEquipo extends HibernateDaoSupport implements IfaceEquipo {

    @Override
    @Transactional
    public void Crear(Pais equipo) {
        getHibernateTemplate().save(equipo);
    }

    @Override
    @Transactional
    public void Editar(Pais equipo) {
        getHibernateTemplate().merge(equipo);
    }

    @Override
    @Transactional
    public void Eliminar(Pais equipo) {
        getHibernateTemplate().delete(equipo);
    }

    @Override
    @Transactional
    public List TraerTodos() {
        return getHibernateTemplate().find("from Pais");
    }
}
