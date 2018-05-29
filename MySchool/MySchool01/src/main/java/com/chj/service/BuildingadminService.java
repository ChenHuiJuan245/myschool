package com.chj.service;

import com.chj.dao.BuildingadminDaoImpl;
import com.chj.entity.BuildingEntity;
import com.chj.entity.BuildingadminEntity;

import java.util.List;

/**
 * Created by Administrator on 2018/5/16.
 */
public class BuildingadminService {
    BuildingadminDaoImpl dao=new BuildingadminDaoImpl();

    //登录
    public BuildingadminEntity login(String ba_name, int ba_pwd){
        String sql="select * from buildingadmin where ba_name=? and ba_pwd=?";
        Object[] objects=new Object[]{
                ba_name,ba_pwd
        };
        List<BuildingadminEntity> list=dao.executeQuery(sql,objects);
        if(list.size()>0){
            return list.get(0);
        }else {
            return null;
        }
    }

    //修改密码
    public int updateBuildAdminPwd(String ba_pwd,int ba_id){
        String sql="update buildingadmin set ba_pwd=? where ba_id=?";
        Object[] objects=new Object[]{
                ba_pwd,ba_id
        };
        return  dao.executeUpdate(sql,objects);
    }

    public List<BuildingadminEntity> queryAll()
    {
        String sql = "select * from buildingadmin";
        return dao.executeQuery(sql,null);
    }


    public BuildingadminEntity queryById(int ba_id)
    {
        String sql = "select * from buildingadmin where ba_id=?";

        List<BuildingadminEntity> list =  dao.executeQuery(sql,new Object[]{ba_id});
        if(list.size()>0)
            return list.get(0);
        else
            return null;
    }

    //添加
    public int addBa(BuildingadminEntity bu){
        String sql="insert into buildingadmin values(null,?,?,?,?)";
        Object[] objects=new Object[]{
                bu.getBa_name(),
                bu.getBa_pwd(),
                bu.getBa_sex(),
                bu.getBa_tel(),
        };
        return  dao.executeUpdate(sql,objects);
    }

    //修改
    public int updateBa(BuildingadminEntity bu){
        String sql="update buildingadmin set ba_name=?,ba_pwd=?,ba_sex=?,ba_tel=? where ba_id=?";
        Object[] objects=new Object[]{
                bu.getBa_name(),
                bu.getBa_pwd(),
                bu.getBa_sex(),
                bu.getBa_tel(),
                bu.getBa_id()
        };
        return  dao.executeUpdate(sql,objects);
    }

    //删除
    public  int deleteBa(String  ba_id){
        String sql="delete from buildingadmin where ba_id=?";
        Object[] objects=new Object[]{
                ba_id
        };
        return dao.executeUpdate(sql,objects);
    }

}
