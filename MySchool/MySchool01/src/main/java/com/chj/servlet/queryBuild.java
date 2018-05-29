package com.chj.servlet;

import com.chj.entity.BuildingEntity;
import com.chj.service.BuildingService;
import com.chj.service.BuildingadminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2018/5/17.
 */
@WebServlet(urlPatterns = {"/queryBuild.do"})
public class queryBuild extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getParameter("method");
        BuildingService service=new BuildingService();

        if (null==method||!method.equals("queryid")){
            List<BuildingEntity> list=service.queryAll();
            req.setAttribute("list",list);
            req.getRequestDispatcher("/view/showBuild.jsp").forward(req,resp);
        }else {
            String id=req.getParameter("id");
            BuildingEntity bu=service.queryById(id);
            req.setAttribute("bu",bu);
            req.getRequestDispatcher("/view/updateBuild.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
