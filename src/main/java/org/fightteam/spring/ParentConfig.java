package org.fightteam.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
@Configuration
public class ParentConfig {




    @Bean
    public User faith(){
        User faith = new User();
        faith.setUsername("faith");
        faith.setNickname("欧阳澄泓");
        return faith;
    }
}
