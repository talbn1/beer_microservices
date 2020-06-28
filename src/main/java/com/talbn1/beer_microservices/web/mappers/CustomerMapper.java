package com.talbn1.beer_microservices.web.mappers;

import com.talbn1.beer_microservices.domain.Beer;
import com.talbn1.beer_microservices.domain.Customer;
import com.talbn1.beer_microservices.web.model.BeerDto;
import com.talbn1.beer_microservices.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * @author talbn on 6/28/2020
 **/

//This interface will create automatically the map between Beer and BeerDTO with @Mapper from mapstruct
// If we will compile this project and go to target folder we will se that mapstract created a full mapper


@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);
    Customer CustomerDtoToCustomer(CustomerDto customerDto);
}
