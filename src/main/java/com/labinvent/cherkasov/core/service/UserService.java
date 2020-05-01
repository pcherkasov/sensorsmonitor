package com.labinvent.cherkasov.core.service;

import com.labinvent.cherkasov.core.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    User findById(long id);

    User findByLogin(String login);

    List<User> findAll();

}
