package com.neusoft.ehr.sys.dao;

import com.neusoft.ehr.sys.entity.BaseEntity;

import java.util.List;

/**
 * 利用泛型抽象dao代码
 * @param <T>
 */
public interface BaseDao<T extends BaseEntity> {

    public T get(T t);

    public T getById(String id);

    public List<T> getList(T t);

    public List<T> findAll();

    public void insert(T t);

    public void update(T t);


}
