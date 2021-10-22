package com.kync.datca.service;

import com.kync.datca.entity.Customer;
import com.kync.datca.type.CustomerDto;

public interface ICustomerService {

    Customer inquireCustomer(Long identityNo);

    Customer createCustomer(CustomerDto customerDto);

    void updateCustomer(CustomerDto customerDto);

    void deleteCustomer(Long identityNo);

}
