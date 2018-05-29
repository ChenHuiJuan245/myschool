package com.chj.servlet;

import com.chj.entity.StudentEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Administrator on 2018/5/21.
 */
@WebServlet(urlPatterns = {"/exitStu.do"})
public class exitStu extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        StudentEntity stu= (StudentEntity) session.getAttribute("stu");
        if (stu != null){
            session.removeAttribute("stu");
            req.setAttribute("info",stu.getS_name()+"已退出");
        }
        req.getRequestDispatcher("/view/login.jsp").forward(req,resp);
    }
}
