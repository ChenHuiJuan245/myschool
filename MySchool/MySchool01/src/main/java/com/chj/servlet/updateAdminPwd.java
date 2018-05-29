package com.chj.servlet;

import com.chj.entity.AdminEntity;
import com.chj.entity.StudentEntity;
import com.chj.service.AdminService;
import com.chj.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.chj.servlet.Gloab_user.stu;

/**
 * Created by Administrator on 2018/5/26.
 */
@WebServlet(urlPatterns = {"/updateAdminPwd.do"})
public class updateAdminPwd extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AdminService service=new AdminService();
        AdminEntity admin= (AdminEntity) req.getSession().getAttribute("admin");
        PrintWriter out=resp.getWriter();

        String a_pwd=req.getParameter("a_pwd");
        String a_newpwd=req.getParameter("a_newpwd");
        String a_newpwds=req.getParameter("a_newpwds");

        if (a_newpwd.equals(a_newpwds)){
            if (a_pwd.equals(admin.getA_pwd())){
                int a_id=admin.getA_id();
                int flag=service.updateAdminPwd(a_id,a_newpwd);
                req.getRequestDispatcher("/view/login.jsp").forward(req,resp);
            }else {
                out.print("与原密码不一致");
                req.getRequestDispatcher("/view/updateAdminPwd.jsp").forward(req,resp);
            }
        }else {
            out.print("密码不一致");
            req.getRequestDispatcher("/view/updateAdminPwd.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
