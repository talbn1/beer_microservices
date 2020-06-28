package com.talbn1.beer_microservices.web.controller;
import com.talbn1.beer_microservices.services.BeerService;
import com.talbn1.beer_microservices.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

/*talbn1 created on 6/7/20*/

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDto> handlePost(@Valid @RequestBody BeerDto beerDto){
        BeerDto savedDto = beerService.saveNewBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location","/api/v1/beer/" + savedDto.getId().toString());

        return new ResponseEntity(headers,HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId,@Valid @RequestBody BeerDto beerDto){
        beerService.updateBeer(beerId,beerDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    public ResponseEntity deleteBeer(@PathVariable("beerId") UUID beerId){
        beerService.deleteById(beerId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
