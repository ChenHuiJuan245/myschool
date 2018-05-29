package com.chj.service;

import com.chj.dao.AdminDaoImpl;
import com.chj.entity.AdminEntity;

import java.util.List;

/**
 * Created by Administrator on 2018/5/18.
 */
public class AdminService {
    AdminDaoImpl dao=new AdminDaoImpl();
    //登录
    public AdminEntity login(String a_name, int a_pwd){
        String sql="select * from admin where a_name=? and a_pwd=?";
        Object[] objects=new Object[]{
               a_name,a_pwd
        };
        List<AdminEntity> list=dao.executeQuery(sql,objects);
        if(list.size()>0){
            return list.get(0);
        }else {
            return null;
        }
    }

    //修改密码
    public int updateAdminPwd(int a_id,String a_pwd){
        String sql="update admin set a_pwd=? where a_id=?";
        Object[] objects=new Object[]{
                a_pwd,a_id
        };
        return  dao.executeUpdate(sql,objects);
    }

    public List<AdminEntity> queryAll()
    {
        String sql = "select * from admin";
        return dao.executeQuery(sql,null);
    }


    public AdminEntity queryById(int a_id)
    {
        String sql = "select * from admin where a_id=?";

        List<AdminEntity> list =  dao.executeQuery(sql,new Object[]{a_id});
        if(list.size()>0)
            return list.get(0);
        else
            return null;
    }
}
