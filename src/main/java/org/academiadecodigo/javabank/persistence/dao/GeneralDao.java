package org.academiadecodigo.javabank.persistence.dao;

import java.util.List;

public interface GeneralDao<T> {

        // basic crud methods
        List<T> findAll();
        T findById(Integer id);
        T saveOrUpdate(T entity);
        void delete(Integer id);

    }


