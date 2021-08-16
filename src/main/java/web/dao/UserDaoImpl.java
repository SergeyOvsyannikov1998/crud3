package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

<<<<<<< HEAD
@Component
public class UserDaoImpl implements UserDao {
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void addUser(User user) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
=======

import javax.persistence.*;


@Component
public class UserDaoImpl implements UserDao {
    private EntityManager entityManager;

    @Autowired
    public void setEntityManager(EntityManager entityManager){
        this.entityManager = entityManager;
    }


    @Override
    public void addUser(User user) {
        entityManager.persist(user);
>>>>>>> a16408d (Complete)
    }

    @Override
    public void removeUser(Long id) {
<<<<<<< HEAD
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
        entityManager.getTransaction().commit();
        entityManager.close();
=======
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
>>>>>>> a16408d (Complete)
    }

    @Override
    public void updateUser(User user, Long id) {
<<<<<<< HEAD
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
=======
>>>>>>> a16408d (Complete)

        User existUser = entityManager.find(User.class, id);
        existUser.setFirstName(user.getFirstName());
        existUser.setLastName(user.getLastName());
        existUser.setAge(user.getAge());

        entityManager.merge(existUser);
<<<<<<< HEAD

        entityManager.getTransaction().commit();
        entityManager.close();
=======
>>>>>>> a16408d (Complete)
    }

    @Override
    public User getUser(Long id) {
<<<<<<< HEAD
        return entityManagerFactory.createEntityManager()
=======
        return entityManager
>>>>>>> a16408d (Complete)
                .find(User.class, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getAllUsers() {
<<<<<<< HEAD
        return entityManagerFactory.createEntityManager()
                .createQuery("FROM User")
                .getResultList();
    }
}
=======
        return entityManager
                .createQuery("FROM User")
                .getResultList();
    }

    @Override
    public User getUserByName(String name) {
        return entityManager.createQuery("select u from User u where u.firstName = '" + name + "'", User.class).getSingleResult();
    }
}
>>>>>>> a16408d (Complete)
