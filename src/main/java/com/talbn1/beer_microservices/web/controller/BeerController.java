package com.talbn1.beer_microservices.web.controller;
import com.talbn1.beer_microservices.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/*talbn1 created on 6/7/20*/

@RestController
@RequestMapping("")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById (UUID beerId){

        //TODO impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity savedNewBeer(@RequestBody BeerDto beerDto){

        //TODO impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById (@RequestBody BeerDto beerDto, UUID beerId){

        //TODO impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);

    }

}
