package com.zq.repository.impl;

import com.zq.entity.Image;
import com.zq.repository.ImageRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ImageRepositoryImpl implements ImageRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    public Image load(Long id) {
        return (Image)getCurrentSession().load(Image.class,id);
    }

    public Image get(Long id) {
        return (Image) getCurrentSession().get(Image.class, id);
    }

    public List<Image> findAll() {
        return null;
    }

    public void persist(Image entity) {
        getCurrentSession().persist(entity);
    }

    public Long save(Image entity) {
        return (Long) getCurrentSession().save(entity);
    }

    public void saveOrUpdate(Image entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    public void delete(Long id) {
        Image person = load(id);
        getCurrentSession().delete(person);
    }

    public void flush() {
        getCurrentSession().flush();
    }
}
