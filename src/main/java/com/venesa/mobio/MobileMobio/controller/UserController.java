package com.venesa.mobio.MobileMobio.controller;

import com.venesa.common.Utils.ConstantsUtil;
import com.venesa.mobio.MobileMobio.common.ResponseData;
import com.venesa.mobio.MobileMobio.common.WrapperResponseData;
import com.venesa.mobio.MobileMobio.entity.Customer;
import com.venesa.mobio.MobileMobio.entity.User;
import com.venesa.mobio.MobileMobio.service.CustomerService;
import com.venesa.mobio.MobileMobio.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/mobio/mobile/")
public class UserController {
    private final WrapperResponseData wrapperResponse;
    @Autowired
    private CustomerService customerService;
    private UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<?> findAllCustomer(@RequestBody User user, HttpServletRequest request) {
        ResponseEntity<?> responseEntity;
        String customerCode = null;
        List<Customer> customerList = null;
        try {
            userService.save(user);
            customerList = customerService.getAll();
            for (Customer customer : customerList) {
                if (user.getIdCardNo().equals(customer.getIdCardNo())) {
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
