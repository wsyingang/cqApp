package com.cqapp.mapper;

import com.cqapp.bean.User;

/**
 * Created with IntelliJ IDEA.
 * User: WangYu
 * Date: 2020/2/22
 * Time: 15:40
 * Description:
 */
public interface IUserMapper {

    User getUserById(long id);

    void saveUser(User user);

}
