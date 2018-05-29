package com.chj.service;

import com.chj.dao.BuildingDaoImpl;
import com.chj.entity.BuildingEntity;

import java.util.List;

/**
 * Created by Administrator on 2018/5/16.
 */
public class BuildingService {
    BuildingDaoImpl dao=new BuildingDaoImpl();

    public List<BuildingEntity> queryAll()
    {
        String sql = "select * from building";
        return dao.executeQuery(sql,null);
    }


    public BuildingEntity queryById(String b_id)
    {
        String sql = "select * from building where b_id=?";

        List<BuildingEntity> list =  dao.executeQuery(sql,new Object[]{b_id});
        if(list.size()>0)
            return list.get(0);
        else
            return null;
    }

    //添加
    public int addBuild(BuildingEntity bu){
        String sql="insert into building values(null,?,?,?)";
        Object[] objects=new Object[]{
                bu.getB_name(),
                bu.getB_jianjie(),
                bu.getBa_id()
        };
        return  dao.executeUpdate(sql,objects);
    }

    //修改
    public int updateBuild(BuildingEntity bu){
        String sql="update building set b_name=?,b_jianjie=?,ba_id=? where b_id=?";
        Object[] objects=new Object[]{
                bu.getB_name(),
                bu.getB_jianjie(),
                bu.getBa_id(),
                bu.getB_id()
        };
        return  dao.executeUpdate(sql,objects);
    }

    //删除
    public  int deleteBuild(String b_id){
        String sql="delete from building where b_id=?";
        Object[] objects=new Object[]{
                b_id
        };
        return dao.executeUpdate(sql,objects);
    }
}
