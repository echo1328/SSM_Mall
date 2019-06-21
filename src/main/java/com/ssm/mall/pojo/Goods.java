package com.ssm.mall.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

public class Goods implements Serializable {
    @Field("id")
    private Integer goods_id;

    @Field("item_name")
    private String name;

    @Field("item_image")
    private String image;

    @Field("item_caption")
    private String caption;

    private Double price_before;

    @Field("item_price")
    private Double price_after;

    @Field("item_introduction")
    private String introduction;

    private String activity;

    private Integer sale;

    private Integer reserve;

    private Integer comment;

    private Integer score;

    private Integer sort1_id;

    private Integer sort2_id;

    private Integer sort3_id;

    @Field("item_brand")
    private Integer brand_id;

    private Integer shop_id;

    private Integer status;

    private Integer is_marketable;

    private int order_amount;

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption == null ? null : caption.trim();
    }

    public Double getPrice_before() {
        return price_before;
    }

    public void setPrice_before(Double price_before) {
        this.price_before = price_before;
    }

    public Double getPrice_after() {
        return price_after;
    }

    public void setPrice_after(Double price_after) {
        this.price_after = price_after;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity == null ? null : activity.trim();
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Integer getReserve() {
        return reserve;
    }

    public void setReserve(Integer reserve) {
        this.reserve = reserve;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getSort1_id() {
        return sort1_id;
    }

    public void setSort1_id(Integer sort1_id) {
        this.sort1_id = sort1_id;
    }

    public Integer getSort2_id() {
        return sort2_id;
    }

    public void setSort2_id(Integer sort2_id) {
        this.sort2_id = sort2_id;
    }

    public Integer getSort3_id() {
        return sort3_id;
    }

    public void setSort3_id(Integer sort3_id) {
        this.sort3_id = sort3_id;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIs_marketable() {
        return is_marketable;
    }

    public void setIs_marketable(Integer is_marketable) {
        this.is_marketable = is_marketable;
    }

    public int getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(int order_amount) {
        this.order_amount = order_amount;
    }

}