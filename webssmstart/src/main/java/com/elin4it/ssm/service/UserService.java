package com.elin4it.ssm.service;

import com.elin4it.ssm.pojo.User;

import java.util.List;

/**
 * Created by 烽 on 2015/7/11.
 */
public interface UserService {

    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<User> findUser()throws Exception;
}