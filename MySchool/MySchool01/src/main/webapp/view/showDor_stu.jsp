<%@ page import="com.chj.entity.Page" %>
<%@ page import="com.chj.entity.StudentEntity" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/28
  Time: 0:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="../css/bootstrap-theme.min.css" />
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<script type="text/javascript" src="../js/jquery-2.1.0.js" ></script>
<script type="text/javascript" src="../js/bootstrap.min.js" ></script>
<link rel="">
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        #right_content{
            width: 1400px;
            height: 700px;
            float: left;
            padding-left: 20px;
        }
    </style>
</head>
<body>
<%@include file="top.jsp"%>
<%@include file="left_suguan.jsp" %>
<div id="right_content">
    <div id="right_top">
        <h4>学生管理</h4>
        <span>功能导航：
                <a href="/view/addDor_stu.jsp" style="text-decoration: none;">添加学生</a>
            </span>
        <br/><br/>
    </div>
    <% Page pageobj= (Page) request.getAttribute("page");%>
    <%  List<StudentEntity> list= pageobj.getArrays();%>
    <table width="1000px" cellspacing="3px" cellpadding="3px"
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
            <td><a href="queryDor_stu.do?method=queryid&id=<%=s.getS_id()%>">修改</a>
                <a href="updateDor_sstu.do?method=delete&id=<%=s.getS_id()%>">删除</a>
            </td>
        </tr>
        <%}%>
        <tr>
            <td colspan="6">
                <span>
                    共有<%=pageobj.getTotalCount()%>条记录，共分<%=pageobj.getTotalpage()%>页，
                    当前第<%=pageobj.getCurenPage()%>/<%=pageobj.getTotalpage()%>页
                </span>
                <a href="querystu.do?pageNO=<%=pageobj.getFirstpage()%>">首页</a>&nbsp;&nbsp;
                <a href="querystu.do?pageNO=<%=pageobj.getPrePage()%>">上一页</a>&nbsp;&nbsp;
                <a href="querystu.do?pageNO=<%=pageobj.getNextpage()%>">下一页</a>&nbsp;&nbsp;
                <a href="querystu.do?pageNO=<%=pageobj.getLastpage()%>">尾页</a>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
