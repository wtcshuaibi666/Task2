<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/9
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>编辑用户</title>

    <script type="text/javascript">
        function updateUser() {
            var form = document.forms[0];
            form.action = "<%=basePath %>user/updateUser";
            form.method = "post";
            form.submit();
        }
    </script>

</head>
<body>
<h1>编辑用户</h1>
<form action="${pageContext.request.contextPath}/user/updateUser" method="POST" name="userForm">
    <input type="hidden" name="id" value="${user.id }" />
    姓名：<input type="text" name="name" value="${user.name }" />
    qq：<input type="text" name="qq" value="${user.qq }" />
    类型：<input type="text" name="type" value="${user.type}">
    时间：<input type="text" name="entranceTime" value="${user.entranceTime}">
    学校：<input type="text" name="school" value="${user.school}">
    编号：<input type="text" name="onlineNum" value="${user.onlineNum}">
    日报：<input type="text" name="dailylink"value="${user.dailylink}">
    希望：<input type="text" name="wish"value="${user.wish}">
    师兄：<input type="text" name="bro"value="${user.bro}">
    创建时间：<input type="text" name="create_at"value="${user.create_at}">
    更新时间：<input type="text" name="update_at"value="${user.update_at}">
    <input type="button" value="编辑" onclick="updateUser()" />
</form>
</body>

</html>

