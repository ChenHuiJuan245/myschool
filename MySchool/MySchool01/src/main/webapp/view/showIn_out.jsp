<%@ page import="com.chj.entity.In_out_dorEntity" %>
<%@ page import="com.chj.entity.BuildingEntity" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/22
  Time: 10:18
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
       <%-- <span>功能导航：
               <a href="/view/addIn.jsp" style="text-decoration: none;">添加入住</a>
               &lt;%&ndash; <a href="/view/addBuild.jsp" style="text-decoration: none;">添加入住</a>&ndash;%&gt;
         </span><br/><br/>--%>
        <% List<In_out_dorEntity> list= (List<In_out_dorEntity>) request.getAttribute("list");%>
        <table width="1000px" cellspacing="3px" cellpadding="3px"
               class="table table-hover table-striped table-bordered table-responsive">
            <tr class="info">
                <td>入住编号</td>
                <td>楼宇编号</td>
                <td>宿舍编号</td>
                <td>学号</td>
                <td>入住时间</td>
                <td>迁出时间</td>
                <td>调换楼宇</td>
                <td>调换宿舍</td>
                <td>操作</td>
            </tr>
            <% for (In_out_dorEntity in:list){%>
            <tr>
                <td><%=in.getIn_id()%></td>
                <td><%=in.getB_id()%></td>
                <td><%=in.getD_id()%></td>
                <td><%=in.getS_id()%></td>
                <td><%=in.getIn_date()%></td>
                <td><%=in.getOut_date()%></td>
                <td><%=in.getTo_b_id()%></td>
                <td><%=in.getTo_d_id()%></td>
                <td>
                    <a href="queryin_out.do?method=queryid&id=<%=in.getIn_id()%>" style="text-decoration: none;">迁出登记</a>
                </td>
            </tr>
            <%}%>
        </table>
    </div>
</body>
</html>
