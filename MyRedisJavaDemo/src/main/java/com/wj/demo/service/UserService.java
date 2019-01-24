package com.wj.demo.service;

import com.wj.demo.model.User;

import java.util.List;

/**
 * @author wangjie
 * @data 2019/1/15 15:47
 */
public interface UserService {
     /**
      * 获取所有用户
      * @return
      */
     List<User> getAllUsers();

     /**
      * 根据userId获取用户
      * @param id
      * @return
      */
     User getUser(int id);

}
