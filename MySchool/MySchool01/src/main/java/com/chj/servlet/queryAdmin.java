package com.chj.servlet;

import com.chj.entity.AdminEntity;
import com.chj.service.AdminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2018/5/22.
 */
@WebServlet(urlPatterns = {"/queryAdmin.do"})
public class queryAdmin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getParameter("method");
        AdminService service=new AdminService();

        if (null==method||!method.equals("queryid")){
            List<AdminEntity> list=service.queryAll();
            req.setAttribute("list",list);
            req.getRequestDispatcher("/view/showBuild.jsp").forward(req,resp);
        }else {
            String id=req.getParameter("id");
            AdminEntity bu=service.queryById(Integer.parseInt(id));
            req.setAttribute("bu",bu);
            req.getRequestDispatcher("/view/updateBuild.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
