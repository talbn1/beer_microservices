package com.talbn1.beer_microservices.services;

import com.talbn1.beer_microservices.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author talbn on 6/11/2020
 **/
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().beerName("galaxy cat").beerStyle("PALE_ALE" ).upc(1245245564L).build();
    }
    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
    }
    @Override
    public void deleteBeer(UUID beerId) {

    }


}
