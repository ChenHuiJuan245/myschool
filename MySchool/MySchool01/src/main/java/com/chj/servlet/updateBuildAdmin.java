package com.chj.servlet;

import com.chj.entity.BuildingadminEntity;
import com.chj.service.BuildingadminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2018/5/16.
 */
@WebServlet(urlPatterns = {"/updateBadmin.do"})
public class updateBuildAdmin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getParameter("method");
        BuildingadminService service=new BuildingadminService();
        BuildingadminEntity ba=new BuildingadminEntity();
        String ba_id=req.getParameter("ba_id");
        String ba_name=req.getParameter("ba_name");
        String ba_pwd=req.getParameter("ba_pwd");
        String ba_sex=req.getParameter("ba_sex");
        String ba_tel=req.getParameter("ba_tel");
        int flag=0;

        if (method.equals("add")){
            ba.setBa_name(ba_name);
            ba.setBa_pwd(Integer.parseInt(ba_pwd));
            ba.setBa_sex(Integer.parseInt(ba_sex));
            ba.setBa_tel(Integer.parseInt(ba_tel));
            flag=service.addBa(ba);
        }else if (method.equals("delete")){
            String id=req.getParameter("id");
            flag=service.deleteBa(id);
        }else if (method.equals("update")){
            ba.setBa_name(ba_name);
            ba.setBa_pwd(Integer.parseInt(ba_pwd));
            ba.setBa_sex(Integer.parseInt(ba_sex));
            ba.setBa_tel(Integer.parseInt(ba_tel));
            ba.setBa_id(Integer.parseInt(ba_id));
            flag=service.updateBa(ba);
        }

        if (flag>0){
            req.getRequestDispatcher("queryBuildAdmin.do").forward(req,resp);
        }
    }
}
