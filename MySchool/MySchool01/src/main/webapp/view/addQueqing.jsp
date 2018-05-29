<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/25
  Time: 9:18
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
            padding-top: 100px;
            padding-left: 100px;
            /*border: 1px solid black;*/
        }
    </style>
    <link rel="stylesheet" href="../css/style.css" media="screen" type="text/css" />
</head>

<body>
<%@include file="top.jsp"%>
<%@include file="left_suguan.jsp"%>
<div id="right_content">
    <form action="/updatequeqing.do" method="post">
        <input type="hidden" name="method" value="add"/>
        楼宇编号:<input type="text" name="b_id"><br/><br/>
        宿舍编号:<input type="text" name="d_id"><br/><br/>
        学&nbsp;&nbsp;号:<input type="text" name="s_id"/><br/><br/>
        学生姓名:<input type="text" name="s_name"/><br/><br/>
        学生性别:<input type="text" name="s_sex"/><br/><br/>
        缺寝时间:<input type="date" name="q_date"><br/><br/>
        备&nbsp;&nbsp;注:<input type="text" name="beizu"/><br/><br/>
        楼宇管理员姓名:<input type="text" name="ba_name"/><br/><br/>
        <input type="submit" value="添加"/>
    </form>
</div>
</body>
</html>
