package org.fightteam.spring;

import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

/**
 * Created by excalibur on 2014/8/14.
 */
@Configuration
//
//@Lazy
//@Primary
public class AppConfig implements Lifecycle {

    @Bean(name = {"faith","user"})
    public User faith(){
        User faith = new User();
        faith.setUsername("faith");
        faith.setNickname("欧阳澄泓");
        return faith;
    }


    @Bean(name = {"faith2"})
    public User faith2(){
        User faith = new User();
        faith.setUsername("faith2");
        faith.setNickname("欧阳澄泓2");
        return faith;
    }



    @Bean
    public Role role(){
        Role role = new Role();

        return role;
    }

    @Override
    public void start() {
        System.out.println("-------start-111----------");
    }

    @Override
    public void stop() {
        System.out.println("-----------stop---111-------");
    }

    @Override
    public boolean isRunning() {
        System.out.println("---------isRunning--111------");
        return true;
    }
}
