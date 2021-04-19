package com.example.domain.entity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EntityTest {

    @Test
    void constructor_WhenCalled_ThenSetFields() {
        Entity entity = new Entity("name");

        assertThat(entity.getName()).isEqualTo("name");
    }

}
