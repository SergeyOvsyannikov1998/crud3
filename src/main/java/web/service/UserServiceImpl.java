package web.service;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDaoImpl;
=======
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
>>>>>>> a16408d (Complete)
import web.model.User;

import java.util.List;

<<<<<<< HEAD
@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDaoImpl userDao;

=======
@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @org.springframework.transaction.annotation.Transactional
>>>>>>> a16408d (Complete)
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

<<<<<<< HEAD
=======
    @org.springframework.transaction.annotation.Transactional
>>>>>>> a16408d (Complete)
    @Override
    public void removeUser(Long id) {
        userDao.removeUser(id);
    }

<<<<<<< HEAD
=======
    @org.springframework.transaction.annotation.Transactional
>>>>>>> a16408d (Complete)
    @Override
    public void updateUser(User user, Long id) {
        userDao.updateUser(user, id);
    }

<<<<<<< HEAD
=======
    @org.springframework.transaction.annotation.Transactional
>>>>>>> a16408d (Complete)
    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

<<<<<<< HEAD
=======
    @Transactional
>>>>>>> a16408d (Complete)
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
<<<<<<< HEAD
}
=======

    @Override
    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userDao.getUserByName(s);
    }
}
>>>>>>> a16408d (Complete)
