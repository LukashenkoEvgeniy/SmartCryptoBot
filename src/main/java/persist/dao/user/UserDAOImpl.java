package persist.dao.user;

import model.user.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.HibernateUtil;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public User read(int userId) {
        User result;
        try(Session session = sessionFactory.openSession()){
            result = session.get(User.class, userId);
        }catch (Exception e){
            logger.error("Can not read user");
            result = null;
        }
        return result;
    }


    public void create(User user) {
        Transaction transaction = null;
        try(Session session = sessionFactory.openSession()){
            transaction = session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        }catch (Exception e){
            logger.error("Can not create user");
        }

    }

    public void update(User user) {
        Transaction transaction = null;
        try(Session session = sessionFactory.openSession()){
            transaction = session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        }catch (Exception e){
            logger.error("Can not update user");
        }
    }

    public void delete(User user) {
        Transaction transaction = null;
        try(Session session = sessionFactory.openSession()){
            transaction = session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
        }catch (Exception e){
            logger.error("Can not delete user");
        }
    }

    public List<User> getAll() {
        List<User> resultList = null;
        try(Session session = sessionFactory.openSession()){
            resultList = session.createCriteria(User.class).list();
        }catch (Exception e){
            logger.error("Can not delete user");
        }
        return resultList;
    }
}
