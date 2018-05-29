package com.chj.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/16.
 */
public class DormitoryEntity implements Serializable {
    private int d_id;
    private int b_id;
    private int d_type;
    private int d_count;
    private int d_tel;
    private int ba_id;

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public int getD_type() {
        return d_type;
    }

    public void setD_type(int d_type) {
        this.d_type = d_type;
    }

    public int getD_count() {
        return d_count;
    }

    public void setD_count(int d_count) {
        this.d_count = d_count;
    }

    public int getD_tel() {
        return d_tel;
    }

    public void setD_tel(int d_tel) {
        this.d_tel = d_tel;
    }

    public int getBa_id() {
        return ba_id;
    }

    public void setBa_id(int ba_id) {
        this.ba_id = ba_id;
    }

    @Override
    public String toString() {
        return "DormitoryEntity{" +
                "d_id=" + d_id +
                ", b_id=" + b_id +
                ", d_type=" + d_type +
                ", d_count=" + d_count +
                ", d_tel=" + d_tel +
                ", ba_id=" + ba_id +
                '}';
    }
}
