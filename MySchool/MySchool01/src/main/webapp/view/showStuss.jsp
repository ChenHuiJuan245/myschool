<%@ page import="com.chj.entity.StudentEntity" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/21
  Time: 16:02
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
            padding-left: 20px;
            /*border: 1px solid black;*/
        }
    </style>
</head>
<body>
<%@include file="top.jsp"%>
<%@include file="left_admin.jsp"  %>
<div id="right_content">
    <div id="right_top">
        <h4>学生管理</h4>
        <span>功能导航：
                <a href="/view/addStu.jsp" style="text-decoration: none;">添加学生</a>
            </span>
        <br/><br/>
    </div>
    <%  List<StudentEntity> list= (List<StudentEntity>) request.getAttribute("list");%>
    <table width="800px" cellspacing="3px" cellpadding="3px"
           class="table table-hover table-striped table-bordered table-responsive">
        <tr class="info">
            <td>学号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>班级</td>
            <td>状态</td>
            <td>操作</td>
        </tr>
        <% for (StudentEntity s:list){%>
        <tr>
            <td><%=s.getS_id()%></td>
            <td><%=s.getS_name()%></td>
            <td><%=s.getS_sex()%></td>
            <td><%=s.getS_grade()%></td>
            <td><%=s.getS_status()%></td>
            <td><a href="querystu.do?method=queryid&id=<%=s.getS_id()%>">修改</a>
                <a href="updatestu.do?method=delete&id=<%=s.getS_id()%>">删除</a>
            </td>
        </tr>
        <%}%>
    </table>
</div>
</body>
</html>
