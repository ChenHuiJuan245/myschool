<%@ page import="com.chj.entity.DormitoryEntity" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/18
  Time: 18:31
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
        }
    </style>
</head>
<body>
<%@include file="top.jsp"%>
<%@include file="left_admin.jsp"%>
    <div id="right_content">
        <% DormitoryEntity dor= (DormitoryEntity) request.getAttribute("dor");%>
        <form action="/updateDor.do" method="post">
            <input type="hidden" name="method" value="update">
            宿舍编号:<input type="text" name="d_id" value="<%=dor.getD_id()%>" readonly><br/>
            楼&nbsp;&nbsp;宇:<input type="text" name="b_id" value="<%=dor.getB_id()%>"><br/>
            宿舍类型:<input type="text" name="d_type" value="<%=dor.getD_type()%>"/><br/>
            人&nbsp;&nbsp;数:<input type="text" name="d_count" value="<%=dor.getD_count()%>"/><br/>
            电&nbsp;&nbsp;话:<input type="text" name="d_tel" value="<%=dor.getD_tel()%>"/><br/>
            管理员编号<input type="text" name="ba_id" value="<%=dor.getBa_id()%>"><br/>
            <input type="submit" value="修改"/>
        </form>
</div>
</body>
</html>
