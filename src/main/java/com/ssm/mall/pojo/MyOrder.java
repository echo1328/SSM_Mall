package com.ssm.mall.pojo;

import java.io.Serializable;
import java.util.List;

public class MyOrder implements Serializable {
    private Integer id;

    private String order_name;

    private String user_name;

    private String order_num;

    private Double total_price;

    private Integer total_amount;

    private String introduction;

    private String orders_ids;

    private Integer state;

    private List<Goods> goodsList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name == null ? null : order_name.trim();
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num == null ? null : order_num.trim();
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }

    public Integer getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Integer total_amount) {
        this.total_amount = total_amount;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getOrders_ids() {
        return orders_ids;
    }

    public void setOrders_ids(String orders_ids) {
        this.orders_ids = orders_ids == null ? null : orders_ids.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        return "MyOrder{" +
                "id=" + id +
                ", order_name='" + order_name + '\'' +
                ", user_name='" + user_name + '\'' +
                ", order_num='" + order_num + '\'' +
                ", total_price=" + total_price +
                ", total_amount=" + total_amount +
                ", introduction='" + introduction + '\'' +
                ", orders_ids='" + orders_ids + '\'' +
                ", state=" + state +
                ", goodsList=" + goodsList +
                '}';
    }

}