package org.fightteam.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

/**
 * Created by excalibur on 2014/8/14.
 */
//@Configuration
@Lazy
@Primary
public class AppConfig {

    @Bean
    public User faith(){
        User faith = new User();
        faith.setUsername("faith");
        faith.setNickname("欧阳澄泓");
        return faith;
    }

}
