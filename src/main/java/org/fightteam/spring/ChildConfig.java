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
public class ChildConfig {

    @Bean
    public User excalibur(){
        User faith = new User();
        faith.setUsername("excalibur");
        faith.setNickname("屌丝");
        return faith;
    }
}
