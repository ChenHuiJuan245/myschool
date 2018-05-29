<%@ page import="com.chj.entity.AdminEntity" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/26
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="../css/bootstrap-theme.min.css" />
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<script type="text/javascript" src="../js/jquery-2.1.0.js" ></script>
<script type="text/javascript" src="../js/bootstrap.min.js" ></script>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        #right_content{
            width: 500px;
            height: 700px;
            padding-top: 100px;
            float: left;
            padding-left: 100px;
        }
    </style>
</head>
<body>
<%@include file="top.jsp"%>
<%@include file="left_admin.jsp"%>
<div id="right_content" class="tip">
    <% AdminEntity stu= (AdminEntity) request.getAttribute("admin");%>
    <form action="/updateAdminPwd.do" method="post">
        <input type="hidden" name="method" value="update">
        请输入原密码:<input type="text" name="a_pwd" ><br/><br/>
        请输入新密码:<input type="text" name="a_newpwd" /><br/><br/>
        请重复新密码:<input type="text" name="a_newpwds" /><br/><br/>
        <input  type="submit"  value="修改"/>
    </form>
</div>
</body>
</html>
