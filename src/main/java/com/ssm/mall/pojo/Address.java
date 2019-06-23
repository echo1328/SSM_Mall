package com.ssm.mall.pojo;

public class Address {
    private Integer address_id;

    private Integer provinces;

    private Integer cities;

    private Integer areas;

    private String content;

    private Integer zip_code;

    private String name2;

    private String phone2;

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public Integer getProvinces() {
        return provinces;
    }

    public void setProvinces(Integer provinces) {
        this.provinces = provinces;
    }

    public Integer getCities() {
        return cities;
    }

    public void setCities(Integer cities) {
        this.cities = cities;
    }

    public Integer getAreas() {
        return areas;
    }

    public void setAreas(Integer areas) {
        this.areas = areas;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getZip_code() {
        return zip_code;
    }

    public void setZip_code(Integer zip_code) {
        this.zip_code = zip_code;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2 == null ? null : name2.trim();
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + address_id +
                ", provinces=" + provinces +
                ", cities=" + cities +
                ", areas=" + areas +
                ", content='" + content + '\'' +
                ", zip_code=" + zip_code +
                ", name2='" + name2 + '\'' +
                ", phone2='" + phone2 + '\'' +
                '}';
    }

}