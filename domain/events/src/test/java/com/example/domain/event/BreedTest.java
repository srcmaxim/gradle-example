package com.example.domain.event;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BreedTest {

  @Test
  void constructor_WhenCalled_ThenSetFields() {
    Breed breed = Breed.ABYSSINIAN;

    assertThat(breed).isEqualTo(Breed.ABYSSINIAN);
  }

}
