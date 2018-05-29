<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/16
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/bootstrap-theme.min.css" />
    <link rel="stylesheet" href="../css/bootstrap.min.css" />
    <script type="text/javascript" src="../js/jquery-2.1.0.js" ></script>
    <script type="text/javascript" src="../js/bootstrap.min.js" ></script>

    <link rel="stylesheet" href="../css/style.css" media="screen" type="text/css" />
  <%--  <style type="text/css">
        #left{
            float: left;
        }
        #right_content{
            width:1400px;
            height: 800px;
            float: left;
            padding-left: 50px;
            border: 1px solid black;
        }
    </style>--%>
    <%--<script>
        function showStu(){
            $.ajax({
                type:"post",
                url:${pageContext.servletContext.contextPath}+"/querystu.do",
                data:null,
                success:function (data) {
                    $("#right_content").empty();
                    $("#right_content").append(data);
                    }
                });
        }

        function BuildAdmin(){
            $.ajax({
                type:"post",
                url:${pageContext.servletContext.contextPath}+"/queryBuildAdmin.do",
                data:null,
                success:function (data) {
                    $("#right_content").empty();
                    $("#right_content").append(data);
                }
            });
        }
    </script>--%>
</head>
<body>
<div id="left" style="float: left">
    <ul>
        <li class="active"><i class="fa fa-home fa-lg"></i> <a href="main_admin.jsp" >后台首页</a></li>
        <li ><i class="fa fa-envelope fa-lg"></i> <a href="../queryBuildAdmin.do">楼宇管理员管理</a></li>
        <li ><i class="fa fa-user fa-lg"></i> <a href="querystu.do">学生管理</a></li>
        <li><i class="fa fa-cogs fa-lg"></i> <a  href="queryBuild.do">楼宇管理</a></li>
        <li><i class="fa fa-power-off fa-lg"></i><a href="querydor.do">宿舍管理</a></li>
        <li><i class="fa fa-power-off fa-lg"></i><a href="../view/addIn.jsp">学生入住登记</a></li>
        <li><i class="fa fa-power-off fa-lg"></i><a href="../view/exchange_Stu.jsp">学生寝室调换</a></li>
        <li><i class="fa fa-power-off fa-lg"></i><a href="../view/updateIn_out.jsp">学生迁出登记</a></li>
        <li><i class="fa fa-power-off fa-lg"></i><a href="../queryQueqing.do">学生缺寝记录</a></li>
        <li><i class="fa fa-power-off fa-lg"></i><a href="showout.do">迁出记录</a></li>
        <li><i class="fa fa-power-off fa-lg"></i><a href="../view/updateAdminPwd.jsp">修改密码</a></li>
        <li><i class="fa fa-power-off fa-lg"></i><a href="../exitAdmin.do">退出系统</a></li>
    </ul>
</div>
</body>
</html>
