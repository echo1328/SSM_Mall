package com.ssm.mall.pojo;

import java.util.List;

public class Seller {
    private Integer seller_id;

    private String seller_name;

    private Integer user_id;

    private Double income;

    private String shop_ids;

    private User user;

    private List<Shop> shopList;

    public Integer getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(Integer seller_id) {
        this.seller_id = seller_id;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name == null ? null : seller_name.trim();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String getShop_ids() {
        return shop_ids;
    }

    public void setShop_ids(String shop_ids) {
        this.shop_ids = shop_ids == null ? null : shop_ids.trim();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Shop> getShopList() {
        return shopList;
    }

    public void setShopList(List<Shop> shopList) {
        this.shopList = shopList;
    }

}