<%@ page import="com.chj.entity.In_out_dorEntity" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/25
  Time: 10:34
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
            padding-top: 20px;
            /*border: 1px solid black;*/
        }
    </style>
</head>
<body>
    <%@include file="top.jsp"%>
    <%@include file="left_admin.jsp"%>
    <div id="right_content">
        <% List<In_out_dorEntity> list= (List<In_out_dorEntity>) request.getAttribute("list");%>
        <table width="1000px" cellspacing="3px" cellpadding="3px"
               class="table table-hover table-striped table-bordered table-responsive">
            <tr class="info">
                <td>入住编号</td>
                <td>楼宇编号</td>
                <td>宿舍编号</td>
                <td>学号</td>
                <td>迁出时间</td>
            </tr>
            <% for (In_out_dorEntity in:list){%>
            <tr>
                <td><%=in.getIn_id()%></td>
                <td><%=in.getB_id()%></td>
                <td><%=in.getD_id()%></td>
                <td><%=in.getS_id()%></td>
                <td><%=in.getOut_date()%></td>
            </tr>
            <%}%>
        </table>
    </div>
</body>
</html>
