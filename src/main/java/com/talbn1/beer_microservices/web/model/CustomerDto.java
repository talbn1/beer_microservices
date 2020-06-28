package com.talbn1.beer_microservices.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.UUID;
/**
 * @author talbn on 6/11/2020
 **/


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {

        private UUID id;
        @NotBlank
        @Size(min = 3,max = 100)
        private String name;
}
