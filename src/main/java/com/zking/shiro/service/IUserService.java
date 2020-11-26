package com.zking.shiro.service;

import com.zking.shiro.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Transactional
public interface IUserService {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /*
    * 注册
    * */
    int register(User user);

    /*
    * 登入
    * */
    User login(User user);

    /**
     * 获取用户角色
     * @param username
     * @return
     */
    Set<String> findRoles(String username);


    /**
     * 获取用户权限
     * @param username
     * @return
     */
    Set<String> findPermissions(String username);


}