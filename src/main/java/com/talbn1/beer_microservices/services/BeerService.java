package com.talbn1.beer_microservices.services;

import com.talbn1.beer_microservices.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
    void updateBeer(UUID beerId, BeerDto beerDto);
    void deleteBeer(UUID beerId);
}
