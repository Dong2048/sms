package com.zagt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zagt.entity.Role;
import com.zagt.service.RoleService;
import com.zagt.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author dong
* @description 针对表【sys_role(角色信息表)】的数据库操作Service实现
* @createDate 2024-04-09 17:48:51
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




