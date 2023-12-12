package com.dailycodebuffer.springsecurityclient2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@EnableWebSecurity
@Component
public class WebSecurityConfig {


    @Bean
    public PasswordEncoder passwordEncoder() {
       return new BCryptPasswordEncoder(11);

    }
}
