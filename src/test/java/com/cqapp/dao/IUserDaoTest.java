package com.cqapp.dao;

import com.cqapp.mapper.IUserMapper;
import com.cqapp.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: WangYu
 * Date: 2020/2/21
 * Time: 22:19
 * Description:
 */
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private IUserMapper userMapper;

    @Test
    public void testSelectUser() {
        long id = 1;
        User user = userMapper.getUserById(id);
        System.out.println(user.getUsername());
    }

}
