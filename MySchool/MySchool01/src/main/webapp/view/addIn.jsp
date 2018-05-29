<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/21
  Time: 16:33
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
            padding-left: 100px;
            padding-top: 100px;
        }
    </style>
</head>
<body>
    <%@include file="top.jsp"%>
    <%@include file="left_admin.jsp"%>
    <div id="right_content">
        <form action="/out.do" method="post">
            <input type="hidden" name="method" value="add"/>
            楼宇编号:<input type="text" name="b_id"><br/><br/>
            宿舍编号:<input type="text" name="d_id"><br/><br/>
            学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号:<input type="text" name="s_id"/><br/><br/>
            入住日期:<input  type="date" name="in_date"/><br/><br/>
            <input type="submit" value="确定入住"/>
        </form>
    </div>
</body>
</html>
