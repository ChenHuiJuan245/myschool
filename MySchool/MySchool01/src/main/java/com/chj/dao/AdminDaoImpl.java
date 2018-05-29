package com.chj.dao;

import com.chj.entity.AdminEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/18.
 */
public class AdminDaoImpl extends BaseDAO<AdminEntity>{

    @Override
    public List<AdminEntity> rsToList(ResultSet rs) throws SQLException {
        List<AdminEntity> list=new ArrayList<AdminEntity>();
        while (rs.next()){
            AdminEntity a=new AdminEntity();
            a.setA_id(rs.getInt("a_id"));
            a.setA_name(rs.getString("a_name"));
            a.setA_pwd(rs.getString("a_pwd"));
            list.add(a);
        }
        return list;
    }
}
