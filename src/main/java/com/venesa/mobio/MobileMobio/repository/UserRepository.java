package com.venesa.mobio.MobileMobio.repository;

import com.venesa.mobio.MobileMobio.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    @Transactional
    User save(User user);
}
