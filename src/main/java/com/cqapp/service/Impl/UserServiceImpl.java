package com.cqapp.service.Impl;

import com.cqapp.mapper.IUserMapper;
import com.cqapp.bean.User;
import com.cqapp.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: WangYu
 * Date: 2020/2/21
 * Time: 22:12
 * Description:
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserMapper userMapper;

    public User getUserById(long userId) {
        return this.userMapper.getUserById(userId);
    }

    public void saveUser(User user) {
        this.userMapper.saveUser(user);
    }
}