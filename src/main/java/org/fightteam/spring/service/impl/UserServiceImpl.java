package org.fightteam.spring.service.impl;

import org.fightteam.spring.service.UserService;
import org.springframework.stereotype.Service;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void addUser(String username) {
        System.out.println("===========addUser========");
    }

    @Override
    public String addUser(String username, String nickname) {
        System.out.println("===========username,nickname========");
        return "addUser";
    }

    @Override
    public void deleteUser() {
        System.out.println("===========deleteUser========");
    }

    @Override
    public void deleteUser(String username) {
        System.out.println("===========deleteUser,username========");
    }

    @Override
    public void updateUser() {
        System.out.println("===========updateUser========");
    }
}
