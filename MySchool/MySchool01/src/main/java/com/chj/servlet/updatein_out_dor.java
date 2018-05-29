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
import java.util.List;

/**
 * Created by Administrator on 2018/5/21.
 */
@WebServlet(urlPatterns = {"/out.do"})
public class updatein_out_dor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String method=req.getParameter("method");
        In_out_dorEntity in=new In_out_dorEntity();
        In_out_dorService service=new In_out_dorService();
        int flag=0;
        String in_id=req.getParameter("in_id");
        String b_id=req.getParameter("b_id");
        String d_id=req.getParameter("d_id");
        String s_id=req.getParameter("s_id");
        String in_date=req.getParameter("in_date");
        String out_date=req.getParameter("out_date");
        String to_b_id=req.getParameter("to_b_id");
        String to_d_id=req.getParameter("to_d_id");

        if (method.equals("add")){
            in.setB_id(Integer.parseInt(b_id));
            in.setD_id(Integer.parseInt(d_id));
            in.setS_id(Integer.parseInt(s_id));
            in.setIn_date(sdf.format(date));
            flag=service.addIN(in);
        } else if (method.equals("update")) {
            In_out_dorEntity ins=  service.queryByS_Id(s_id);
            String date1=sdf.format(date);
            int in_ids=ins.getIn_id();
            flag=service.outDor(date1,in_ids);
        }else if (method.equals("exchange")){
            In_out_dorEntity inss=service.queryByS_Id(s_id);
            req.setAttribute("inss",inss);
            req.getRequestDispatcher("/view/showexchange.jsp").forward(req,resp);
        }
        if (flag>0){
            req.getRequestDispatcher("/queryin_out.do").forward(req,resp);
        }



    }
}
