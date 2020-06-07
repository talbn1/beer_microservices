package com.talbn1.beer_microservices.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;


/*talbn1 created on 6/7/20*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private Integer verison;
    private OffsetDateTime createDate;
    private OffsetDateTime lastModifiedDate;
    private String beerName;
    private BeerStyleName beerStyle;
    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;
}
