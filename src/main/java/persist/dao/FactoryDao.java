package persist.dao;

import persist.dao.state.StateDAO;
import persist.dao.state.StateDAOImpl;
import persist.dao.user.UserDAO;
import persist.dao.user.UserDAOImpl;

public class FactoryDao {

    private static FactoryDao instance = null;

    private static StateDAO stateDAO = null;
    private static UserDAO userDAO = null;

    public static synchronized FactoryDao getInstance() {
        if (instance == null) {
            instance = new FactoryDao();
        }
        return instance;
    }

    public StateDAO getStateDAO() {
        if (stateDAO == null) {
            stateDAO = new StateDAOImpl();
        }
        return stateDAO;
    }

    public UserDAO getUserDAO() {
        if (userDAO == null) {
            userDAO = new UserDAOImpl();
        }
        return userDAO;
    }
}
