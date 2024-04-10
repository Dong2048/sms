package com.zagt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zagt.entity.Persons;
import com.zagt.service.PersonsService;
import com.zagt.mapper.PersonsMapper;
import org.springframework.stereotype.Service;

/**
* @author dong
* @description 针对表【tb_persons(人员黑白名单表)】的数据库操作Service实现
* @createDate 2024-04-09 14:58:08
*/
@Service
public class PersonsServiceImpl extends ServiceImpl<PersonsMapper, Persons>
    implements PersonsService{

}




