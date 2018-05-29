<%@ page import="java.util.List" %>
<%@ page import="com.chj.entity.BuildingEntity" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/17
  Time: 18:08
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
            border: 1px solid black;
            padding-left: 20px;
        }
    </style>

</head>
<body>
<%@include file="top.jsp"%>
<%@include file="left_admin.jsp"%>
    <div id="right_content">
        <h4>楼宇管理</h4>
        <span>功能导航：
              <a href="/view/addBuild.jsp" style="text-decoration: none;">添加楼宇</a>
         </span><br/><br/>
        <% List<BuildingEntity> list= (List<BuildingEntity>) request.getAttribute("list");%>
        <table width="800px" cellspacing="3px" cellpadding="3px"
               class="table table-hover table-striped table-bordered table-responsive">
            <tr class="info">
                <td>名称</td>
                <td>简介</td>
                <td>管理员编号</td>
                <td>操作</td>
            </tr>
            <% for(BuildingEntity b:list){%>
            <tr>
                <td><%=b.getB_name()%></td>
                <td><%=b.getB_jianjie()%></td>
                <td><%=b.getBa_id()%></td>
                <td><a href="queryBuild.do?method=queryid&id=<%=b.getB_id()%>">修改</a>
                    <a href="updateBuild.do?method=delete&id=<%=b.getB_id()%>">删除</a>
                </td>
            </tr>
            <%}%>
        </table>
    </div>

</body>
</html>
