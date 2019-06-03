package pro.gravit.launchserver.hibernate;

import java.util.List;

public class UserService {

    private UserDAO usersDao = new UserDAOImpl();

    public UserService() {
    }

    public User findUser(int id) {
        return usersDao.findById(id);
    }

    public User findUserByUsername(String username) {
        return usersDao.findByUsername(username);
    }

    public void saveUser(User user) {
        usersDao.save(user);
    }

    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    public void updateUser(User user) {
        usersDao.update(user);
    }

    public List<User> findAllUsers() {
        return usersDao.findAll();
    }


}