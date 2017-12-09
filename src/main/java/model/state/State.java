package model.state;

import model.user.User;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="State",
        uniqueConstraints={@UniqueConstraint(columnNames={"state_id"})})
public class State {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="state_id", nullable=false, unique=true, length=11)
    private int id;

    @Column(name="state", length=20, nullable=true)
    private String state;


    @OneToMany(fetch = FetchType.LAZY,mappedBy = "state")
    private Set<User> users;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", users=" + users +
                '}';
    }
}
