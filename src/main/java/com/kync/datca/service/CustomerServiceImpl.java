package com.kync.datca.service;

import com.kync.datca.entity.Customer;
import com.kync.datca.type.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class CustomerServiceImpl implements ICustomerService{


    @Override
    public Customer inquireCustomer(Long identityNo) {

        Customer customer = new Customer();
        customer.setCustomerNo(123L);
        customer.setCustomerName("Ahmet");
        customer.setCustomerSurname("Kync");
        customer.setBirthDate(new Date());
        customer.setIdentityNo(25273781678L);
        return customer;
    }

    @Override
    public Customer createCustomer(CustomerDto customerDto) {
        return null;
    }

    @Override
    public Customer updateCustomer(CustomerDto customerDto) {
        return null;
    }

    @Override
    public void deleteCustomer(Long identityNo) {

    }
}
