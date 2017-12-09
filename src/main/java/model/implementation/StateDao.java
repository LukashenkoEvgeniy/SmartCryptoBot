package model.implementation;

import model.domain.State;
import model.service.StateImp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

public class StateDao implements StateImp {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void create(State state) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(state);
        session.getTransaction().commit();
        session.close();
    }

    public void update(State state) {

    }

    public void delete(State state) {

    }
}
