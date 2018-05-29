<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/28
  Time: 0:42
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
            /*border: 1px solid black;*/
        }
    </style>
    <link rel="stylesheet" href="../css/style.css" media="screen" type="text/css" />
</head>
<body>
<%@include file="top.jsp"%>
<%@include file="left_suguan.jsp"%>

<div id="right_content">
    <form action="/updateDor_sstu.do" method="post">
        <input type="hidden" name="method" value="add"/>
        姓&nbsp;名:<input type="text" name="s_name"><br/>
        密&nbsp;码:<input type="text" name="s_pwd"><br/>
        性&nbsp;别:<input type="text" name="s_sex"/><br/>
        班&nbsp;级:<input type="text" name="s_grade"/><br/>
        状&nbsp;态:<input type="text" name="s_status"/><br/>
        <input type="submit" value="添加"/>
    </form>
</div>
</body>
</html>
