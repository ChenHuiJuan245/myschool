<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/16
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        body{
            margin: 0 auto;
            padding: 0;
        }
        #left{
            width: 300px;
            height: 800px;
            background-color: #C7DDEF;
            border: 1px solid gainsboro;
            float: left;
        }
        #left a{
            text-decoration: none;
            color: black;
        }
        ul{
            list-style: none;

        }
        ul li{
            padding-top: 30px;
            padding-left: 50px;
        }
    </style>
</head>
<body>
<div id="left">
    <ul>
        <li><a href="#">后台首页</a></li>
        <li><a href="queryBuildAdmin.do">楼宇管理员管理</a></li>
        <li><a href="querystu.do">学生管理</a></li>
        <li><a href="queryBuild.do">楼宇管理</a></li>
        <li><a href="querydor.do">宿舍管理</a></li>
        <li><a href="#">学生入住登记</a></li>
        <li><a href="#">学生寝室调换</a></li>
        <li><a href="#">学生迁出登记</a></li>
        <li><a href="#">学生缺寝记录</a></li>
        <li><a href="#">迁出记录</a></li>
        <li><a href="#">修改密码</a></li>
        <li><a href="#">退出系统</a></li>
    </ul>
</div>
</body>
</html>
