package com.example.service.cat;

import com.example.domain.event.Breed;
import com.example.domain.event.Cat;
import java.util.Random;
import org.springframework.stereotype.Service;

/**
 * DefaultCatService.
 */
@Service
public class DefaultCatService implements CatService {

  private static final Breed[] BREEDS = Breed.values();
  private static final Random RANDOM = new Random();

  @Override
  public Cat getCat() {
    int breedsNumber = RANDOM.nextInt(BREEDS.length);
    return new Cat(BREEDS[breedsNumber]);
  }

}
