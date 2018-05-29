<%@ page import="com.chj.entity.BuildingadminEntity" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/17
  Time: 14:27
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
        <%BuildingadminEntity ba= (BuildingadminEntity) request.getAttribute("buildupdate"); %>
        <form action="/updateBadmin.do" method="post">
            <input type="hidden" name="method" value="update">
            姓&nbsp;名:<input type="text" name="ba_name" value="<%=ba.getBa_name()%>"/><br/>
            密&nbsp;码:<input type="text" name="ba_pwd" value="<%=ba.getBa_pwd()%>"><br/>
            性&nbsp;别:<input type="text" name="ba_sex" value="<%=ba.getBa_sex()%>"/><br/>
            电&nbsp;话:<input type="text" name="ba_tel" value="<%=ba.getBa_tel()%>"/><br/>
            用户名:<input type="text" name="ba_id" value="<%=ba.getBa_id()%>" readonly /><br/>
            <input type="submit" value="修改"/>
        </form>
    </div>
</body>
</html>
