package com.dailycodebuffer.springsecurityclient2.service;


import com.dailycodebuffer.springsecurityclient2.entity.User;
import com.dailycodebuffer.springsecurityclient2.model.UserModel;
import com.dailycodebuffer.springsecurityclient2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(UserModel userModel) {
        User user = new User();
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setEmail(userModel.getEmail());
        user.setPassword(userModel.getPassword());
        user.setRole(user.getRole());
        return null;
    }
}
