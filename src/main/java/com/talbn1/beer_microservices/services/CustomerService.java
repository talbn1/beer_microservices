package com.talbn1.beer_microservices.services;
import com.talbn1.beer_microservices.web.model.CustomerDto;
import java.util.UUID;

/**
 * @author talbn on 6/11/2020
 **/
public interface CustomerService {
    CustomerDto getCustomer(UUID uuid);
    void createCustomer(CustomerDto customerDto);
    void updateCustomer(UUID uuid, CustomerDto customerDto);
    void deleteCustomer(UUID uuid);
}
