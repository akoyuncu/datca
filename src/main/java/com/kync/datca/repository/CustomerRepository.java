package com.kync.datca.repository;

import com.kync.datca.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CustomerRepository extends MongoRepository<Customer,Long> {

    @Query("{'identityNo': ?0 }")
    Customer findCustomersByIdentityNo(Long identityNo);

}
