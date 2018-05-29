<%@ page import="com.chj.entity.BuildingadminEntity" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/26
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        #right_content{
            width: 500px;
            height: 700px;
            float: left;
            padding-top: 100px;
            padding-left: 100px;
        }
    </style>
</head>
<body>

<%@include file="top.jsp"%>
<%@include file="left_suguan.jsp"%>
    <div id="right_content">
        <form action="/updateBuildAdminPwd.do" method="post">
            <input type="hidden" name="method" value="update">
            请输入原密码:<input type="text" name="ba_pwd"><br/><br/>
            请输入新密码:<input type="text" name="ba_newpwd" /><br/><br/>
            请重复新密码:<input type="text" name="ba_newpwds" /><br/>
            <input  type="submit" value="修改"/>
        </form>
    </div>
</body>
</html>
