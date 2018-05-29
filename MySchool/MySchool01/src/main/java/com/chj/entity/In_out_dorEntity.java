package com.chj.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/20.
 */
public class In_out_dorEntity implements Serializable {
    private int in_id;
    private int b_id;
    private int d_id;
    private int s_id;
    private String in_date;
    private String out_date;
    private int to_b_id;
    private int to_d_id;

    public int getIn_id() {
        return in_id;
    }

    public void setIn_id(int in_id) {
        this.in_id = in_id;
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

    public String getIn_date() {
        return in_date;
    }

    public void setIn_date(String in_date) {
        this.in_date = in_date;
    }

    public String getOut_date() {
        return out_date;
    }

    public void setOut_date(String out_date) {
        this.out_date = out_date;
    }

    public int getTo_b_id() {
        return to_b_id;
    }

    public void setTo_b_id(int to_b_id) {
        this.to_b_id = to_b_id;
    }

    public int getTo_d_id() {
        return to_d_id;
    }

    public void setTo_d_id(int to_d_id) {
        this.to_d_id = to_d_id;
    }

    @Override
    public String toString() {
        return "In_out_dorEntity{" +
                "in_id=" + in_id +
                ", b_id=" + b_id +
                ", d_id=" + d_id +
                ", s_id=" + s_id +
                ", in_date='" + in_date + '\'' +
                ", out_date='" + out_date + '\'' +
                ", to_b_id=" + to_b_id +
                ", to_d_id=" + to_d_id +
                '}';
    }
}
