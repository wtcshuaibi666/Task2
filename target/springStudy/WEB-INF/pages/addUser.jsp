<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/9
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<title>添加用户</title>
<body>
<h1>添加用户</h1>
<form name="userForm">
    姓名：<input type="text" name="name"><br>
    QQ：<input type="text" name="qq"><br>
    类型：<input type="text" name="type"><br>
    时间：<input type="text" name="entranceTime"><br>
    学校：<input type="text" name="school"><br>
    编号：<input type="text" name="onlineNum" ><br>
    日报：<input type="text" name="dailylink"><br>
    希望：<input type="text" name="wish"><br>
    师兄：<input type="text" name="bro"><br>
    创建时间：<input type="text" name="create_at"><br>
    更新时间：<input type="text" name="update_at"><br>
    <input type="button" value="添加"
           onclick="addUser()">
</form>

<script type="text/javascript">
    var form = document.forms[0];
    function addUser() {
        form.action = "<%=basePath %>user/addUser";
        form.method = "post";
        form.submit();
    }
</script>
</body>
</html>




