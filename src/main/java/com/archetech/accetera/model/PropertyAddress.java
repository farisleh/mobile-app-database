package com.archetech.accetera.model;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Embeddable
public class PropertyAddress {

    @NotNull
    @NotBlank
    @Size(min = 1, max = 255)
    private String address;

    @Size(min = 1, max = 100)
    private String state;

    @Size(min = 1, max = 100)
    private String city;

    @NotNull
    @NotBlank
    @Size(min = 2, max = 10)
    private String postCode;


}
