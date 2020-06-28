package com.talbn1.beer_microservices.web.mappers;

import com.talbn1.beer_microservices.domain.Beer;
import com.talbn1.beer_microservices.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * @author talbn on 6/28/2020
 **/

//This interface will create automaticly the map between Beer and BeerDTO with @Mapper from mapstruct

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto beerDto);
}
