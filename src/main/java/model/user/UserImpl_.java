package model.user;

import model.state.State;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(User.class)
public abstract class UserImpl_ {
    public static volatile SingularAttribute<User,Integer> id;
    public static volatile SingularAttribute<User,State> state;
}
