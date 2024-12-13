package com.lebedeva.crudforSpringBoot.CrudForSpingBoot.service;



import com.lebedeva.crudforSpringBoot.CrudForSpingBoot.model.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);
    void updateUser(long id, User updatedUser);
    void deleteUser(Long id);
}
