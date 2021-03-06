package org.fightteam.spring;

import org.springframework.stereotype.Component;

/**
 * Created by excalibur on 2014/8/5.
 */
@Component
public class User {
    private String username;
    private String nickname;

    public User() {
        System.out.println("--------初始化---------");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }


}
