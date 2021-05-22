package com.fal.entity;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class MyNavi {

    //主键
    private String naviId;
    //名称
    private String naviName;
    //别名
    private String naviAlias;
    //图标
    private String naviIcon;
    //类别
    private Integer naviCategory;
    //标签
    private Integer naviLabel;
    //状态
    private Integer naviStatus;
    //排序
    private Integer naviSort;
    //描述
    private String naviDesc;
    //创建时间
    private LocalDateTime naviCreateTime;
    //更新时间
    private LocalDateTime naviUpdateTime;

}
