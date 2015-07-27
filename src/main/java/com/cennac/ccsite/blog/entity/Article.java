package com.cennac.ccsite.blog.entity;
/**
 * 文章Entity
 */
import com.cennac.ccsite.common.entity.BaseEntity;

import java.util.Date;

public class Article extends BaseEntity<Article>{

    private Category category;  //分类编号

    private String title;   //标题

    private String link;    //外部链接

    private String image;   //文章图片

    private String keywords;    //关键字

    private String description; //描述、摘要

    private Integer hits;   //点击数

    private ArticleData articleData;    //文章副表

    private String remarks; //备注

    private String delFlag; //删除标记

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }


    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }


}