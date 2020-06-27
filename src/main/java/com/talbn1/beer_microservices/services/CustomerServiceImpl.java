package com.talbn1.beer_microservices.services;

import com.talbn1.beer_microservices.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author talbn on 6/11/2020
 **/
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID uuid) {return CustomerDto.builder().name("Tal").id(UUID.randomUUID()).build();}

    @Override
    public void createCustomer(CustomerDto customerDto) {

    }

    @Override
    public void updateCustomer(UUID uuid, CustomerDto customerDto) {

    }

    @Override
    public void deleteCustomer(UUID uuid) {

    }
}
