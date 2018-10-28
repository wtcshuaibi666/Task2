<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/23
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>

<json:object>
    <json:array  name="user" items="${user}" var="user">
        <json:object>
    <json:property name="id" value="${user.id}"/>
    <json:property name="name" value="${user.name}"/>
    <json:property name="qq" value="${user.qq}"/>
    <json:property name="type" value="${user.type}"/>
    <%--<json:property name="entranceTime" value="$"--%>
        </json:object>
    </json:array>
</json:object>
