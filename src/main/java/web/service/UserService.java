package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getListUsers();

    void saveUser(User user);

    User getUser(Long id);

    void deleteUser(Long id);

}
