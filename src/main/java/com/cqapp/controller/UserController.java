package com.cqapp.controller;

import com.cqapp.bean.Result;
import com.cqapp.bean.User;
import com.cqapp.service.IUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: WangYu
 * Date: 2020/2/21
 * Time: 22:11
 * Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable long id) {
        return this.userService.getUserById(id);
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public Result saveUser(User user) {
        System.out.println(user);
        this.userService.saveUser(user);
        return new Result(200, "添加成功");
    }

}
