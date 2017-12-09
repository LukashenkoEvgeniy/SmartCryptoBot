package service;

import model.State;
import dao.StateDAO;
import dao.StateDAOImpl;

import javax.transaction.Transactional;
import java.util.List;


public class StateServiceImpl implements StateService {

    StateDAO stateDAO = new StateDAOImpl();

    public void create(State state) {
        stateDAO.create(state);
    }

    public State read(int id) {
        return stateDAO.read(id);
    }

    public void update(State state) {
        stateDAO.update(state);

    }

    public void delete(State state) {
        stateDAO.delete(state);
    }

    public List<State> getAll() {
        return stateDAO.getAll();
    }
}
