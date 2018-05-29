package com.chj.dao;

import com.chj.entity.BuildingEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/16.
 */
public class BuildingDaoImpl extends BaseDAO<BuildingEntity> {
    @Override
    public List<BuildingEntity> rsToList(ResultSet rs) throws SQLException {
        List<BuildingEntity> list=new ArrayList<BuildingEntity>();
        while (rs.next()){
            BuildingEntity b=new BuildingEntity();
            b.setB_id(rs.getInt("b_id"));
            b.setB_name(rs.getString("b_name"));
            b.setB_jianjie(rs.getString("b_jianjie"));
            b.setBa_id(rs.getInt("ba_id"));
            list.add(b);
        }
        return list;
    }
}
