package com.neusoft.ehr.sys.interceptors;

import com.neusoft.ehr.app.entity.User;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 权限拦截器
 */
public class PermissionInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //判断是否登录
        //1获取session
        HttpSession session = request.getSession();
        if(session != null){
            //获得user对象的principal
            User principal = (User)session.getAttribute("principal");
            if(principal != null){
                return true;
            }
        }
        request.setAttribute("message","对不起，您没有权限，请登录");
        request.getRequestDispatcher("/login.jsp").forward(request,response);
        return false;
    }
}
