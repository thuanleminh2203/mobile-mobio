package com.venesa.mobio.MobileMobio.serviceImpl;

import com.venesa.mobio.MobileMobio.entity.Message;
import com.venesa.mobio.MobileMobio.repository.MessageRepository;
import com.venesa.mobio.MobileMobio.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageRepository messageRepository;

    @Override
    public Message save(Message message) {
        return messageRepository.save(message);
    }
}
