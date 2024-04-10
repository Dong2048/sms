package com.zagt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 角色与菜单关联表
 * @TableName sys_role_menu
 */
@TableName(value ="sys_role_menu")
@Data
public class RoleMenu implements Serializable {
    /**
     * 关联记录唯一标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色ID
     */
    @TableField(value = "role_id")
    private Integer roleId;

    /**
     * 菜单ID
     */
    @TableField(value = "menu_id")
    private Integer menuId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}