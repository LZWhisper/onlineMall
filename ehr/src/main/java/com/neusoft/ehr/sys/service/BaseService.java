package com.neusoft.ehr.sys.service;

import com.neusoft.ehr.sys.dao.BaseDao;
import com.neusoft.ehr.sys.entity.BaseEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseService<E extends BaseEntity,D extends BaseDao<E>>{
    /**
     * 给service自动装配dao，dao的类型由传入的泛型决定
     */
    @Autowired
    private D dao;

    public E get(E condition){
        return dao.get(condition);
    }

    public E getById(String id){
        return dao.getById(id);
    }

    public List<E> getList(E condition){
        return dao.getList(condition);
    }

    public List<E> findAll(){
        return dao.findAll();
    }

    public void insert(E e){
        e.preInsert();
        dao.insert(e);
    }

    public void update(E e){
        dao.update(e);
    }

    public void save(E e){
        /*e.getId()!=null && e.getId()!=""*/
        if(StringUtils.isNotBlank(e.getId())){
            update(e);
        }else {
            insert(e);
        }
    }
}
