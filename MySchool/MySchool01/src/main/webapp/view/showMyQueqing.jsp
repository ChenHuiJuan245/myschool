<%@ page import="com.chj.entity.QueqingEntity" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/25
  Time: 11:35
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
            padding-top: 20px;
            /*border: 1px solid black;*/
        }
    </style>
    <link rel="stylesheet" href="../css/bootstrap-theme.min.css" />
    <link rel="stylesheet" href="../css/bootstrap.min.css" />
    <script type="text/javascript" src="../js/jquery-2.1.0.js" ></script>
    <script type="text/javascript" src="../js/bootstrap.min.js" ></script>
</head>
<body>
    <%@include file="top.jsp"%>
    <%@include file="left_stu.jsp" %>
    <div id="right_content">
        <%List<QueqingEntity> list= (List<QueqingEntity>) request.getAttribute("que");%>
        <table width="800px" cellspacing="3px" cellpadding="3px"
               class="table table-hover table-striped table-bordered table-responsive">
            <tr class="info">
                <td>缺寝编号</td>
                <td>宿舍编号</td>
                <td>学号</td>
                <td>姓名</td>
                <td>性别</td>
                <td>日期</td>
                <td>备注</td>
            </tr>
            <% for (QueqingEntity que:list){%>
                <tr>
                    <td><%=que.getQ_id()%></td>
                    <td><%=que.getD_id()%></td>
                    <td><%=que.getS_id()%></td>
                    <td><%=que.getS_name()%></td>
                    <td><%=que.getS_sex()%></td>
                    <td><%=que.getQ_date()%></td>
                    <td><%=que.getBeizu()%></td>
                </tr>
            <%}%>
        </table>
    </div>
</body>
</html>
