package com.chj.servlet;

import com.chj.entity.BuildingEntity;
import com.chj.service.BuildingService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2018/5/17.
 */
@WebServlet(urlPatterns = {"/updateBuild.do"})
public class updateBuild extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getParameter("method");
        BuildingService service=new BuildingService();
        BuildingEntity bu=new BuildingEntity();
        String b_id=req.getParameter("b_id");
        String b_name=req.getParameter("b_name");
        String b_jianjie=req.getParameter("b_jianjie");
        String ba_id=req.getParameter("ba_id");
        int flag=0;
        if (method.equals("add")) {
            bu.setB_name(b_name);
            bu.setB_jianjie(b_jianjie);
            bu.setBa_id(Integer.parseInt(ba_id));
            flag=service.addBuild(bu);
        } else if (method.equals("delete")) {
            String id=req.getParameter("id");
            flag=service.deleteBuild(id);
        }else if (method.equals("update")){
            bu.setB_name(b_name);
            bu.setB_jianjie(b_jianjie);
            bu.setBa_id(Integer.parseInt(ba_id));
            bu.setB_id(Integer.parseInt(b_id));
            flag=service.updateBuild(bu);
        }
        if (flag>0){
            req.getRequestDispatcher("queryBuild.do").forward(req,resp);
        }
    }
}
