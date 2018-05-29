<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/17
  Time: 18:14
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
        <form action="/updateBuild.do" method="post">
            <input type="hidden" name="method" value="add"/>
            名&nbsp;称:<input type="text" name="b_name"><br/>
            简&nbsp;介:<input type="text" name="b_jianjie"><br/>
            管理员:<input type="text" name="ba_id"/><br/>
            <input type="submit" value="添加"/>
        </form>
    </div>
</body>
</html>
