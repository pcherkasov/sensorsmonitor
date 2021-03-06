package com.labinvent.cherkasov.core.service.impl;

import com.labinvent.cherkasov.core.exception.ResourceNotFoundException;
import com.labinvent.cherkasov.core.model.User;
import com.labinvent.cherkasov.core.repository.UserRepository;
import com.labinvent.cherkasov.core.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User findById(long id) {
        return userRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
    }

    @Override
    public User findByLogin(String login) {
        return userRepository
                .findByLogin(login)
                .orElseThrow(() -> new ResourceNotFoundException("User", "login", login));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
