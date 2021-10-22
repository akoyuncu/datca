package com.kync.datca.service;

import com.kync.datca.entity.Customer;
import com.kync.datca.repository.CustomerRepository;
import com.kync.datca.type.CustomerDto;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements ICustomerService{

    final
    CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer inquireCustomer(Long identityNo) {
        Customer customer=customerRepository.findCustomersByIdentityNo(identityNo);
        return customer;
    }

    @Override
    public Customer createCustomer(CustomerDto customerDto) {
       return customerRepository.save(new Customer(customerDto.getCustomerNo(),customerDto.getCustomerName(),customerDto.getCustomerSurname(),customerDto.getIdentityNo(),customerDto.getBirthDate()));
    }

    @Override
    public void updateCustomer(CustomerDto customerDto) {

    }

    @Override
    public void deleteCustomer(Long identityNo) {

    }
}
