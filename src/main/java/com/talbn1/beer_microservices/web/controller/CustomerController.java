package com.talbn1.beer_microservices.web.controller;

import com.talbn1.beer_microservices.services.BeerService;
import com.talbn1.beer_microservices.services.CustomerService;
import com.talbn1.beer_microservices.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author talbn on 6/11/2020
 **/

@RestController
@RequestMapping("/api/v1/customer")


public class CustomerController {

    public final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId") UUID customerId){
        return new ResponseEntity<>(customerService.getCustomer(customerId) , HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerDto> saveNewCustomer(@RequestBody CustomerDto customerDto){
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping({"/{customerId}"})
    public ResponseEntity<CustomerDto> updateCustomer (@PathVariable("customerId") UUID customerId,
                                                       @RequestBody CustomerDto customerDto){
        customerService.updateCustomer(customerId, customerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{customerId}"})
    public ResponseEntity<CustomerDto> deleteCustomer (@PathVariable("customerId") UUID customerId){
        customerService.deleteCustomer(customerId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
