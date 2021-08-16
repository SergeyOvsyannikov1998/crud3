package web.service;

<<<<<<< HEAD
=======
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
>>>>>>> a16408d (Complete)
import web.model.User;

import java.util.List;

<<<<<<< HEAD
public interface UserService {
=======
public interface UserService extends UserDetailsService{
>>>>>>> a16408d (Complete)
    void addUser(User user);
    void removeUser(Long id);
    void updateUser(User user, Long id);
    User getUser(Long id);
    List<User> getAllUsers();
<<<<<<< HEAD
=======
    User getUserByName(String name);
>>>>>>> a16408d (Complete)
}
