package com.archetech.accetera.model;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Embeddable
public class PropertyUnitDetails {

    @NotNull
    @NotBlank
    @Size(min = 1, max = 50)
    private String type;

    @NotNull
    @Size(min = 1, max = 50)
    private String sqft;

    @NotNull
    @Size(min = 1, max = 50)
    private String floorLevel;

    @NotNull
    @Size(min = 1, max = 50)
    private String bedroom;

    @NotNull
    @Size(min = 1, max = 50)
    private String bathroom;

    @NotNull
    @Size(min = 1, max = 50)
    private String carpark;

}
