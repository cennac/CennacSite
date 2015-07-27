package com.cennac.ccsite.blog.entity;

import com.cennac.ccsite.common.entity.BaseEntity;

/**
 * 文章内容Entity
 */
public class ArticleData extends BaseEntity<ArticleData> {

    private String copyfrom;    //来源

    private String content; //内容

    public String getCopyfrom() {
        return copyfrom;
    }

    public void setCopyfrom(String copyfrom) {
        this.copyfrom = copyfrom;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", copyfrom=").append(copyfrom);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}