package com.chj.servlet;

import com.chj.entity.BuildingadminEntity;

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
@WebServlet(urlPatterns = {"/exitBuildAdmin.do"})
public class exitBuildAdmin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        BuildingadminEntity build= (BuildingadminEntity) session.getAttribute("build");
        if (build != null){
            session.removeAttribute("build");
            req.setAttribute("info",build.getBa_name()+"已退出");
        }
        req.getRequestDispatcher("/view/login.jsp").forward(req,resp);
    }
}
