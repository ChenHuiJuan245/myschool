<%@ page import="com.chj.entity.In_out_dorEntity" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/28
  Time: 15:17
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
    <% In_out_dorEntity in= (In_out_dorEntity) request.getAttribute("inss");%>
        <form action="/out.do" method="post">
            <input type="hidden" name="method" value="exchange">

            <input type="submit" value="修改"/>
        </form>
</div>
</body>
</html>
