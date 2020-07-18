package com.Amos.demo.entity;

public class user {
    private  int id;
    private  String NAME;
    private  int age;
    private  String sex;

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", NAME='" + NAME + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
