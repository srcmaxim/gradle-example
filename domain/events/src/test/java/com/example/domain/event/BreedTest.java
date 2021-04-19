package com.example.domain.event;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BreedTest {

    @Test
    void constructor_WhenCalled_ThenSetFields() {
        Breed breed = Breed.ABYSSINIAN;

        assertThat(breed).isEqualTo(Breed.ABYSSINIAN);
    }

}
