package com.archetech.accetera.model;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
@Data
public class PropertyAgent {

    @NotNull
    @NotBlank
    @Size(min = 1, max = 50)
    private String agent;
}
