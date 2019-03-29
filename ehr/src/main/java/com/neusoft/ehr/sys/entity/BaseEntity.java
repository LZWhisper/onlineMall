package com.neusoft.ehr.sys.entity;

import java.io.Serializable;
import java.util.UUID;

public class BaseEntity implements Serializable {
    /*用常量标识删除状态*/
    public static  final  String DEL_FLAG_YESS="1";
    public static  final  String DEL_FLAG_NO="0";
    private static final long serialVersionUID = 1L;

    /*主键*/
    protected String id;
    /*删除标记位，0：代表正常 1：代表删除*/
    protected  String delFlag;

    /**
     * 在插入数据之前，调用此方法，生成随机id
     */
    public void preInsert(){
        id = UUID.randomUUID().toString().replaceAll("-","");
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
