package com.labinvent.cherkasov.core.service;

import com.labinvent.cherkasov.core.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    User save(User user);

    User findById(long id);

    User findByLogin(String login);

    List<User> findAll();

}
