package com.chj.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/16.
 */
public class BuildingadminEntity implements Serializable {
    private int ba_id;
    private String ba_name;
    private int ba_pwd;
    private int ba_sex;
    private int ba_tel;

    public int getBa_id() {
        return ba_id;
    }

    public void setBa_id(int ba_id) {
        this.ba_id = ba_id;
    }

    public String getBa_name() {
        return ba_name;
    }

    public void setBa_name(String ba_name) {
        this.ba_name = ba_name;
    }

    public int getBa_pwd() {
        return ba_pwd;
    }

    public void setBa_pwd(int ba_pwd) {
        this.ba_pwd = ba_pwd;
    }

    public int getBa_sex() {
        return ba_sex;
    }

    public void setBa_sex(int ba_sex) {
        this.ba_sex = ba_sex;
    }

    public int getBa_tel() {
        return ba_tel;
    }

    public void setBa_tel(int ba_tel) {
        this.ba_tel = ba_tel;
    }

    @Override
    public String toString() {
        return "BuildingadminEntity{" +
                "ba_id=" + ba_id +
                ", ba_name='" + ba_name + '\'' +
                ", ba_pwd=" + ba_pwd +
                ", ba_sex=" + ba_sex +
                ", ba_tel=" + ba_tel +
                '}';
    }
}
