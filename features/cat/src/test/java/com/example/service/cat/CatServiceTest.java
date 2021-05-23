package com.example.service.cat;


import static org.assertj.core.api.Assertions.assertThat;

import com.example.domain.event.Cat;
import org.junit.jupiter.api.Test;

class CatServiceTest {

  @Test
  void getCat_WhenCalled_ThenGetCatWithBreed() {
    DefaultCatService catService = new DefaultCatService();

    Cat cat = catService.getCat();

    assertThat(cat.getBreed()).isNotNull();
  }

}
