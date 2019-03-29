<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/30 0030
  Time: 上午 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%@ include file="WEB-INF/view/include/head.jsp"%>
<body>
<!-- WRAPPER -->
<div id="wrapper">
    <div class="vertical-align-wrap">
        <div class="vertical-align-middle">
            <div class="auth-box ">
                <div class="left">
                    <div class="content">
                        <div class="header">
                            <div class="logo text-center"><img src="${ctxStatic}/img/logo.gif" alt="Klorofil Logo"></div>
                            <p class="lead">请登录</p>
                        </div>
                        <form class="form-auth-small" action="${ctx}/login">
                            <div class="form-group">
                                <label for="username" class="control-label sr-only">用户名</label>
                                <input type="text" class="form-control" name="username" id="username" value="" placeholder="用户名">
                            </div>
                            <div class="form-group">
                                <label for="password" class="control-label sr-only">密码</label>
                                <input type="password" class="form-control" name="password" id="password" value="" placeholder="密码">
                            </div>
                           <%-- <div class="form-group clearfix">
                                <label class="fancy-checkbox element-left">
                                    <input type="checkbox">
                                    <span>Remember me</span>
                                </label>
                            </div>--%>
                            <button type="submit" class="btn btn-primary btn-lg btn-block">登录</button>
                            <div class="bottom">
                                <span class="helper-text"><i class="fa fa-lock"></i><%-- <a href="#">Forgot password?</a>--%></span>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="right">
                    <div class="overlay"></div>
                    <div class="content text">
                        <h1 class="heading">ehr人事管理系统</h1>
                        <p>by 小琼</p>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
</div>
<c:if test="${message!=null}">
    <script type="text/javascript">
        /*弹窗显示登录信息*/
        alert("${message}")
    </script>
</c:if>
<!-- END WRAPPER -->
</body>
</html>
