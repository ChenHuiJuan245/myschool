package com.chj.dao;

import com.chj.entity.In_out_dorEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/20.
 */
public class In_out_dorDaoImpl extends  BaseDAO<In_out_dorEntity>{

    @Override
    public List<In_out_dorEntity> rsToList(ResultSet rs) throws SQLException {
        List<In_out_dorEntity> list=new ArrayList<In_out_dorEntity>();
        while (rs.next()){
            In_out_dorEntity in=new In_out_dorEntity();
            in.setIn_id(rs.getInt("in_id"));
            in.setB_id(rs.getInt("b_id"));
            in.setD_id(rs.getInt("d_id"));
            in.setS_id(rs.getInt("s_id"));
            in.setIn_date(rs.getString("in_date"));
            in.setOut_date(rs.getString("out_date"));
            in.setTo_b_id(rs.getInt("to_b_id"));
            in.setTo_d_id(rs.getInt("to_d_id"));
            list.add(in);
        }
        return list;
    }
}
