package com.example.service.app;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.example.domain.dto.CatDto;
import com.example.domain.dto.EntityDto;
import com.example.domain.event.Breed;
import com.example.domain.event.Cat;
import com.example.service.cat.CatService;
import com.example.service.entity.EntityService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MyProductControllerTest {

  @Mock
  CatService catService;
  @Mock
  EntityService entityService;
  @InjectMocks
  MyProductController myProductController;

  @Test
  void testGetCat() {
    when(catService.getCat()).thenReturn(new Cat(Breed.ABYSSINIAN));

    CatDto result = myProductController.getCat();
    Assertions.assertEquals(Breed.ABYSSINIAN.name(), result.getBreed());
  }

  @Test
  void testGetEntity() {
    when(entityService.map(any())).thenReturn(new EntityDto("name"));

    EntityDto result = myProductController.getEntity();
    Assertions.assertEquals(new EntityDto("name"), result);
  }

}
