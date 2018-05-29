package com.chj.servlet;

import com.chj.entity.StudentEntity;
import com.chj.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2018/5/17.
 */
@WebServlet(urlPatterns = {"/updatestu.do"})
public class updateStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getParameter("method");
        String s_id=req.getParameter("s_id");
        String s_name=req.getParameter("s_name");
        String s_pwd=req.getParameter("s_pwd");
        String s_sex=req.getParameter("s_sex");
        String s_grade=req.getParameter("s_grade");
        String s_status=req.getParameter("s_status");
        int flag=0;
        StudentEntity s=new StudentEntity();
        StudentService service=new StudentService();

        if (method.equals("add")){
                s.setS_name(s_name);
                s.setS_pwd(Integer.parseInt(s_pwd));
                s.setS_sex(Integer.parseInt(s_sex));
                s.setS_grade(Integer.parseInt(s_grade));
                s.setS_status(Integer.parseInt(s_status));
                flag=service.addStu(s);
        }else if (method.equals("delete")){
            String id=req.getParameter("id");
            flag=service.deleteStu(id);
        }else if(method.equals("update")){
            s.setS_name(s_name);
            s.setS_pwd(Integer.parseInt(s_pwd));
            s.setS_sex(Integer.parseInt(s_sex));
            s.setS_grade(Integer.parseInt(s_grade));
            s.setS_status(Integer.parseInt(s_status));
            s.setS_id(Integer.parseInt(s_id));
            flag=service.updateStu(s);
        }
        if (flag>0){
            req.getRequestDispatcher("querystu.do").forward(req,resp);
        }

    }
}
