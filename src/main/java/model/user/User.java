package model.user;

import model.state.State;

import javax.persistence.*;

@Entity
@Table(name="Users",
        uniqueConstraints={@UniqueConstraint(columnNames={"user_id"})})
public class User {
    @Id
    @Column(name="user_id", nullable=false, unique=true, length=11)
    private int id;


    @ManyToOne
    private State state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", state=" + state +
                '}';
    }
}
