package com.archetech.accetera.model;

import lombok.Data;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Property{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 255)
    private String user_id;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 255)
    private String name;

    @NotNull
    @NotBlank
    @Size(min = 0,max = 999999999)
    private String price;

    @ElementCollection
    private List<PropertyImage> imageList;

    @ElementCollection
    private List<PropertyVideo> videoList;

    @NotNull
    @Embedded
    @AttributeOverrides({ @AttributeOverride(name = "address", column = @Column(name = "property_address")),
            @AttributeOverride(name = "city", column = @Column(name = "property_city")),
            @AttributeOverride(name = "state", column = @Column(name = "property_state")),
            @AttributeOverride(name = "postCode", column = @Column(name = "property_post_code")) })
    private PropertyAddress address;

    @ElementCollection
    private Set<PropertyType> type;

    @ElementCollection
    private Set<PropertyMode> mode;

    @ElementCollection
    private Set<PropertyOwner> owner;

    @ElementCollection
    private Set<PropertyOwnerDetails> ownerDetails;

    @ElementCollection
    private Set<PropertyAgent> agent;

    @ElementCollection
    private Set<PropertyAgentNo> agentNo;

    @ElementCollection
    private Set<PropertyBumiLot> bumiLot;

    @ElementCollection
    private Set<PropertyFurnishing> furnishing;

    @ElementCollection
    private Set<PropertyNego> negotiable;

    @ElementCollection
    private Set<PropertyStatus> status;

    @ElementCollection
    private Set<PropertyUnitDetails> unitDetails;

    @ElementCollection
    private Set<PropertyUnitType> unitTypes;

}
