<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/28
  Time: 15:07
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
    <form action="/out.do" method="post">
        <input type="hidden" name="method" value="exchange">
        输入要调换寝室学生的学号:<input type="text" name="s_id" /><br/><br/>
        <input type="submit" value="确定"/>
    </form>
</div>
</body>
</html>
