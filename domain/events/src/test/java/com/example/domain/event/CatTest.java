package com.example.domain.event;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CatTest {

  @Test
  void constructor_WhenCalled_ThenSetFields() {
    Cat cat = new Cat(Breed.ABYSSINIAN);

    assertThat(cat.getBreed()).isEqualTo(Breed.ABYSSINIAN);
  }

}
