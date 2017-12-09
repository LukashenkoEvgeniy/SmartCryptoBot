package util;

import model.domain.State;
import model.implementation.StateDao;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CRUD {

    @Test
    public void createObjectAndWriteToDB() {
        State state = new State();
        state.setState("START");

        StateDao stateDao = new StateDao();
        stateDao.create(state);

    }

}
