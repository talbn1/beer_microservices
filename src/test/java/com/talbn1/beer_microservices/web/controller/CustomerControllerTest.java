package com.talbn1.beer_microservices.web.controller;

import com.talbn1.beer_microservices.services.CustomerService;
import com.talbn1.beer_microservices.web.model.BeerDto;
import com.talbn1.beer_microservices.web.model.CustomerDto;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;


@WebMvcTest(CustomerController.class)
class CustomerControllerTest {

    @MockBean
    CustomerService customerService;

    CustomerDto validCustomer;

    @Before
    public void setUp() {
        validCustomer = CustomerDto.builder().id(UUID.randomUUID()).name("Tal Ben Arie").build();

    }

}