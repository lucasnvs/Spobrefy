package com.spobrefy.dao;

import java.util.List;

public interface DaoInterface<T> {
    T findById(int id);
    List<T> findAll();
    void save(T user);
    void update(T user);
    void delete(T user);
}