package com.archetech.accetera.services;

import com.archetech.accetera.model.Property;
import com.archetech.accetera.repositories.PropertyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    private final PropertyRepository propertyRepository;

    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    public List<Property> getAllProperty(){

        return propertyRepository.findAll();
    }

    public String addProperty(Property property){

        propertyRepository.save(property);
        return "Property add successfully.";
    }

    public String removedProperty(Property property){

        propertyRepository.delete(property);
        return "Property removed successfully.";
    }

    public String updateProperty(Property property){

        try{
            if(propertyRepository.existsById(property.getId())){
                propertyRepository.save(property);
                return "Property update successfully";
            }else{
                return "Property does not exist.";
            }
        }catch (Exception e){
            throw e;
        }
    }
}
