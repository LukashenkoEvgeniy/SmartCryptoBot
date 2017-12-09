package persist.dao.state;

import model.state.State;

import java.util.List;

public interface StateDAO {
    void create(State state);
    State read(int id);
    void update(State state);
    void delete(State state);
    List<State> getAll();
}
