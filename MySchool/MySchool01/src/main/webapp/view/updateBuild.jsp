<%@ page import="com.chj.entity.BuildingEntity" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/17
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        #right_content{
            width: 1400px;
            height: 700px;
            float: left;
        }
    </style>
</head>
<body>
    <%@include file="top.jsp"%>
    <%@include file="left_admin.jsp"%>
    <div id="right_content">
        <% BuildingEntity stu= (BuildingEntity) request.getAttribute("bu");%>
        <form action="/updateBuild.do" method="post">
            <input type="hidden" name="method" value="update">
            楼宇编号:<input type="text" name="b_id" value="<%=stu.getB_id()%>" readonly/><br/>
            名&nbsp;称:<input type="text" name="b_name" value="<%=stu.getB_name()%>"/><br/>
            简&nbsp;介:<input type="text" name="b_jianjie" value="<%=stu.getB_jianjie()%>"><br/>
            管理员:<input type="text" name="ba_id" value="<%=stu.getBa_id()%>"/><br/>
            <input type="submit" value="修改"/>
        </form>
    </div>
</body>
</html>
