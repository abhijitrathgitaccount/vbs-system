package com.vbs.vbs.service;

import com.vbs.vbs.entity.User;

public interface UserService {

    User register(User user);

    User login(String email, String password);
}