package com.venesa.mobio.MobileMobio.service;

import com.venesa.mobio.MobileMobio.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<Customer> getAll();
}
