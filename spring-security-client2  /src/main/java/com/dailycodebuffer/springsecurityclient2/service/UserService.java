package com.dailycodebuffer.springsecurityclient2.service;

import com.dailycodebuffer.springsecurityclient2.entity.User;
import com.dailycodebuffer.springsecurityclient2.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
