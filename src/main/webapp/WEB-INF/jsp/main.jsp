<%@ taglib prefix="s" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2020/11/23
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h1>登录成功，欢迎欢迎！！！</h1>
<s:hasPermission name="书本新增">
    <a href="#">高级用户</a><br/>
</s:hasPermission>

<s:hasRole name="管理员">
    <a href="#">管理员</a>
</s:hasRole>

</body>
</html>
