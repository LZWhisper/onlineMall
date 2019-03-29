<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:set value="${pageContext.request.contextPath}/static" var="ctxStatic"/>
<c:set value="${pageContext.request.contextPath}" var="ctx"/>

<!-- VENDOR CSS -->
<link rel="stylesheet" href="${ctxStatic}/vendor/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${ctxStatic}/vendor/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="${ctxStatic}/vendor/linearicons/style.css">
<link rel="stylesheet" href="${ctxStatic}/vendor/chartist/css/chartist-custom.css">
<!-- MAIN CSS -->
<link rel="stylesheet" href="${ctxStatic}/css/main.css">
<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
<link rel="stylesheet" href="${ctxStatic}/css/demo.css">
<!-- ICONS -->
<link rel="apple-touch-icon" sizes="76x76" href="${ctxStatic}/img/apple-icon.png">
<link rel="icon" type="image/png" sizes="96x96" href="${ctxStatic}/img/favicon.png">

<%--引入script--%>
<!-- Javascript -->
<script src="${ctxStatic}/vendor/jquery/jquery.min.js"></script>
<script src="${ctxStatic}/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="${ctxStatic}/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="${ctxStatic}/vendor/jquery.easy-pie-chart/jquery.easypiechart.min.js"></script>
<script src="${ctxStatic}/vendor/chartist/js/chartist.min.js"></script>
<script src="${ctxStatic}/scripts/klorofil-common.js"></script>