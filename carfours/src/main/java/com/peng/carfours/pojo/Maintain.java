package com.peng.carfours.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Maintain {


    private int id;
    private String content;
    private Date datetime;
    private String cus_name;
    private String car_name;
    private BigDecimal price;
    private int customer_id;

    public Maintain(int id, String content, Date datetime, String cus_name, String car_name, BigDecimal price, int customer_id) {
        this.id = id;
        this.content = content;
        this.datetime = datetime;
        this.cus_name = cus_name;
        this.car_name = car_name;
        this.price = price;
        this.customer_id = customer_id;
    }

    public Maintain() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public String toString() {
        return "Maintain{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", datetime=" + datetime +
                ", cus_name='" + cus_name + '\'' +
                ", car_name='" + car_name + '\'' +
                ", price=" + price +
                ", customer_id=" + customer_id +
                '}';
    }
}
