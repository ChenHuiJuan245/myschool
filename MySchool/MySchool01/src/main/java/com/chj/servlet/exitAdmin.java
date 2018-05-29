package com.chj.servlet;

import com.chj.entity.AdminEntity;

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
@WebServlet(urlPatterns = {"/exitAdmin.do"})
public class exitAdmin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        AdminEntity admin= (AdminEntity) session.getAttribute("admin");
        if (admin != null){
            session.removeAttribute("admin");
            req.setAttribute("info",admin.getA_name()+"已退出");
        }
        req.getRequestDispatcher("/view/login.jsp").forward(req,resp);
    }
}

