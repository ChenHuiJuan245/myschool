<%@ page import="com.chj.entity.QueqingEntity" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/21
  Time: 10:26
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
            width: 1400px;
            height: 700px;
            float: left;
            padding-left: 20px;
            /*border: 1px solid black;*/
        }
    </style>
</head>
<body>
<%@include file="top.jsp"%>
<%@include file="left_suguan.jsp" %>
<div id="right_content">
    <div id="right_top">
        <h4>宿舍管理</h4>
        <span>功能导航：
                    <a href="/view/addQueqing.jsp" style="text-decoration: none;">添加缺寝学生</a>
                </span>
        <br/><br/>
    </div>
    <%  List<QueqingEntity> list= (List<QueqingEntity>) request.getAttribute("list");%>
    <table width="800px" cellspacing="3px" cellpadding="3px"
           class="table table-hover table-striped table-bordered table-responsive">
        <tr class="info">
            <td>缺寝编号</td>
            <td>宿舍编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>日期</td>
            <td>备注</td>
        </tr>
        <% for (QueqingEntity q:list){%>
        <tr>
            <td><%=q.getQ_id()%></td>
            <td><%=q.getD_id()%></td>
            <td><%=q.getS_name()%></td>
            <td><%=q.getS_sex()%></td>
            <td><%=q.getQ_date()%></td>
            <td><%=q.getBeizu()%></td>
        </tr>
        <%}%>
    </table>
</div>
</body>
</html>
