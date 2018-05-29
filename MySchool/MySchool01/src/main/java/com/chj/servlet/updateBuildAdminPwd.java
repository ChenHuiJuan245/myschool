package com.chj.servlet;

import com.chj.entity.BuildingadminEntity;
import com.chj.service.BuildingadminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2018/5/26.
 */
@WebServlet(urlPatterns = {"/updateBuildAdminPwd.do"})

public class updateBuildAdminPwd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BuildingadminService service=new BuildingadminService();
        BuildingadminEntity build= (BuildingadminEntity) req.getSession().getAttribute("build");
        PrintWriter out=resp.getWriter();
        String ba_pwd=req.getParameter("ba_pwd");
        String ba_newpwd=req.getParameter("ba_newpwd");
        String ba_newpwds=req.getParameter("ba_newpwds");

        if (ba_newpwd.equals(ba_newpwds)){
            if (ba_newpwd.equals(build.getBa_pwd())){
                out.print("与原密码不一致");
                req.getRequestDispatcher("/view/updateBuildAdminPwd.jsp").forward(req,resp);
            }else {

                int ba_id=build.getBa_id();
                int flag=service.updateBuildAdminPwd(ba_newpwd,ba_id);
                req.getRequestDispatcher("/view/login.jsp").forward(req,resp);
            }
        }else {
            out.print("密码不一致");
            req.getRequestDispatcher("/view/updateBuildAdminPwd.jsp").forward(req,resp);
        }
    }
}
