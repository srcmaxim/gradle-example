package com.example.service.entity.api;

import com.example.domain.dto.EntityDto;
import com.example.domain.entity.Entity;

/**
 * EntityService.
 */
public interface EntityService {

  EntityDto map(Entity entity);

}
