package persist.service;

import persist.service.state.StateService;
import persist.service.state.StateServiceImpl;
import persist.service.user.UserService;
import persist.service.user.UserServiceImpl;

public class FactoryService {

    private static FactoryService instance = null;

    private static StateService stateService = null;
    private static UserService userService = null;

    public static synchronized FactoryService getInstance() {
        if (instance == null) {
            instance = new FactoryService();
        }
        return instance;
    }

    public StateService getStateService() {
        if (stateService == null) {
            stateService = new StateServiceImpl();
        }
        return stateService;
    }

    public UserService getUserService() {
        if (userService == null) {
            userService = new UserServiceImpl();
        }
        return userService;
    }
}
