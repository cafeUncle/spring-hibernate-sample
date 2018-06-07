package com.zq.repository.impl;

import com.zq.entity.Image;
import com.zq.repository.BaseRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class Repository<T,PK extends Serializable> implements BaseRepository<T,PK> {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    public T load(PK id) {
        return (T)getCurrentSession().load(Object.class,id);
    }

    public T get(PK id) {
        return (T)getCurrentSession().get(Object.class,id);
    }

    public List<T> findAll() {
        return null;
    }

    public void persist(T entity) {

    }

    public PK save(T entity) {
        return null;
    }

    public void saveOrUpdate(T entity) {

    }

    public void delete(PK id) {

    }

    public void flush() {

    }
}
