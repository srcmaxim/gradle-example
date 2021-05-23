package com.example.service.app;

import com.example.domain.dto.EntityDto;
import com.example.domain.entity.Entity;
import com.example.domain.event.Cat;
import com.example.service.cat.CatService;
import com.example.service.entity.EntityService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MyProductController.
 */
@RestController
@AllArgsConstructor
public class MyProductController {

  private final CatService catService;
  private final EntityService entityService;

  @GetMapping(value = "/cat", produces = MediaType.APPLICATION_JSON_VALUE)
  public Cat getCat() {
    return catService.getCat();
  }

  @GetMapping(value = "/entity", produces = MediaType.APPLICATION_JSON_VALUE)
  public EntityDto getEntity() {
    var entity = new Entity("name");
    return entityService.map(entity);
  }

}
