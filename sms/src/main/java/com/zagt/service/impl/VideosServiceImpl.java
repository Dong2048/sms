package com.zagt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zagt.entity.Videos;
import com.zagt.service.VideosService;
import com.zagt.mapper.VideosMapper;
import org.springframework.stereotype.Service;

/**
* @author dong
* @description 针对表【tb_videos(视频监控记录表)】的数据库操作Service实现
* @createDate 2024-04-09 14:58:08
*/
@Service
public class VideosServiceImpl extends ServiceImpl<VideosMapper, Videos>
    implements VideosService{

}




