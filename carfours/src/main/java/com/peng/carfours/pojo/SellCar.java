package com.peng.carfours.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class SellCar {

    private  int id;
    private  String name;
    private String color;
    private BigDecimal price;
    private String sell_name;
    private Timestamp sell_time;
    private String customer_name;

    public SellCar() {
    }


    public SellCar(int id, String name, String color, BigDecimal price, String sell_name, Timestamp sell_time, String customer_name) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.sell_name = sell_name;
        this.sell_time = sell_time;
        this.customer_name = customer_name;
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

    public String getSell_name() {
        return sell_name;
    }

    public void setSell_name(String sell_name) {
        this.sell_name = sell_name;
    }

    public Timestamp getSell_time() {
        return sell_time;
    }

    public void setSell_time(Timestamp sell_time) {
        this.sell_time = sell_time;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    @Override
    public String toString() {
        return "SellCar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", sell_name='" + sell_name + '\'' +
                ", sell_time=" + sell_time +
                ", customer_name='" + customer_name + '\'' +
                '}';
    }
}
