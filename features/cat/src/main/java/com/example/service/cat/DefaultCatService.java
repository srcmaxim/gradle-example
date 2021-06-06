package com.example.service.cat;

import com.example.domain.event.Breed;
import com.example.domain.event.Cat;
import com.example.service.cat.api.CatService;
import java.security.SecureRandom;
import java.util.Random;
import org.springframework.stereotype.Service;

/**
 * DefaultCatService.
 */
@Service
public class DefaultCatService implements CatService {

  private static final Breed[] BREEDS = Breed.values();
  private static final Random RANDOM = new SecureRandom();

  @Override

  public Cat getCat() {
    var breedsNumber = RANDOM.nextInt(BREEDS.length);
    return new Cat(BREEDS[breedsNumber]);
  }

}
