package com.chj.service;

import com.chj.dao.DormitoryDaoImpl;
import com.chj.entity.DormitoryEntity;

import java.util.List;

/**
 * Created by Administrator on 2018/5/16.
 */
public class DormitoryService {
    DormitoryDaoImpl dao=new DormitoryDaoImpl();
    public List<DormitoryEntity> queryAll()
    {
        String sql = "select * from dormitory";
        return dao.executeQuery(sql,null);
    }


    public DormitoryEntity queryById(int d_id)
    {
        String sql = "select * from dormitory where d_id=?";

        List<DormitoryEntity> list =  dao.executeQuery(sql,new Object[]{d_id});
        if(list.size()>0)
            return list.get(0);
        else
            return null;
    }

    //添加
    public int addDor(DormitoryEntity dor){
        String sql="insert into dormitory values(null,?,?,?,?,?)";
        Object[] objects=new Object[]{
                dor.getB_id(),
                dor.getD_type(),
                dor.getD_count(),
                dor.getD_tel(),
                dor.getBa_id()
        };
        return  dao.executeUpdate(sql,objects);
    }

    //修改
    public int updateDor(DormitoryEntity dor){
        String sql="update dormitory set b_id=?,d_type=?,d_count=?,d_tel=?,ba_id=? where d_id=?";
        Object[] objects=new Object[]{
                dor.getB_id(),
                dor.getD_type(),
                dor.getD_count(),
                dor.getD_tel(),
                dor.getBa_id(),
                dor.getD_id()
        };
        return  dao.executeUpdate(sql,objects);
    }

    //删除
    public  int deleteDor(String d_id){
        String sql="delete from dormitory where d_id=?";
        Object[] objects=new Object[]{
                d_id
        };
        return dao.executeUpdate(sql,objects);
    }
}
