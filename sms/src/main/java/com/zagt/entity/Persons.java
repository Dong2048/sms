package com.zagt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 人员黑白名单表
 * @TableName tb_persons
 */
@TableName(value ="tb_persons")
@Data
public class Persons implements Serializable {
    /**
     * 人员记录ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 姓名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 图片文件路径
     */
    @TableField(value = "image_path")
    private String imagePath;

    /**
     * 身份证号码
     */
    @TableField(value = "id_number")
    private String idNumber;

    /**
     * 名单类型（0:黑名单, 1:白名单）
     */
    @TableField(value = "list_type")
    private Integer listType;

    /**
     * 原因
     */
    @TableField(value = "reason")
    private String reason;

    /**
     * 创建时间
     */
    @TableField(value = "created_at")
    private Date createdAt;

    /**
     * 更新时间
     */
    @TableField(value = "updated_at")
    private Date updatedAt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}