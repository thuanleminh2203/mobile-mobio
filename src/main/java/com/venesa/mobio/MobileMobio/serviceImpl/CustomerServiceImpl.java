package com.venesa.mobio.MobileMobio.serviceImpl;

import com.venesa.mobio.MobileMobio.entity.Customer;
import com.venesa.mobio.MobileMobio.repository.CustomerRepository;
import com.venesa.mobio.MobileMobio.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAll() {
        List<Customer> customerList = customerRepository.findAll();
        return customerList;
    }
}
