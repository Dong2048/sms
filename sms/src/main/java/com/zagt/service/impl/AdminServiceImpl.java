package com.zagt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zagt.entity.Admin;
import com.zagt.service.AdminService;
import com.zagt.mapper.AdminMapper;
import org.springframework.stereotype.Service;

/**
* @author dong
* @description 针对表【sys_admin(管理员信息表)】的数据库操作Service实现
* @createDate 2024-04-09 17:48:51
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
    implements AdminService{

}




