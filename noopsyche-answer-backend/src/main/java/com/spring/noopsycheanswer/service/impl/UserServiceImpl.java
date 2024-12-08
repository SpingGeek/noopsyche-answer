package com.spring.noopsycheanswer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.noopsycheanswer.domain.User;
import com.spring.noopsycheanswer.service.UserService;
import com.spring.noopsycheanswer.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author spring
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2024-12-09 01:34:43
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




