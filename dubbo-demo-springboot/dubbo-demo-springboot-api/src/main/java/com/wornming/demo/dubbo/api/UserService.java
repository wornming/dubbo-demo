package com.wornming.demo.dubbo.api;

import com.wornming.demo.dubbo.model.User;

/**
 * @author liwp20979
 * @version 1.0
 * @since 2021-03-25
 */
public interface UserService {
    User getUserById(Long id);
}
