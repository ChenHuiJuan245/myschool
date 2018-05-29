package com.chj.servlet;

import com.chj.entity.QueqingEntity;
import com.chj.entity.StudentEntity;
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
@WebServlet(urlPatterns = {"/querymyStu.do"})
public class queryStuQueqing extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentEntity stu= (StudentEntity) req.getSession().getAttribute("stu");
        QueQingService service=new QueQingService();
        int s_id=stu.getS_id();
        List<QueqingEntity> que= (List<QueqingEntity>) service.queryByStuId(s_id);
        req.setAttribute("que",que);
        req.getRequestDispatcher("/view/showMyQueqing.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
