package com.kync.datca.entity;

import lombok.Data;

import java.util.Date;


@Data
public class Customer {

    private Long customerNo;
    private String customerName;
    private String customerSurname;
    private Long identityNo;
    private Date birthDate;
}
