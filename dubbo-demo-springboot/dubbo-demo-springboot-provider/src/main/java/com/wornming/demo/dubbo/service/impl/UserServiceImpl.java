package com.wornming.demo.dubbo.service.impl;

import com.wornming.demo.dubbo.api.UserService;
import com.wornming.demo.dubbo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author liwp20979
 * @version 1.0
 * @since 2021-03-25
 */
@Slf4j
@Service
@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(Long id) {
        log.info("收到请求,用户id:{}", id);
        return User.builder()
                .id(id)
                .name("张三")
                .sex((short) 1).build();
    }
}
