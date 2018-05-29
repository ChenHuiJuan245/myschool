package com.chj.servlet;

import com.chj.entity.Page;
import com.chj.entity.StudentEntity;
import com.chj.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2018/5/28.
 */
@WebServlet(urlPatterns = {"/queryDor_stu.do"})
public class queryDor_stu extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getParameter("method");
        String pageNO=req.getParameter("pageNO");
        String type=req.getParameter("type");
        Page page=new Page();
        StudentService service=new StudentService();
        if (null == method || !method.equals("queryid")) {
            if (null!=pageNO){
                page.setCurenPage(Integer.parseInt(pageNO));
            }
            page=service.findProductByPageNo(page);
            req.setAttribute("page",page);
            req.getRequestDispatcher("/view/showDor_stu.jsp").forward(req,resp);
        }else {
            String id=req.getParameter("id");
            StudentEntity stu=service.queryById(Integer.parseInt(id));
            req.setAttribute("stu",stu);
            req.getRequestDispatcher("/view/updateDor_stu.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
