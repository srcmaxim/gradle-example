package com.example.domain.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EntityDtoTest {

    @Test
    void constructor_WhenCalled_ThenSetFields() {
        EntityDto entityDto = new EntityDto("name");

        assertThat(entityDto.getName()).isEqualTo("name");
    }

}
