package com.example.service.cat;

import com.example.domain.event.Breed;
import com.example.domain.event.Cat;

import org.springframework.stereotype.Service;

@Service
public class DefaultCatService implements CatService {

    private static final Breed[] BREEDS = Breed.values();

    @Override
    public Cat getCat() {
        int breedsNumber = (int) (Math.random() * BREEDS.length);
        return new Cat(BREEDS[breedsNumber]);
    }

}
