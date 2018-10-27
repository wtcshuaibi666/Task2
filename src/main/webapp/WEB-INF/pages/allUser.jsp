<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/9
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
    <title>用户列表</title>
</head>

<body>

<div class="container">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12">
            <h1>用户管理</h1>
        </div>
    </div>
    <!-- 按钮 -->
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <a href="${pageContext.request.contextPath}/user/toAddUser">新增</a>
        </div>
    </div>
    <!-- 表格  -->

            <table width="100%" border="1">
                <tbody>
                <tr>
                    <th>id</th>
                    <th>名字</th>
                    <th>qq</th>
                    <th>类型</th>
                    <th>时间</th>
                    <th>学校</th>
                    <th>学号</th>
                    <th>日报</th>
                    <th>希望</th>
                    <th>师兄</th>
                    <th>创建时间</th>
                    <th>更新时间</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${pageInfo.list}" var="user">

                    <tr>
                        <td>${user.id}</td>
                        <td>${user.name}</td>
                        <td>${user.qq}</td>
                        <td>${user.type}</td>
                        <td>${user.entranceTime}</td>
                        <td>${user.school}</td>
                        <td>${user.onlineNum}</td>
                        <td>${user.dailylink}</td>
                        <td>${user.wish}</td>
                        <td>${user.bro}</td>
                        <td>${user.create_at}</td>
                        <td>${user.update_at}</td>
                        <td>
                            <a type="button"  href="${pageContext.request.contextPath}/user/getUser/${user.id}" class="btn btn-info btn-sm">
                                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                编辑</a>
                        <td><form action="${pageContext.request.contextPath}/user/delUser/${user.id}" method="post">
                            <input type="hidden" name="_method" value="DELETE">
                            <input TYPE="submit" value="删除"></form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
</div>
    <center>
        <p>当前 ${pageInfo.pageNum }页,总${pageInfo.pages }
            页,总 ${pageInfo.total } 条记录</div></p>
<a href="/user/userInfo?pageNo=${pageInfo.firstPage}">首页</a>
<c:if test="${pageInfo.hasPreviousPage }">
    <a href="/user/userInfo?pageNo=${pageInfo.pageNum-1}">上一页</a>
</c:if>
<c:if test="${pageInfo.hasNextPage }">
    <a href="/user/userInfo?pageNo=${pageInfo.pageNum+1}">下一页</a>
</c:if>
<a href="/user/userInfo?pageNo=${pageInfo.lastPage}">最后页</a>
</center>
</body>
</html>




