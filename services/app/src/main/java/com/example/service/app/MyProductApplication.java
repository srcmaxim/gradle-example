package com.example.service.app;

import com.example.service.cat.DefaultCatService;
import com.example.service.entity.DefaultEntityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DefaultCatService.class, DefaultEntityService.class})
public class MyProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProductApplication.class, args);
    }

}