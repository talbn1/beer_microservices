package com.talbn1.beer_microservices.domain;

import com.talbn1.beer_microservices.web.model.v2.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author talbn on 6/28/2020
 **/

//We have created this class to have a calss to map beerDto with with the mapstruct dependency

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
}
