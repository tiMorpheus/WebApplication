package edu.shop.java.dao.impl;


import edu.shop.java.models.Model;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class HibernateAbstractDao<T extends Model>{

    @Autowired
    private SessionFactory sessionFactory;

    private Class<T> clazz;

    @SuppressWarnings("unchecked")
    public HibernateAbstractDao() {
        final ParameterizedType supperClass = (ParameterizedType) getClass().getGenericSuperclass();
        this.clazz = (Class<T>) ((ParameterizedType) supperClass).getActualTypeArguments()[0];
    }

    public List<T> getAll() {
        Criteria criteria = getSession().createCriteria(this.clazz);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return criteria.list();
    }

    public T getById(Long id) {
        Criteria criteria = getSession().createCriteria(this.clazz);
        criteria.add(Restrictions.eq("id",id));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return (T) criteria.uniqueResult();
    }

    public void add(T model) {
        getSession().save(model);
    }

    public void update(T model) {
        getSession().merge(model);

    }


    public void remove(T model) {

        getSession().delete(model);
    }


    public Session getSession(){
        return this.sessionFactory.getCurrentSession();
    }

}
