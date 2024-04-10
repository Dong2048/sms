package com.zagt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zagt.entity.Menu;
import com.zagt.service.MenuService;
import com.zagt.mapper.MenuMapper;
import org.springframework.stereotype.Service;

/**
* @author dong
* @description 针对表【sys_menu(菜单信息表)】的数据库操作Service实现
* @createDate 2024-04-09 17:48:51
*/
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu>
    implements MenuService{

}




