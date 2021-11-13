package com.star.queryVo;

public class RecommendBlog {
    private Long id;
    private String firstPicture;
    private String title;
    private boolean recommend;

    public RecommendBlog() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFisrtPicture() {
        return firstPicture;
    }

    public void setFisrtPicture(String fisrtPicture) {
        this.firstPicture = fisrtPicture;
    }

    public String getTilte() {
        return title;
    }

    public void setTilte(String tilte) {
        this.title = tilte;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }

    @Override
    public String toString() {
        return "{RecommendBlog}" + "id=" + id +
                ", title='" + title + '\'' +
                ", firstPicture='" + firstPicture + '\'' +
                ", recommend=" + recommend +
                '}';
    }
}
