package com.chj.dao;

import com.chj.entity.StudentEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/16.
 */
public class StudentDaoImpl extends BaseDAO<StudentEntity> {
    @Override
    public List<StudentEntity> rsToList(ResultSet rs) throws SQLException {
       /* List<OrdersEntity> list=new ArrayList<OrdersEntity>();
        while (rs.next()) {
            OrdersEntity o=new OrdersEntity();
            o.setOID(rs.getInt("OID"));
            o.setODATE(rs.getString("ODATE"));
            o.setOSTATE(rs.getInt("OSTATE"));
            o.setUID(rs.getInt("UID"));
            o.setOMONEY(rs.getInt("OMONEY"));
            list.add(o);
        }
        return list;*/
       List<StudentEntity> list=new ArrayList<StudentEntity>();
       while (rs.next()){
           StudentEntity s=new StudentEntity();
           s.setS_id(rs.getInt("s_id"));
           s.setS_name(rs.getString("s_name"));
           s.setS_pwd(rs.getInt("s_pwd"));
           s.setS_sex(rs.getInt("s_sex"));
           s.setS_grade(rs.getInt("s_grade"));
           s.setS_status(rs.getInt("s_status"));
           list.add(s);
       }
       return list;
    }
}
