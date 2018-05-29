package com.chj.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/16.
 */
public class BuildingEntity implements Serializable {
    private int b_id;
    private String b_name;
    private String b_jianjie;
    private int ba_id;

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_jianjie() {
        return b_jianjie;
    }

    public void setB_jianjie(String b_jianjie) {
        this.b_jianjie = b_jianjie;
    }

    public int getBa_id() {
        return ba_id;
    }

    public void setBa_id(int ba_id) {
        this.ba_id = ba_id;
    }

    @Override
    public String toString() {
        return "BuildingEntity{" +
                "b_id=" + b_id +
                ", b_name=" + b_name +
                ", b_jianjie='" + b_jianjie + '\'' +
                ", ba_id=" + ba_id +
                '}';
    }
}
