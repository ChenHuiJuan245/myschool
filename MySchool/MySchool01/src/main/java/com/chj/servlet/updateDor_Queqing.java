package com.chj.servlet;

import com.chj.entity.QueqingEntity;
import com.chj.service.QueQingService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/5/25.
 */
@WebServlet(urlPatterns = {"/updatequeqing.do"})
public class updateDor_Queqing extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getParameter("method");
        QueQingService service=new QueQingService();
        QueqingEntity q=new QueqingEntity();
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String q_id=req.getParameter("q_id");
        String b_id=req.getParameter("b_id");
        String d_id=req.getParameter("d_id");
        String s_id=req.getParameter("s_id");
        String s_name=req.getParameter("s_name");
        String s_sex=req.getParameter("s_sex");
        String q_date=req.getParameter("q_date");
        String beizu=req.getParameter("beizu");
        String ba_name=req.getParameter("ba_name");
        int flag=0;

        if (method.equals("add")){
            q.setB_id(Integer.parseInt(b_id));
            q.setD_id(Integer.parseInt(d_id));
            q.setS_id(Integer.parseInt(s_id));
            q.setS_name(s_name);
            q.setS_sex(Integer.parseInt(s_sex));
            q.setQ_date(sdf.format(date));
            q.setBeizu(beizu);
            q.setBa_name(ba_name);
            flag=service.addQueqing(q);

            if (flag>0){
            req.getRequestDispatcher("queryDor_Queqing.do").forward(req,resp);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
