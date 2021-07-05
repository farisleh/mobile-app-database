package com.archetech.accetera.model;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Embeddable
public class PropertyOwnerDetails {

    @NotNull
    @NotBlank
    @Size(min = 1, max = 255)
    private String name;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 255)
    private String phone;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 255)
    private String availableDate;
}
