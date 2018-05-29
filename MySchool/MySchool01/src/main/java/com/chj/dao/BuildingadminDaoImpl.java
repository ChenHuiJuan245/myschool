package com.chj.dao;

import com.chj.entity.BuildingadminEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/16.
 */
public class BuildingadminDaoImpl extends BaseDAO<BuildingadminEntity> {
    @Override
    public List<BuildingadminEntity> rsToList(ResultSet rs) throws SQLException {
        List<BuildingadminEntity> list=new ArrayList<BuildingadminEntity>();
        while (rs.next()){
            BuildingadminEntity bu=new BuildingadminEntity();
            bu.setBa_id(rs.getInt("ba_id"));
            bu.setBa_name(rs.getString("ba_name"));
            bu.setBa_pwd(rs.getInt("ba_pwd"));
            bu.setBa_sex(rs.getInt("ba_sex"));
            bu.setBa_tel(rs.getInt("ba_tel"));
            list.add(bu);
        }
        return list;
    }
}
