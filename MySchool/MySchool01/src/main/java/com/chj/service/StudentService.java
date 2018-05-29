package com.chj.service;

import com.chj.dao.StudentDaoImpl;
import com.chj.entity.Page;
import com.chj.entity.StudentEntity;

import java.util.List;

/**
 * Created by Administrator on 2018/5/16.
 */
public class StudentService {

    StudentDaoImpl dao=new StudentDaoImpl();
    //登录
    public StudentEntity login(String s_name, int s_pwd){
        String sql="select * from student where s_name=? and s_pwd=?";
        Object[] objects=new Object[]{
               s_name,s_pwd
        };
        List<StudentEntity> list=dao.executeQuery(sql,objects);
        if(list.size()>0){
            return list.get(0);
        }else {
            return null;
        }
    }


    /***
     * 查询学生信息
     * @return
     */
    public List<StudentEntity> queryAll()
    {
        String sql = "select * from student";
        return dao.executeQuery(sql,null);
    }


    public StudentEntity queryById(int s_id)
    {
        String sql = "select * from student where s_id=?";

        List<StudentEntity> list =  dao.executeQuery(sql,new Object[]{s_id});
        if(list.size()>0)
            return list.get(0);
        else
            return null;
    }

    //添加学生信息
    public int addStu(StudentEntity stu){
        String sql="insert into student values(null,?,?,?,?,?)";
        Object[] objects=new Object[]{
                stu.getS_name(),
                stu.getS_pwd(),
                stu.getS_sex(),
                stu.getS_grade(),
                stu.getS_status()
        };
        return  dao.executeUpdate(sql,objects);
    }

    //修改学生信息
    public int updateStu(StudentEntity stu){
        String sql="update student set s_name=?,s_pwd=?,s_sex=?,s_grade=?,s_status=? where s_id=?";
        Object[] objects=new Object[]{
                stu.getS_name(),
                stu.getS_pwd(),
                stu.getS_sex(),
                stu.getS_grade(),
                stu.getS_status(),
                stu.getS_id()
        };
        return  dao.executeUpdate(sql,objects);
    }

    //修改学生密码
    public int updateStuPwd(int s_id, String s_pwd){
        String sql="update student set s_pwd=? where s_id=?";
        Object[] objects=new Object[]{
                s_pwd,s_id
        };
        return  dao.executeUpdate(sql,objects);
    }

    //删除学生
    public  int deleteStu(String  s_id){
        String sql="delete from student where s_id=?";
        Object[] objects=new Object[]{
                s_id
        };
        return dao.executeUpdate(sql,objects);
    }

    public Page findProductByPageNo(Page page){
        String sql_count="select count(*) from student";
        int totalcount=dao.executeQueryCountByPage(sql_count,null);
        page.setTotalCount(totalcount);
        String sql_list="select * from student limit ?,?";
        Object[] objects=new Object[]{
                (page.getCurenPage()-1)*page.getPageSize(),
                page.getPageSize()
        };
        List<StudentEntity> list=dao.executeQuery(sql_list,objects);
        page.setArrays(list);
        return page;
    }
}
