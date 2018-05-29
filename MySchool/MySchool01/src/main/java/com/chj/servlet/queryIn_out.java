package com.chj.servlet;

import com.chj.entity.In_out_dorEntity;
import com.chj.service.In_out_dorService;

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
@WebServlet(urlPatterns = {"/queryin_out.do"})
public class queryIn_out extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getParameter("method");
        String s_id=req.getParameter("s_id");
        In_out_dorService service=new In_out_dorService();
        if (null == method || !method.equals("queryid")) {
            List<In_out_dorEntity> list=service.queryAll();
            req.setAttribute("list",list);
            req.getRequestDispatcher("/view/showIn_out.jsp").forward(req,resp);
        }else {
            String id=req.getParameter("id");
            In_out_dorEntity in=service.queryById(id);
            req.setAttribute("in",in);
            req.getRequestDispatcher("/view/updateIn_out.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
