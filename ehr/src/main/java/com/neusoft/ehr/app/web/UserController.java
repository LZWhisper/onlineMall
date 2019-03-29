package com.neusoft.ehr.app.web;

import com.neusoft.ehr.app.entity.User;
import com.neusoft.ehr.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<User> findAll(){
        List<User> all = userService.findAll();
        return all;
    }
}
