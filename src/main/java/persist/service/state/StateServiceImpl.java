package persist.service.state;

import model.state.State;
import persist.dao.FactoryDao;
import persist.dao.state.StateDAO;
import persist.dao.state.StateDAOImpl;

import java.util.List;


public class StateServiceImpl implements StateService {

    private StateDAO stateDAO = FactoryDao.getInstance().getStateDAO();

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
