package com.venesa.mobio.MobileMobio.repository;

import com.venesa.mobio.MobileMobio.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findAll();
}
