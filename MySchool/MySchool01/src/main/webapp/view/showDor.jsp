<%@ page import="com.chj.entity.DormitoryEntity" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/18
  Time: 17:54
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
        <h4>宿舍管理</h4>
        <span>功能导航：
                    <a href="/view/addDor.jsp" style="text-decoration: none;">添加宿舍</a>
                </span>
        <br/><br/>
    </div>
        <%  List<DormitoryEntity> list= (List<DormitoryEntity>) request.getAttribute("list");%>
        <table width="800px" cellspacing="3px" cellpadding="3px"
               class="table table-hover table-striped table-bordered table-responsive">
            <tr class="info">
                <td>宿舍编号</td>
                <td>楼宇</td>
                <td>宿舍类型</td>
                <td>人数</td>
                <td>电话</td>
                <td>操作</td>
            </tr>
            <% for (DormitoryEntity d:list){%>
            <tr>
                <td><%=d.getD_id()%></td>
                <td><%=d.getB_id()%></td>
                <td><%=d.getD_type()%></td>
                <td><%=d.getD_count()%></td>
                <td><%=d.getD_tel()%></td>
                <td>
                    <a href="querydor.do?method=queryid&id=<%=d.getD_id()%>">修改</a>
                    <a href="updateDor.do?method=delete&id=<%=d.getD_id()%>">删除</a>
                </td>
            </tr>
            <%}%>
        </table>
    </div>
</body>
</html>
