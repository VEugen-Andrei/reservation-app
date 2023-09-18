package com.reservation.item.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalUser {
    private Long id;
    private String name;
    private String username;
    private String email;
    @JsonProperty("company")
    private CompanyDto companyDto;
    @JsonProperty("address")
    private AddressDto addressDto;
}
