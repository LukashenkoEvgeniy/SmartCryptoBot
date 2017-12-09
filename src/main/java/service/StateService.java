package service;

import model.State;

import java.util.List;

public interface StateService {
    void create(State state);
    State read(int id);
    void update(State state);
    void delete(State state);
    List<State> getAll();

}
