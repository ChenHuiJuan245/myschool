package com.chj.servlet;

import com.chj.entity.BuildingadminEntity;
import com.chj.service.BuildingadminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2018/5/16.
 */
@WebServlet(urlPatterns = {"/queryBuildAdmin.do"})
public class queryBuildAdmin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getParameter("method");
        BuildingadminService service=new BuildingadminService();
        if (null==method || !method.equals("queryid")){
            List<BuildingadminEntity> list=service.queryAll();
            req.setAttribute("list",list);
            req.getRequestDispatcher("/view/showBuildAdmin.jsp").forward(req,resp);
        }else {
            String id=req.getParameter("id");
            BuildingadminEntity p=service.queryById(Integer.parseInt(id));
            req.setAttribute("buildupdate",p);
            req.getRequestDispatcher("/view/updateBadmin.jsp").forward(req,resp);
        }
    }
}
