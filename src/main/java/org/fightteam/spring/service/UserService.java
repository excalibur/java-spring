package org.fightteam.spring.service;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
public interface UserService {

    void addUser(String username);

    String addUser(String username, String nickname);

    void deleteUser();

    void deleteUser(String username);

    void updateUser();

}
