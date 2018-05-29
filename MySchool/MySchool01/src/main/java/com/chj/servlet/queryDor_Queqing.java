package com.chj.servlet;

import com.chj.entity.QueqingEntity;
import com.chj.service.QueQingService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2018/5/21.
 */
@WebServlet(urlPatterns = {"/queryDor_Queqing.do"})
public class queryDor_Queqing extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getParameter("method");
        QueQingService service=new QueQingService();
        if (null==method||!method.equals("queryid")){
            List<QueqingEntity> list=service.queryAll();
            req.setAttribute("list",list);
            req.getRequestDispatcher("/view/showDor_QueQing.jsp").forward(req,resp);
        }else {
            String id=req.getParameter("id");
            QueqingEntity qu=service.queryById(Integer.parseInt(id));
            req.setAttribute("qu",qu);
            req.getRequestDispatcher("/view/updateDor_Queqing.jsp").forward(req,resp);
        }
    }
}
