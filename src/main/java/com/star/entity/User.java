package com.star.entity;

import javax.xml.crypto.Data;
import java.util.Date;

public class User {
    private long id;
    private String nickname;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private Integer type;
    private Date creatimeTime;
    private Data updateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreatimeTime() {
        return creatimeTime;
    }

    public void setCreatimeTime(Date creatimeTime) {
        this.creatimeTime = creatimeTime;
    }

    public Data getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Data updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{id=" + id + "nickname=" + nickname + "username" + username + "password=" + password + "email=" + email + "avatar=" + avatar + "type=" + type + "createTime=" + creatimeTime + "updateTime=" + updateTime + "}";
    }
}
