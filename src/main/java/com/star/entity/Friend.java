package com.star.entity;

import java.util.Date;

public class Friend {
    private long id;
    private String blogaddress;
    private String blogname;
    private Date createTime;
    private String pictureaddress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBlogaddress() {
        return blogaddress;
    }

    public void setBlogaddress(String blogaddress) {
        this.blogaddress = blogaddress;
    }

    public String getBlogname() {
        return blogname;
    }

    public void setBlogname(String blogname) {
        this.blogname = blogname;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPictureaddress() {
        return pictureaddress;
    }

    public void setPictureaddress(String pictureaddress) {
        this.pictureaddress = pictureaddress;
    }

    @Override
    public String toString() {
        return "Friend{id:" + id + ",blogAddress:"
                + blogaddress + ",blogName:" + blogname + ",createTime:" + createTime
                + ",pictureAddress:" + pictureaddress + "}";
    }
}
