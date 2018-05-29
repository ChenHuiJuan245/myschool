<%@ page import="com.chj.entity.In_out_dorEntity" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/22
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        #right_content{
            width: 700px;
            height: 700px;
            float: left;
            padding-top: 50px;
            padding-left: 50px;
        }
    </style>
</head>
<body>
<%@include file="top.jsp"%>
<%@include file="left_admin.jsp" %>
<div id="right_content">
    <%--<% In_out_dorEntity in= (In_out_dorEntity) request.getAttribute("in");%>--%>
    <form action="/out.do" method="post">
        <input type="hidden" name="method" value="update">
        <%--入住编号:<input type="text" name="in_id" /><br/>--%>
        学&nbsp;&nbsp;号:<input type="text" name="s_id" /><br/><br/>
       <%-- 迁出时间:<input type="date" name="out_date" /><br/>--%>
        <input type="submit" value="迁出"/>
    </form>
</div>
</body>
</html>
