package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService  implements com.atguigu.gmall.user.service.UserService {

    @Autowired
    UserMapper UserMapper;
}
