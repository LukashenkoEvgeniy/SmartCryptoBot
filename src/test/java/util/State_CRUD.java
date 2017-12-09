package util;

import model.State;
import dao.StateDAOImpl;
import org.junit.Test;
import service.StateService;
import service.StateServiceImpl;

import static org.junit.Assert.assertEquals;

public class State_CRUD {

    @Test
    public void create() {
        State state = new State();
        state.setState("Start");
        StateService stateDao = new StateServiceImpl();
        stateDao.create(state);
    }

    @Test
    public void read() {
        StateService stateDao = new StateServiceImpl();
        State state = stateDao.read(4);
        assertEquals(4, state.getId());
    }

    @Test
    public void delete() {
        StateService stateDao = new StateServiceImpl();
        State state = stateDao.read(2);

        if (state == null){
            create();
            state = stateDao.read(2);

        }
        stateDao.delete(state);
        state = stateDao.read(2);
        assertEquals(null, state);
    }

    @Test
    public void updateState() {
        StateService stateDao = new StateServiceImpl();
        State state = stateDao.read(3);
        if (state == null){
            create();
        }
        state.setState("NOT");
        stateDao.update(state);
        state = stateDao.read(3);
        assertEquals("NOT", state.getState());
    }

}
