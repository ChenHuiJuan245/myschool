package com.chj.dao;

import com.chj.entity.QueqingEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/21.
 */
public class QueqingDaoImpl extends  BaseDAO<QueqingEntity>{
    @Override
    public List<QueqingEntity> rsToList(ResultSet rs) throws SQLException {
        List<QueqingEntity> list=new ArrayList<QueqingEntity>();
        while (rs.next()){
            QueqingEntity q=new QueqingEntity();
            q.setQ_id(rs.getInt("q_id"));
            q.setB_id(rs.getInt("b_id"));
            q.setD_id(rs.getInt("d_id"));
            q.setS_id(rs.getInt("s_id"));
            q.setS_name(rs.getString("s_name"));
            q.setS_sex(rs.getInt("s_sex"));
            q.setQ_date(rs.getString("q_date"));
            q.setBeizu(rs.getString("beizu"));
            q.setBa_name(rs.getString("ba_name"));
            list.add(q);
        }
        return list;
    }
}
