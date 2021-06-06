package com.example.service.entity;

import com.example.domain.dto.EntityDto;
import com.example.domain.entity.Entity;
import com.example.service.entity.api.EntityService;
import org.springframework.stereotype.Service;

/**
 * DefaultEntityService.
 */
@Service
public class DefaultEntityService implements EntityService {

  @Override
  public EntityDto map(Entity entity) {
    return new EntityDto(entity.getName());
  }

}
