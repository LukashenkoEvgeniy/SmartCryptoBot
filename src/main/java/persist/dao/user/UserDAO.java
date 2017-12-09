package persist.dao.user;

import model.user.User;

import java.util.List;

public interface UserDAO {
    void create(User state);
    User read(int id);
    void update(User state);
    void delete(User state);
    List<User> getAll();
}
