package com.talbn1.beer_microservices.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.talbn1.beer_microservices.services.BeerService;
import com.talbn1.beer_microservices.web.model.BeerDto;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import java.util.UUID;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/*talbn1 created on 6/7/20*/

@WebMvcTest(BeerController.class)
class BeerControllerTest {

    @MockBean
    BeerService beerService;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    BeerDto validBeer;

    @Before
    public void setUp() {
        validBeer = BeerDto.builder().id(UUID.randomUUID())
                .beerName("Beer1")
                .beerStyle("PALE_ALE")
                .upc(123456789012L)
                .build();
    }

    @Test
    void getBeerById() throws Exception {
    }

    @Test
    void savedNewBeer() {
    }

    @Test
    void updateBeerById() {
    }
}












