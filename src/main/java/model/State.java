package model;

import javax.persistence.*;

@Entity
@Table(name="State",
        uniqueConstraints={@UniqueConstraint(columnNames={"ID"})})
public class State {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID", nullable=false, unique=true, length=11)
    private int id;

    @Column(name="STATE", length=20, nullable=true)
    private String state;

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
}
