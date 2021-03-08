package com.peng.carfours.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Carmessage {
    private int id;
    private String name;
    private String color;
    private BigDecimal price;
    private int state;
    private int seller_id;
    private Timestamp sell_time;
    private String customer_id;


    public Carmessage() {
    }

    public Carmessage(int id, String name, String color, BigDecimal price, int state, int seller_id, Timestamp sell_time, String customer_id) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.state = state;
        this.seller_id = seller_id;
        this.sell_time = sell_time;
        this.customer_id = customer_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }

    public Timestamp getSell_time() {
        return sell_time;
    }

    public void setSell_time(Timestamp sell_time) {
        this.sell_time = sell_time;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public String toString() {
        return "Carmessage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", state=" + state +
                ", seller_id=" + seller_id +
                ", sell_time=" + sell_time +
                ", customer_id='" + customer_id + '\'' +
                '}';
    }
}
