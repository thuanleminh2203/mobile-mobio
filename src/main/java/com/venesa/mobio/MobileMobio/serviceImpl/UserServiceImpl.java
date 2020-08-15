package com.venesa.mobio.MobileMobio.serviceImpl;

import com.venesa.mobio.MobileMobio.entity.User;
import com.venesa.mobio.MobileMobio.repository.UserRepository;
import com.venesa.mobio.MobileMobio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
