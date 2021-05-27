package com.example.service.app;

import com.example.service.cat.DefaultCatService;
import com.example.service.entity.DefaultEntityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * MyProductApplication.
 */
@SpringBootApplication
@Import({DefaultCatService.class, DefaultEntityService.class})
public class MyProductApplication {

  /**
   * Starts Spring Boot application.
   *
   * @param args Spring arguments for app
   */
  public static void main(String[] args) {
    var context = SpringApplication.run(MyProductApplication.class, args);
    Runtime.getRuntime().addShutdownHook(
        new Thread(() -> SpringApplication.exit(context, () -> 0)));
  }

}