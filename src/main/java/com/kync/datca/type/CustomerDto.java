package com.kync.datca.type;


import lombok.Data;

import java.util.Date;

@Data
public class CustomerDto {

    private Long customerNo;
    private String customerName;
    private String customerSurname;
    private Long identityNo;
    private Date birthDate;
}
