package model.state;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(State.class)
public abstract class StateImpl_ {
    public static volatile SingularAttribute<State,Integer> id;
    public static volatile SingularAttribute<State,String> state;
}
