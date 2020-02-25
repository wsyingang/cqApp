package com.cqapp.service;

import com.cqapp.bean.User;

/**
 * Created with IntelliJ IDEA.
 * User: WangYu
 * Date: 2020/2/21
 * Time: 22:12
 * Description:
 */
public interface IUserService {

    User getUserById(long userId);

    void saveUser(User user);

}
