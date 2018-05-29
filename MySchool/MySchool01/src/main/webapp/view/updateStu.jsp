<%@ page import="com.chj.entity.StudentEntity" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/17
  Time: 16:13
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
    <%@include file="left_admin.jsp" %>
    <div id="right_content">
        <% StudentEntity stu= (StudentEntity) request.getAttribute("stu");%>
        <form action="/updatestu.do" method="post">
            <input type="hidden" name="method" value="update">
            学&nbsp;号:<input type="text" name="s_id" value="<%=stu.getS_id()%>" readonly/><br/>
            姓&nbsp;名:<input type="text" name="s_name" value="<%=stu.getS_name()%>"><br/>
            密&nbsp;码:<input type="text" name="s_pwd" value="<%=stu.getS_pwd()%>"><br/>
            性&nbsp;别:<input type="text" name="s_sex" value="<%=stu.getS_sex()%>"/><br/>
            班&nbsp;级:<input type="text" name="s_grade" value="<%=stu.getS_grade()%>"/><br/>
            状&nbsp;态:<input type="text" name="s_status" value="<%=stu.getS_status()%>"/><br/>
            <input type="submit" value="修改"/>
        </form>
    </div>
</body>
</html>
