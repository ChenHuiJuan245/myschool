<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/15
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--<style type="text/css">
        #login{
            position: absolute;top:35%;left: 34%;margin-top: -15px;margin-left: -20px;
            border: 1px solid darkgray;
            width: 500px;
            height: 400px;
        }
        #login form{
            padding-left: 100px;
            padding-top: 20px;
            line-height: 50px;
        }
    </style>--%>
    <link rel="stylesheet" href="../css/font-awesome.min.css"/>
    <link rel="stylesheet" href="../css/ace-fonts.css"/>
    <link rel="stylesheet" href="../css/ace.min.css"/>
    <script src="../js/ace-extra.min.js"></script>

    <link rel="stylesheet" href="../css/bootstrap-theme.min.css" />
    <link rel="stylesheet" href="../css/bootstrap.min.css" />
    <script type="text/javascript" src="../js/jquery-2.1.0.js" ></script>
    <script type="text/javascript" src="../js/bootstrap.min.js" ></script>

</head>
    <body class="login-layout blur-login">
        <div class="main-container">
            <div class="main-content">
                <div class="row">
                    <div class="col-sm-10 col-sm-offset-1">
                        <div class="login-container">

                            <div class="space-6"></div>
                            <div class="position-relative" style="padding-top: 240px">
                                <div id="login-box" class="login-box visible widget-box no-border">
                                    <div class="widget-body" >
                                        <div class="widget-main">
                                            <h4 class="header blue lighter bigger">
                                               <%-- <i class="ace-icon fa fa-coffee green"></i>--%>
                                                输入登录信息

                                            </h4>

                                            <div class="space-6"></div>

                                            <form action="../login.do" method="post">
                                                <fieldset>
                                                    <label class="block clearfix">
                                                            <span class="block input-icon input-icon-right">
                                                                <select name="type" id="type" style="width: 290px;height: 35px;">
                                                                    <option value=" ">请选择</option>
                                                                    <option value="系统管理员">系统管理员</option>
                                                                    <option value="楼宇管理员">楼宇管理员</option>
                                                                    <option value="学生">学生</option>
                                                                </select>
                                                            </span>
                                                    </label>
                                                    <label class="block clearfix">
                                                            <span class="block input-icon input-icon-right">
                                                                <input type="text" name="name" class="form-control" placeholder="用户名" />
                                                            </span>
                                                    </label>

                                                    <label class="block clearfix">
                                                            <span class="block input-icon input-icon-right">
                                                                <input type="password" name="pwd" class="form-control" placeholder="密码" />
                                                            </span>
                                                    </label>
                                                    <div class="space"></div>
                                                    <div class="clearfix">
                                                        <input type="submit" class="width-35 pull-right btn btn-sm btn-primary" value="登录"/>

                                                    </div>

                                                    <div class="space-4"></div>
                                                </fieldset>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
