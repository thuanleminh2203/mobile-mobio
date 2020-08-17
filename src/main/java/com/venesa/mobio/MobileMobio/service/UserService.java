package com.venesa.mobio.MobileMobio.service;

import com.venesa.mobio.MobileMobio.entity.Survey;
import com.venesa.mobio.MobileMobio.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface UserService {
    User save(User user);
}
