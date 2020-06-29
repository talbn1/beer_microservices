package com.talbn1.beer_microservices.web.mappers;

import com.talbn1.beer_microservices.domain.Beer;
import com.talbn1.beer_microservices.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * @author talbn on 6/28/2020
 **/

//This interface will create automatically the map between Beer and BeerDTO with @Mapper from mapstruct
// If we will compile this project and go to target folder we will se that mapstract created a full mapper

//In addition to @Mapper, we can add another mapper like this example:
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto beerDto);
}
