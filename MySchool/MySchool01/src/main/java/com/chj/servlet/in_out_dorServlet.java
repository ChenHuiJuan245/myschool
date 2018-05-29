package com.chj.servlet;

import com.chj.entity.In_out_dorEntity;
import com.chj.entity.StudentEntity;
import com.chj.service.In_out_dorService;
import com.chj.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/5/21.
 */
@WebServlet(urlPatterns = {"/in.do"})
public class in_out_dorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        In_out_dorService service=new In_out_dorService();
        StudentService studentService=new StudentService();

        String s_id=req.getParameter("s_id");
        String to_b_id=req.getParameter("to_b_id");
        String to_d_id=req.getParameter("to_d_id");

        /*String in_date=req.getParameter("in_date");
        String out_date=req.getParameter("out_date");
        try {
            Date date=sdf.parse(in_date);
            Date date1=sdf.parse(out_date);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/

        int flag=0;
        In_out_dorEntity in=new In_out_dorEntity();
        in.setS_id(Integer.parseInt(s_id));
        in.setTo_b_id(Integer.parseInt(to_b_id));
        in.setTo_d_id(Integer.parseInt(to_d_id));
        flag=service.addIN(in);
        req.getRequestDispatcher("/view/addIn.jsp").forward(req,resp);
    }
}
