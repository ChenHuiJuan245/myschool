package com.chj.entity;

import java.util.List;

/**
 * Created by Administrator on 2018/5/11.
 */
public class Page {
    private int pageSize = 5; //页面记录数量
    private int totalCount;  //总记录数
    private int totalpage;  //总页数
    private int curenPage = 1;  //当前页码
    private int nextpage; //下一页
    private int prePage; //上一页
    private int firstpage;//首页
    private int lastpage;//尾页
    private List arrays;//从数据库查询出的结果集

    public List getArrays() {
        return arrays;
    }
    public void setArrays(List arrays) {
        this.arrays = arrays;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    public int getCurenPage() {
        return curenPage;
    }
    public void setCurenPage(int curenPage) {
        this.curenPage = curenPage;
    }

    /**
     * 总共分多少页
     * @return
     */
    public int getTotalpage() {
        if(totalCount%pageSize==0)
            return totalCount/pageSize;
        else
            return totalCount/pageSize+1;
    }
    /**
     * 下一页
     * @return
     */
    public int getNextpage() {
        if(curenPage<this.getTotalpage())
            return curenPage+1;
        else
            return this.getTotalpage();
    }
    /***
     * 上一页
     * @param
     */
    public int getPrePage() {
        if(curenPage>1)
            return curenPage-1;
        else
            return this.getFirstpage();
    }

    /**
     * 首页
     * @return
     */
    public int getFirstpage() {
        return 1;
    }

    /**
     * 尾页
     * @return
     */
    public int getLastpage() {
        return this.getTotalpage();
    }
}
