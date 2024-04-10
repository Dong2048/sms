package com.zagt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 菜单信息表
 * @TableName sys_menu
 */
@TableName(value ="sys_menu")
@Data
public class Menu implements Serializable {
    /**
     * 菜单唯一标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 菜单名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 菜单链接地址
     */
    @TableField(value = "url")
    private String url;

    /**
     * 父级菜单ID，用于构建菜单层级结构
     */
    @TableField(value = "parent_id")
    private Integer parentId;

    /**
     * 菜单排序
     */
    @TableField(value = "order")
    private Integer order;

    /**
     * 菜单图标
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 记录创建时间
     */
    @TableField(value = "created_at")
    private Date createdAt;

    /**
     * 记录更新时间
     */
    @TableField(value = "updated_at")
    private Date updatedAt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}