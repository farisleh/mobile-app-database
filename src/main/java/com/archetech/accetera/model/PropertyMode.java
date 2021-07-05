package com.archetech.accetera.model;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Embeddable
public class PropertyMode {

    @NotNull
    @NotBlank
    @Size(min = 1, max = 50)
    private String mode;
}
