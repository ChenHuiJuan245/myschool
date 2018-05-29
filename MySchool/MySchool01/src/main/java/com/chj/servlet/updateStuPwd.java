package com.chj.servlet;

import com.chj.entity.StudentEntity;
import com.chj.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

/**
 * Created by Administrator on 2018/5/21.
 */
@WebServlet(urlPatterns = {"/updateStupwd.do"})
public class updateStuPwd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentService service=new StudentService();
        StudentEntity stu= (StudentEntity) req.getSession().getAttribute("stu");
        StudentEntity stud=new StudentEntity();
        PrintWriter out=resp.getWriter();

        String s_pwd=req.getParameter("s_pwd");
        String s_newpwd=req.getParameter("s_newpwd");
        String s_newpwds=req.getParameter("s_newpwds");
        //1.s_newpwd、s_newpwds是否相等
        //2.如果相等，判断s_pwd是否正确
        //3、如果1，2都对的，修改数据库
        //4.修改成功后返回到登录页面

        if (s_newpwd.equals(s_newpwds)){
            if (s_pwd.equals(stu.getS_pwd())){
                out.print("与原密码不一致");
                req.getRequestDispatcher("/view/updateStupwd.jsp").forward(req,resp);
            }else {
                int s_id=stu.getS_id();
                int flag=service.updateStuPwd(s_id,s_newpwd);
                req.getRequestDispatcher("/view/login.jsp").forward(req,resp);
            }
        }else {
            out.print("密码不一致");
            req.getRequestDispatcher("/view/updateStupwd.jsp").forward(req,resp);
        }


       /* int id=stu.getS_id();
        int flag=service.updateStuPwd(id,s_newpwd);*/
    }
}
