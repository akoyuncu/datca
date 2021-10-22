package com.kync.datca.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Data
@Document(collection = "customers")
public class Customer {

    @Id
    private Long customerNo;
    private String customerName;
    private String customerSurname;
    private Long identityNo;
    private Date birthDate;

    public Customer(Long customerNo, String customerName, String customerSurname, Long identityNo, Date birthDate) {
        super();
        this.customerNo = customerNo;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.identityNo = identityNo;
        this.birthDate = birthDate;
    }
}
