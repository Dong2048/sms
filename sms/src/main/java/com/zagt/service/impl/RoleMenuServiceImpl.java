package com.zagt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zagt.entity.RoleMenu;
import com.zagt.service.RoleMenuService;
import com.zagt.mapper.RoleMenuMapper;
import org.springframework.stereotype.Service;

/**
* @author dong
* @description 针对表【sys_role_menu(角色与菜单关联表)】的数据库操作Service实现
* @createDate 2024-04-09 17:48:51
*/
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu>
    implements RoleMenuService{

}




