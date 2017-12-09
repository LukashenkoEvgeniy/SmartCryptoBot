package util;

import model.state.State;
import model.user.User;
import org.junit.Test;
import persist.service.FactoryService;

import static org.junit.Assert.assertEquals;

public class State_CRUD {

    @Test
    public void createUser(){
        State state = new State();
        state.setState("START");
        FactoryService.getInstance().getStateService().create(state);

        User testUser = new User();
        testUser.setId(12314323);
        testUser.setState(state);

        FactoryService.getInstance().getUserService().create(testUser);

    }


    @Test
    public void create() {
        State state = new State();
        state.setState("Start");
        FactoryService.getInstance().getStateService().create(state);
    }

    @Test
    public void read() {
        assertEquals(4, FactoryService.getInstance().getStateService().read(4).getId());
    }

    @Test
    public void delete() {
        State state = FactoryService.getInstance().getStateService().read(2);

        if (state == null){
            create();
            state = FactoryService.getInstance().getStateService().read(2);

        }
        FactoryService.getInstance().getStateService().delete(state);
        state = FactoryService.getInstance().getStateService().read(2);
        assertEquals(null, state);
    }

    @Test
    public void updateState() {
        State state = FactoryService.getInstance().getStateService().read(3);
        if (state == null){
            create();
        }
        state.setState("NOT");
        FactoryService.getInstance().getStateService().update(state);
        state = FactoryService.getInstance().getStateService().read(3);
        assertEquals("NOT", state.getState());
    }

}
