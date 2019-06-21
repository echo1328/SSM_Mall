package com.ssm.mall.pojo;

import java.io.Serializable;
import java.util.Date;

public class Seckill implements Serializable {
    private Integer seckill_id;

    private Integer goods_id;

    private String name;

    private String image;

    private String caption;

    private Double price_before;

    private Double price_after;

    private String introduction;

    private Date start_time;

    private Date end_time;

    private Integer amount;

    private Integer reserve;

    private Integer shop_id;

    private Integer status;

    public Integer getSeckill_id() {
        return seckill_id;
    }

    public void setSeckill_id(Integer seckill_id) {
        this.seckill_id = seckill_id;
    }

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

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getReserve() {
        return reserve;
    }

    public void setReserve(Integer reserve) {
        this.reserve = reserve;
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
}