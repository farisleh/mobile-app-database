package com.archetech.accetera.controllers;

import com.archetech.accetera.model.Property;
import com.archetech.accetera.services.PropertyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PropertyController {

    private final PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @RequestMapping(value = "getallproperty", method = RequestMethod.GET)
    public List<Property> getAllProperty(){
        return propertyService.getAllProperty();
    }

    @RequestMapping(value = "addproperty", method = RequestMethod.POST)
    public String addProperty(@RequestBody Property property) {
        return propertyService.addProperty(property);
    }

    @RequestMapping(value = "updateproperty", method = RequestMethod.PUT)
    public String updateProperty(@RequestBody Property property) {
        return propertyService.updateProperty(property);
    }

    @RequestMapping(value = "deleteproperty", method = RequestMethod.DELETE)
    public String removedProperty(@RequestBody Property property) {
        return propertyService.removedProperty(property);
    }
}
