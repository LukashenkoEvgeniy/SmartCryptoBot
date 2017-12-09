package util;

import model.domain.State;
import model.implementation.StateDao;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class State_CRUD {

    @Test
    public void createState() {
        State state = new State();
        state.setState("START");
        StateDao stateDao = new StateDao();
        stateDao.create(state);
    }

    @Test
    public void getStateById() {
        StateDao stateDao = new StateDao();
        State state = stateDao.getUserById(1);
        assertEquals(1, state.getId());
    }

    @Test
    public void deleteStateById() {
        StateDao stateDao = new StateDao();
        State state = stateDao.getUserById(1);

        if (state == null){
            createState();
        }
        state = stateDao.getUserById(1);
        stateDao.delete(state);
        state = stateDao.getUserById(1);
        assertEquals(null, state);
    }

    @Test
    public void updateState() {
        StateDao stateDao = new StateDao();
        State state = stateDao.getUserById(3);
        if (state == null){
            createState();
        }
        state.setState("FINISH");
        stateDao.update(state);
        state = stateDao.getUserById(3);
        assertEquals("FINISH", state.getState());
    }

}
