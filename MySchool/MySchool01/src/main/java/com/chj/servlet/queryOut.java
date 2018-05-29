package com.chj.servlet;

import com.chj.entity.In_out_dorEntity;
import com.chj.entity.QueqingEntity;
import com.chj.service.In_out_dorService;
import com.chj.service.QueQingService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2018/5/25.
 */
@WebServlet(urlPatterns = {"/showout.do"})
public class queryOut extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getParameter("method");
        In_out_dorService service=new In_out_dorService();
            List<In_out_dorEntity> list=service.queryAll();
            req.setAttribute("list",list);
            req.getRequestDispatcher("/view/showOut.jsp").forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
