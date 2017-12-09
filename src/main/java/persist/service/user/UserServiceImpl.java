package persist.service.user;

import model.user.User;
import persist.dao.FactoryDao;
import persist.dao.state.StateDAO;
import persist.dao.state.StateDAOImpl;
import persist.dao.user.UserDAO;
import persist.dao.user.UserDAOImpl;

import java.util.List;


public class UserServiceImpl implements UserService {

    private UserDAO userDAO = FactoryDao.getInstance().getUserDAO();

    public void create(User user) {
        userDAO.create(user);
    }

    public User read(int id) {
        return userDAO.read(id);
    }

    public void update(User state) {
        userDAO.update(state);

    }

    public void delete(User state) {
        userDAO.delete(state);
    }

    public List<User> getAll() {
        return userDAO.getAll();
    }
}
