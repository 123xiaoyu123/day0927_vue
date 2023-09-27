package com.baidu.pojo;

import java.util.Date;

public class QueryVo {
    private String onumber;
    private Date createtime;
    private Integer price;

    public QueryVo(String onumber, Date createtime, Integer price) {
        this.onumber = onumber;
        this.createtime = createtime;
        this.price = price;
    }

    public QueryVo() {
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "onumber='" + onumber + '\'' +
                ", createtime=" + createtime +
                ", price=" + price +
                '}';
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
