package com.example.domain.dto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CatDtoTest {

  @Test
  void constructor_WhenCalled_ThenSetFields() {
    CatDto catDto = new CatDto("breed");

    assertThat(catDto.getBreed()).isEqualTo("breed");
  }

}
