package com.example.domain.entity;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EntityTest {

  @Test
  void constructor_WhenCalled_ThenSetFields() {
    Entity entity = new Entity("name");

    assertThat(entity.getName()).isEqualTo("name");
  }

}
