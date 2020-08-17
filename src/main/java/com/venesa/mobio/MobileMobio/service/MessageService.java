package com.venesa.mobio.MobileMobio.service;

import com.venesa.mobio.MobileMobio.entity.Message;
import org.springframework.stereotype.Service;

public interface MessageService {
    Message save(Message message);
}
