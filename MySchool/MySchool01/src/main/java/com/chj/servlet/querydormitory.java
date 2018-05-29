package com.chj.servlet;

import com.chj.entity.DormitoryEntity;
import com.chj.service.DormitoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2018/5/18.
 */
@WebServlet(urlPatterns = {"/querydor.do"})
public class querydormitory extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getParameter("method");
        DormitoryService service=new DormitoryService();
        if (null==method||!method.equals("queryid")){
            List<DormitoryEntity> list=service.queryAll();
            req.setAttribute("list",list);
            req.getRequestDispatcher("/view/showDor.jsp").forward(req,resp);
        }else {
            String id=req.getParameter("id");
            DormitoryEntity dor=service.queryById(Integer.parseInt(id));
            req.setAttribute("dor",dor);
            req.getRequestDispatcher("updateDor.do").forward(req,resp);
        }
    }
}
