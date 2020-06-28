package com.talbn1.beer_microservices.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

/**
 * @author talbn on 6/28/2020
 **/

//This is an example
//We have created this class to have a class to map beerDto with with the map-struct dependency

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {

    private UUID id;
    private String name;
}