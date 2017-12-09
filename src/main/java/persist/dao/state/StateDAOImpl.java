package persist.dao.state;

import model.state.State;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.HibernateUtil;

import java.util.List;

public class StateDAOImpl implements StateDAO {

    Logger logger = LoggerFactory.getLogger(StateDAOImpl.class);
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public State read(int stateId) {
        State result;
        try(Session session = sessionFactory.openSession()){
            result = session.get(State.class, stateId);
        }catch (Exception e){
            logger.error("Can not read");
            result = null;
        }
        return result;
    }


    public void create(State state) {
        Transaction transaction = null;
        try(Session session = sessionFactory.openSession()){
            transaction = session.beginTransaction();
            session.save(state);
            session.getTransaction().commit();
        }catch (Exception e){
            logger.error("Can not create");
        }

    }

    public void update(State state) {
        Transaction transaction = null;
        try(Session session = sessionFactory.openSession()){
            transaction = session.beginTransaction();
            session.update(state);
            session.getTransaction().commit();
        }catch (Exception e){
            logger.error("Can not update");
        }
    }

    public void delete(State state) {
        Transaction transaction = null;
        try(Session session = sessionFactory.openSession()){
            transaction = session.beginTransaction();
            session.delete(state);
            session.getTransaction().commit();
        }catch (Exception e){
            logger.error("Can not delete");
        }
    }

    public List<State> getAll() {
        List<State> resultList = null;
        try(Session session = sessionFactory.openSession()){
            resultList = session.createCriteria(State.class).list();
        }catch (Exception e){
            logger.error("Can not delete");
        }
        return resultList;
    }
}
