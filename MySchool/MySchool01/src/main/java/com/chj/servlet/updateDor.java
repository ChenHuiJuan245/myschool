package com.chj.servlet;

import com.chj.entity.DormitoryEntity;
import com.chj.service.DormitoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2018/5/18.
 */
@WebServlet(urlPatterns = {"/updateDor.do"})
public class updateDor extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getParameter("method");
        int flag=0;
        String d_id=req.getParameter("d_id");
        String b_id=req.getParameter("b_id");
        String d_type=req.getParameter("d_type");
        String d_count=req.getParameter("d_count");
        String d_tel=req.getParameter("d_tel");
        String ba_id=req.getParameter("ba_id");
        DormitoryEntity dor=new DormitoryEntity();
        DormitoryService service=new DormitoryService();

        if (method.equals("add")){
            dor.setB_id(Integer.parseInt(b_id));
            dor.setD_type(Integer.parseInt(d_type));
            dor.setD_count(Integer.parseInt(d_count));
            dor.setD_tel(Integer.parseInt(d_tel));
            dor.setBa_id(Integer.parseInt(ba_id));
            flag=service.addDor(dor);
        } else if (method.equals("delete")) {
            String id=req.getParameter("id");
            flag=service.deleteDor(id);
        } else if (method.equals("update")) {
            dor.setD_id(Integer.parseInt(d_id));
            dor.setB_id(Integer.parseInt(b_id));
            dor.setD_type(Integer.parseInt(d_type));
            dor.setD_count(Integer.parseInt(d_count));
            dor.setD_tel(Integer.parseInt(d_tel));
            dor.setBa_id(Integer.parseInt(ba_id));
            flag=service.updateDor(dor);
        }

        if (flag>0){
            req.getRequestDispatcher("querydor.do").forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
