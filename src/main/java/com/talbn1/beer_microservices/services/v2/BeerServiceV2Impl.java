package com.talbn1.beer_microservices.services.v2;

import com.talbn1.beer_microservices.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Service;

import java.util.UUID;
/**
 * @author talbn on 6/28/2020
 **/
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}