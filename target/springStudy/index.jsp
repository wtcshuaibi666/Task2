<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/9
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE >
<html>
<head>
    <title>首页</title>
    <style type="text/css">
        a {
            text-decoration: none;
            color: #fff;
            font-size: 14px;
        }

        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: #5BC0DE;
            border-radius: 4px;
        }
    </style>
</head>
<body>
<h3>
    <a href="${path }/user/userInfo">进入用户管理页</a>
</h3>
</body>
</html>
