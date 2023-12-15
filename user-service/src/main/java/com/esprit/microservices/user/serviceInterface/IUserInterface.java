package com.esprit.microservices.user.serviceInterface;


import com.esprit.microservices.user.Entity.User;

import java.util.List;

public interface IUserInterface {

    User addUser(User user);


    List<User> getUser();

    void deleteUser(Long id);

    User updateUser(User user);

    User getUserByEmail(String email);
}
