package com.archetech.accetera.repositories;

import com.archetech.accetera.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property,Long> {

    boolean existsById(Long id);
}
