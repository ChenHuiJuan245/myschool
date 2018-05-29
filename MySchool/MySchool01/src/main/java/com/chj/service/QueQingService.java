package com.chj.service;

import com.chj.dao.QueqingDaoImpl;
import com.chj.entity.In_out_dorEntity;
import com.chj.entity.QueqingEntity;

import java.util.List;

/**
 * Created by Administrator on 2018/5/21.
 */
public class QueQingService {
    QueqingDaoImpl dao=new QueqingDaoImpl();

    public QueqingEntity queryById(int q_id)
    {
        String sql = "select * from queqing where q_id=?";

        List<QueqingEntity> list =  dao.executeQuery(sql,new Object[]{q_id});
        if(list.size()>0)
            return list.get(0);
        else
            return null;
    }

    /*public QueqingEntity queryByStuId(int s_id)
    {
        String sql = "select * from queqing where s_id=?";
        List<QueqingEntity> list=dao.executeQuery(sql,new Object[]{s_id});
        if (list.size()>0){
            return list.get(0);
        }else
            return null;
    }*/
    public List<QueqingEntity> queryByStuId(int s_id)
    {
        String sql = "select * from queqing where s_id=?";
        Object[] objects=new Object[]{s_id};
        return dao.executeQuery(sql,objects);
    }

    public QueqingEntity queryByIdss(int b_id,int d_id,int s_id)
    {
        String sql = "select * from queqing where b_id=?,d_id=?,s_id=?";
        List<QueqingEntity> list= dao.executeQuery(sql,new Object[]{b_id,d_id,s_id});
        if(list.size()>0)
            return list.get(0);
        else
            return null;
    }

    public List<QueqingEntity> queryAll()
    {
        String sql = "select * from queqing";
        return dao.executeQuery(sql,null);
    }

    public int addQueqing(QueqingEntity q){
        String sql="insert into queqing values(null,?,?,?,?,?,?,?,?)";
        Object[] objects=new Object[]{
                q.getB_id(),
                q.getD_id(),
                q.getS_id(),
                q.getS_name(),
                q.getS_sex(),
                q.getQ_date(),
                q.getBeizu(),
                q.getBa_name(),
        };
        return  dao.executeUpdate(sql,objects);
    }
}
