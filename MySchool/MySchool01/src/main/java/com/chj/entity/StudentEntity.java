package com.chj.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/15.
 */
public class StudentEntity implements Serializable {
    private int s_id;
    private String s_name;
    private int s_pwd;
    private int s_sex;
    private int s_grade;
    private int s_status;

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

    public int getS_pwd() {
        return s_pwd;
    }

    public void setS_pwd(int s_pwd) {
        this.s_pwd = s_pwd;
    }

    public int getS_sex() {
        return s_sex;
    }

    public void setS_sex(int s_sex) {
        this.s_sex = s_sex;
    }

    public int getS_grade() {
        return s_grade;
    }

    public void setS_grade(int s_grade) {
        this.s_grade = s_grade;
    }

    public int getS_status() {
        return s_status;
    }

    public void setS_status(int s_status) {
        this.s_status = s_status;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_pwd=" + s_pwd +
                ", s_sex=" + s_sex +
                ", s_grade=" + s_grade +
                ", s_status=" + s_status +
                '}';
    }
}
