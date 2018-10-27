package com.jnshu.entity;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     @NotEmpty 用在集合类上面
     @NotBlank 用在String上面
     @NotNull 用在基本类型上
     */



    //用户名
    @NotBlank(message = "学生姓名不能为空")
    private String name;
    //年龄
    private String qq;
    private String type;
    private int entranceTime;
    private String school;

    @NotNull(message = "请填写id")
    private int id;
    private String onlineNum;
    private String dailylink;
    private String wish;
    private String bro;
    private int create_at;
    private int update_at;

    public User() {
    }

    public User(int id, String name, String qq, String type, int entranceTime, String school, String onlineNum, String dailylink, String wish,
                String bro, int create_at, int update_at) {

        this.id = id;
        this.name = name;
        this.qq = qq;
        this.type = type;
        this.entranceTime = entranceTime;
        this.school = school;
        this.onlineNum = onlineNum;
        this.dailylink = dailylink;
        this.wish = wish;
        this.bro= bro;
        this.create_at = create_at;
        this.update_at = update_at;

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

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEntranceTime() {
        return entranceTime;
    }

    public void setEntranceTime(int entranceTime) {
        this.entranceTime = entranceTime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getOnlineNum() {
        return onlineNum;
    }

    public void setOnlineNum(String onlineNum) {
        this.onlineNum = onlineNum;
    }

    public String getDailylink() {
        return dailylink;
    }

    public void setDailylink(String dailylink) {
        this.dailylink = dailylink;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public String getBro() {
        return bro;
    }

    public void setBro(String bro) {
        this.bro = bro;
    }

    public int getCreate_at() {
        return create_at;
    }

    public void setCreate_at(int create_at) {
        this.create_at = create_at;
    }

    public int getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(int update_at) {
        this.update_at = update_at;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qq='" + qq + '\'' +
                ", type='" + type + '\'' +
                ", entranceTime=" + entranceTime +
                ", school='" + school + '\'' +
                ", onlineNum='" + onlineNum + '\'' +
                ", dailylink='" + dailylink + '\'' +
                ", wish='" + wish + '\'' +
                ", bro='" + bro + '\'' +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                '}';
    }
}




