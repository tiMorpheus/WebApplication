package edu.shop.java.dao;

import java.util.List;

import edu.shop.java.models.Model;

public interface ItemDao<T extends Model> {

    List<T> getAll();

    T getById(Long id);

    void add(T model);

    void update(T model);


    void remove(T model);


}
