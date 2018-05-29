<%@ page import="com.chj.entity.BuildingadminEntity" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/17
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<%@include file="left_admin.jsp"%>
    <div id="right_content">
        <div id="right_top">
            <h4>楼宇管理员管理</h4>
            <span>功能导航：<a href="/view/addBuildAdmin.jsp" style="text-decoration: none;">添加楼宇管理员</a></span>
            <br/><br/>
        </div>
        <div>
        <% List<BuildingadminEntity> list= (List<BuildingadminEntity>) request.getAttribute("list");%>
        <table width="800px" cellspacing="3px" cellpadding="3px"
               class="table table-hover table-striped table-bordered table-responsive">
            <tr class="info">
                <td>姓名</td>
                <td>性别</td>
                <td>电话</td>
                <td>用户名</td>
                <td>操作</td>
            </tr>
            <% for (BuildingadminEntity p:list){%>
            <tr>
                <td><%=p.getBa_name()%></td>
                <td><%=p.getBa_sex()%></td>
                <td><%=p.getBa_tel()%></td>
                <td><%=p.getBa_id()%></td>
                <td><a href="queryBuildAdmin.do?method=queryid&id=<%=p.getBa_id()%>">修改</a>
                    <a href="updateBadmin.do?method=delete&id=<%=p.getBa_id()%>">删除</a>
                </td>
            </tr>
            <%}%>
        </table>
        </div>
        </div>
</body>
</html>
