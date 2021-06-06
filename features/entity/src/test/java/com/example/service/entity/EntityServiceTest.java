package com.example.service.entity;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.domain.dto.EntityDto;
import com.example.domain.entity.Entity;
import org.junit.jupiter.api.Test;

class EntityServiceTest {

  private final DefaultEntityService testee = new DefaultEntityService();

  @Test
  void map_WhenCalledWithNullValues_ThenReturnNullValues() {
    EntityDto entityDto = testee.map(new Entity(null));

    assertThat(entityDto.getName()).isNull();
  }

  @Test
  void map_WhenCalledWithValues_ThenReturnValues() {
    EntityDto entityDto = testee.map(new Entity("name"));

    assertThat(entityDto.getName()).isEqualTo("name");
  }

}
