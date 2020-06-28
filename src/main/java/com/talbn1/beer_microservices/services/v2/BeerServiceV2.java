package com.talbn1.beer_microservices.services.v2;

import com.talbn1.beer_microservices.web.model.v2.BeerDtoV2;
import java.util.UUID;
/**
 * @author talbn on 6/28/2020
 **/

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);
    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);
    void updateBeer(UUID beerId, BeerDtoV2 beerDto);
    void deleteById(UUID beerId);
}