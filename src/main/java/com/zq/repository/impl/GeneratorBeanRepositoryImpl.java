package com.zq.repository.impl;

import com.zq.entity.GeneratorBean;
import com.zq.repository.GeneratorBeanRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GeneratorBeanRepositoryImpl implements GeneratorBeanRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    public GeneratorBean load(Long id) {
        return (GeneratorBean)getCurrentSession().load(GeneratorBean.class,id);
    }

    public GeneratorBean get(Long id) {
        return (GeneratorBean) getCurrentSession().get(GeneratorBean.class, id);
    }

    public List<GeneratorBean> findAll() {
        return null;
    }

    public void persist(GeneratorBean entity) {
        getCurrentSession().persist(entity);
    }

    public Long save(GeneratorBean entity) {
        return (Long) getCurrentSession().save(entity);
    }

    public void saveOrUpdate(GeneratorBean entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    public void delete(Long id) {
        GeneratorBean entity = load(id);
        getCurrentSession().delete(entity);
    }

    public void flush() {
        getCurrentSession().flush();
    }
}
