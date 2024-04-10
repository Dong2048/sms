package com.zagt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 视频监控记录表
 * @TableName tb_videos
 */
@TableName(value ="tb_videos")
@Data
public class Videos implements Serializable {
    /**
     * 视频记录ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 摄像头ID
     */
    @TableField(value = "camera_id")
    private Integer cameraId;

    /**
     * 视频文件路径
     */
    @TableField(value = "video_path")
    private String videoPath;

    /**
     * 开始时间
     */
    @TableField(value = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @TableField(value = "end_time")
    private Date endTime;

    /**
     * 状态（0:未启用, 1:启用）
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