package com.chj.dao;

import com.chj.entity.DormitoryEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/16.
 */
public class DormitoryDaoImpl extends BaseDAO<DormitoryEntity> {
    @Override
    public List<DormitoryEntity> rsToList(ResultSet rs) throws SQLException {
        List<DormitoryEntity> list=new ArrayList<DormitoryEntity>();
        while (rs.next()){
            DormitoryEntity d=new DormitoryEntity();
            d.setD_id(rs.getInt("d_id"));
            d.setB_id(rs.getInt("b_id"));
            d.setD_type(rs.getInt("d_type"));
            d.setD_count(rs.getInt("d_count"));
            d.setD_tel(rs.getInt("d_tel"));
            d.setBa_id(rs.getInt("ba_id"));
            list.add(d);
        }
        return  list;
    }
}
