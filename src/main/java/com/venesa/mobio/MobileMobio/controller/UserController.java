package com.venesa.mobio.MobileMobio.controller;

import com.venesa.common.Utils.ConstantsUtil;
import com.venesa.common.config.EnvironmentConfig;
import com.venesa.mobio.MobileMobio.common.ResponseData;
import com.venesa.mobio.MobileMobio.common.WrapperResponseData;
import com.venesa.mobio.MobileMobio.entity.Customer;
import com.venesa.mobio.MobileMobio.entity.User;
import com.venesa.mobio.MobileMobio.service.CustomerService;
import com.venesa.mobio.MobileMobio.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/mobio/mobile")
@AllArgsConstructor
public class UserController {
    private final WrapperResponseData wrapperResponse;
    private final CustomerService customerService;
    private final UserService userService;


    @PostMapping("/createUser")
    public ResponseEntity<?> findAllCustomer(@RequestBody User user) {
        ResponseEntity<?> responseEntity;
        String customerCode = null;
        List<Customer> customerList = null;
        try {
            userService.save(user);
            customerList = customerService.getAll();
            for (Customer customer : customerList) {
                if (user.getIdentifyCode().equals(customer.getIdCardNo())) {
                    customerCode = customer.getCustomerCode();
                    break;
                }
            }
            responseEntity = wrapperResponse.success(new ResponseData<>(ConstantsUtil.SUCCSESS, ConstantsUtil.SUCCSESS_MESS, customerCode));

        } catch (Exception e) {
            responseEntity = wrapperResponse.error(new ResponseData<>(ConstantsUtil.ERROR, e.getMessage(), null), HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }

    @PutMapping("/updateUser")
    public ResponseEntity<?> updateInfoCustomer(@RequestBody User user) {
        ResponseEntity<?> responseEntity;
        String customerCode = null;
        List<Customer> customerList = null;
        try {
            userService.save(user);
            customerList = customerService.getAll();
            for (Customer customer : customerList) {
                if (user.getIdentifyCode().equals(customer.getIdCardNo())) {
                    customerCode = customer.getCustomerCode();
                    break;
                }
            }
            responseEntity = wrapperResponse.success(new ResponseData<>(ConstantsUtil.SUCCSESS, ConstantsUtil.SUCCSESS_MESS, customerCode));

        } catch (Exception e) {
            responseEntity = wrapperResponse.error(new ResponseData<>(ConstantsUtil.ERROR, e.getMessage(), null), HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }
}

