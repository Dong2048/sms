package com.zagt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色信息表
 * @TableName sys_role
 */
@TableName(value ="sys_role")
@Data
public class Role implements Serializable {
    /**
     * 角色唯一标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 角色描述
     */
    @TableField(value = "description")
    private String description;

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