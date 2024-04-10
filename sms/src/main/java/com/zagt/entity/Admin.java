package com.zagt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 管理员信息表
 * @TableName sys_admin
 */
@TableName(value ="sys_admin")
@Data
public class Admin implements Serializable {
    /**
     * 管理员唯一标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 管理员用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 管理员密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 管理员电子邮件地址
     */
    @TableField(value = "email")
    private String email;

    /**
     * 管理员真实姓名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 管理员联系电话
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 管理员头像URL或文件路径
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 管理员账户状态（0:未激活，1:已激活，2:冻结）
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 管理员最后登录时间
     */
    @TableField(value = "last_login_time")
    private Date lastLoginTime;

    /**
     * 管理员最后登录IP地址
     */
    @TableField(value = "last_login_ip")
    private String lastLoginIp;

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

    /**
     * 角色ID，用于关联角色表
     */
    @TableField(value = "role_id")
    private Integer roleId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}