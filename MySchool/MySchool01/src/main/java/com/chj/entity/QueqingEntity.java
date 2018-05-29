package com.chj.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/21.
 */
public class QueqingEntity implements Serializable {
    private int q_id;
    private int b_id;
    private int d_id;
    private int s_id;
    private String s_name;
    private int s_sex;
    private String q_date;
    private String beizu;
    private String ba_name;

    public int getQ_id() {
        return q_id;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getS_sex() {
        return s_sex;
    }

    public void setS_sex(int s_sex) {
        this.s_sex = s_sex;
    }

    public String getQ_date() {
        return q_date;
    }

    public void setQ_date(String q_date) {
        this.q_date = q_date;
    }

    public String getBeizu() {
        return beizu;
    }

    public void setBeizu(String beizu) {
        this.beizu = beizu;
    }

    public String getBa_name() {
        return ba_name;
    }

    public void setBa_name(String ba_name) {
        this.ba_name = ba_name;
    }

    @Override
    public String toString() {
        return "QueqingEntity{" +
                "q_id=" + q_id +
                ", b_id=" + b_id +
                ", d_id=" + d_id +
                ", s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_sex=" + s_sex +
                ", q_date='" + q_date + '\'' +
                ", beizu='" + beizu + '\'' +
                ", ba_name='" + ba_name + '\'' +
                '}';
    }
}
