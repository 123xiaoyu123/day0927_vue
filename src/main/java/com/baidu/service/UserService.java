package com.baidu.service;

import com.baidu.pojo.User;

import java.util.List;

public interface UserService {
    /*查询所有的用户*/
    List<User> findUsers();
}
