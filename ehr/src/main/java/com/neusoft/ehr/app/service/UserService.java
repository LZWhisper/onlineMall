package com.neusoft.ehr.app.service;

import com.neusoft.ehr.app.dao.UserDao;
import com.neusoft.ehr.app.entity.User;
import com.neusoft.ehr.sys.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User,UserDao> {

}
