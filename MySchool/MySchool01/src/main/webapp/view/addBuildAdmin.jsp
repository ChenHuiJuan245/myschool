<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/17
  Time: 14:26
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
        <form action="/updateBadmin.do" method="post">
            <input type="hidden" name="method" value="add">
            姓&nbsp;名:<input type="text" name="ba_name"/><br/>
            密&nbsp;码:<input type="text" name="ba_pwd"><br/>
            性&nbsp;别:<input type="text" name="ba_sex"/><br/>
            电&nbsp;话:<input type="text" name="ba_tel"/><br/>
            <input type="submit" value="添加"/>
        </form>
    </div>
</body>
</html>
