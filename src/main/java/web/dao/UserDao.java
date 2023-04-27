package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getListUsers();

    void saveUser(User user);


    User getUser(Long id);

    void deleteUser(Long id);
}
