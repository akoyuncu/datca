package com.kync.datca.controller;

import com.kync.datca.entity.Customer;
import com.kync.datca.service.ICustomerService;
import com.kync.datca.type.CustomerDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.dozer.Mapper;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/datca")
@Api(tags = {"Datca"})
@SwaggerDefinition(tags = {@Tag(name = "Datca", description = "DemoController Controller")})
public class DemoController {

    private final Mapper mapper;

    private final ICustomerService customerService;

    public DemoController(ICustomerService customerService, Mapper mapper) {
        this.customerService = customerService;
        this.mapper = mapper;
    }

    @ApiOperation(value = "Inquire Customer  with identityNumber.")
    @GetMapping(value = "/customer/{identityNo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerDto> get(@PathVariable Long identityNo) {
        return ResponseEntity.ok(mapper.map(customerService.inquireCustomer(identityNo),CustomerDto.class));
    }

    @ApiOperation(value = "Create new Customer")
    @RequestMapping(value = "/customer/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto) {
        return ResponseEntity.ok(mapper.map(customerService.createCustomer(customerDto),CustomerDto.class));
    }

}
