package com.zagt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 抓拍记录表
 * @TableName tb_captures
 */
@TableName(value ="tb_captures")
@Data
public class Captures implements Serializable {
    /**
     * 抓拍记录ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 摄像头ID
     */
    @TableField(value = "camera_id")
    private Integer cameraId;

    /**
     * 抓拍时间
     */
    @TableField(value = "capture_time")
    private Date captureTime;

    /**
     * 图片文件路径
     */
    @TableField(value = "image_path")
    private String imagePath;

    /**
     * 关联的人员ID
     */
    @TableField(value = "person_id")
    private Integer personId;

    /**
     * 状态（0:待审核, 1:已确认）
     */
    @TableField(value = "status")
    private Integer status;

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