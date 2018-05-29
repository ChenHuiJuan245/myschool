package com.chj.service;

import com.chj.dao.In_out_dorDaoImpl;
import com.chj.entity.In_out_dorEntity;

import java.util.List;

/**
 * Created by Administrator on 2018/5/20.
 */
public class In_out_dorService {
    In_out_dorDaoImpl dao=new In_out_dorDaoImpl();

    public In_out_dorEntity queryById(String in_id)
    {
        String sql = "select * from in_out_dormitory where in_id=?";

        List<In_out_dorEntity> list =  dao.executeQuery(sql,new Object[]{in_id});
        if(list.size()>0)
            return list.get(0);
        else
            return null;
    }

    public In_out_dorEntity queryByS_Id(String s_id)
    {
        String sql = "select * from in_out_dormitory where s_id=?";

        List<In_out_dorEntity> list =  dao.executeQuery(sql,new Object[]{s_id});
        if(list.size()>0)
            return list.get(0);
        else
            return null;
    }

    public In_out_dorEntity queryByS_Id2(String s_id)
    {
        String sql = "select * from in_out_dormitory where s_id=?";

        List<In_out_dorEntity> list =  dao.executeQuery(sql,new Object[]{s_id});
        if(list.size()>0)
            return list.get(0);
        else
            return null;
    }

    //添加入住
    public int addIN(In_out_dorEntity in){
        String sql = "insert into in_out_dormitory(in_id,b_id,d_id,s_id,in_date) values(null,?,?,?,?)";
        Object[] objects = new Object[]{
                in.getB_id(),
                in.getD_id(),
                in.getS_id(),
                in.getIn_date(),
        };
        return dao.executeUpdate(sql, objects);
    }

    //迁出登记
    public int outDor(String out_date,int in_id){
        String sql="update in_out_dormitory set out_date=? where in_id=?";
        Object[] objects=new Object[]{
                out_date,in_id
        };
        return  dao.executeUpdate(sql,objects);
    }

    public List<In_out_dorEntity> queryAll()
    {
        String sql = "select * from in_out_dormitory";
        return dao.executeQuery(sql,null);
    }


}
