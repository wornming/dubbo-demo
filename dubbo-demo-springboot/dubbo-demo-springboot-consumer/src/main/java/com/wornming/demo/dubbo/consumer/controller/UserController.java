package com.wornming.demo.dubbo.consumer.controller;

import com.wornming.demo.dubbo.api.UserService;
import com.wornming.demo.dubbo.model.User;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liwp20979
 * @version 1.0
 * @since 2021-03-25
 */
@RestController
@RequestMapping("/api")
public class UserController {
    @DubboReference(check = false)
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
