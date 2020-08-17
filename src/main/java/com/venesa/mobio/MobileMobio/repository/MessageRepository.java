package com.venesa.mobio.MobileMobio.repository;

import com.venesa.mobio.MobileMobio.entity.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {
    @Transactional
    Message save(Message message);
}
