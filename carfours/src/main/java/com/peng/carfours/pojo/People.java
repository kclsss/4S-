package com.peng.carfours.pojo;

public class People {

    private int id;
    private String name;
    private String tel;
    private String addr;
    private int sex;
    private int on_job;

    public People() {
    }

    public People(int id, String name, String tel, String addr, int sex, int on_job) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.addr = addr;
        this.sex = sex;
        this.on_job = on_job;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getOn_job() {
        return on_job;
    }

    public void setOn_job(int on_job) {
        this.on_job = on_job;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", addr='" + addr + '\'' +
                ", sex=" + sex +
                ", on_job=" + on_job +
                '}';
    }
}
