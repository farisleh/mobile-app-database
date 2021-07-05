package com.archetech.accetera.model;

import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class PropertyImage {

    @URL
    private String image;
}
