package com.chj.servlet;

import com.chj.entity.AdminEntity;
import com.chj.entity.BuildingadminEntity;
import com.chj.entity.StudentEntity;
import com.chj.service.AdminService;
import com.chj.service.BuildingadminService;
import com.chj.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2018/5/16.
 */
@WebServlet(urlPatterns = {"/login.do"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type=req.getParameter("type");
        String name=req.getParameter("name");
        String pwd=req.getParameter("pwd");
        StudentService studentService=new StudentService();
        AdminService adminService=new AdminService();
        BuildingadminService buildingadminService=new BuildingadminService();
        PrintWriter out=resp.getWriter();

        if (type.equals("系统管理员")){
            AdminEntity admin=adminService.login(name,Integer.parseInt(pwd));
            if (admin !=null){
                req.getSession().setAttribute("admin",admin);
                req.getRequestDispatcher("/view/main_admin.jsp").forward(req,resp);
            }else {
                req.setAttribute("info","用户名或密码错误，请重新输入");
                req.getRequestDispatcher("/view/login.jsp").forward(req,resp);
            }

        }else if (type.equals("楼宇管理员")){
            BuildingadminEntity build=buildingadminService.login(name,Integer.parseInt(pwd));
            if (build !=null){
                req.getSession().setAttribute("build",build);
                req.getRequestDispatcher("/view/suguan.jsp").forward(req,resp);
            }else {
                req.setAttribute("info","用户名或密码错误，请重新输入");
                req.getRequestDispatcher("/view/login.jsp").forward(req,resp);
            }

        }else if (type.equals("学生")){
            StudentEntity stu=studentService.login(name,Integer.parseInt(pwd));
            if (stu !=null){
                req.getSession().setAttribute("stu",stu);
                req.getRequestDispatcher("/view/student.jsp").forward(req,resp);
            }else {
                req.setAttribute("info","用户名或密码错误，请重新输入");
                req.getRequestDispatcher("/view/login.jsp").forward(req, resp);
            }
        }else {
                out.print("请选择身份");
                req.getRequestDispatcher("/view/login.jsp").forward(req,resp);
        }
    }

}
