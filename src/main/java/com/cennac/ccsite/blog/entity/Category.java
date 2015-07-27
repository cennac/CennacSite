package com.cennac.ccsite.blog.entity;

import com.cennac.ccsite.common.entity.BaseEntity;

/**
 * 栏目Entity
 */
public class Category extends BaseEntity<Category>{

    private String name;

    private Category parent;    //父级栏目

    private String parentIds;   //所有父级编号

    private String module;  //栏目模型

    private String image;   //栏目图片

    private String href;    //栏目链接

    private String target;  //栏目打开方式

    private String description; //描述

    private String keywords;    //关键字

    private String inMenu;  //是否在导航中显示

    private String inList;  //是否在分类中显示列表

    private Integer sort;   //排序

    private String remarks; //备注

    private String delFlag;

}