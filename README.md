# my-navi

-- auto-generated definition
create table my_navi
(
    navi_id          varchar(32)                         not null,
    navi_name        varchar(100)                        null comment '名称',
    navi_alias       varchar(100)                        null comment '别名',
    navi_icon        varchar(1000)                       null comment '图标',
    navi_category    int                                 null comment '类别',
    navi_label       int                                 null comment '标签',
    navi_status      int                                 null comment '状态',
    navi_sort        int                                 null comment '排序',
    navi_desc        varchar(2000)                       null comment '描述',
    navi_create_time timestamp default CURRENT_TIMESTAMP null comment '创建时间',
    navi_update_time timestamp default CURRENT_TIMESTAMP null comment '更新时间',
    constraint navi_id
        unique (navi_id)
)
    charset = utf8;

alter table my_navi
    add primary key (navi_id);
