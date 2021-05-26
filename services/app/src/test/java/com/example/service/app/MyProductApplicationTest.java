package com.example.service.app;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MyProductApplicationTest {

  private static final int PORT = 1_000 + new Random().nextInt(65_536 - 1_000);

  private static final HttpClient CLIENT = HttpClient.newHttpClient();
  private static final Builder REQUEST_BUILDER = HttpRequest.newBuilder()
      .version(Version.HTTP_2)
      .timeout(Duration.of(1, ChronoUnit.SECONDS))
      .header("Accept", "application/json")
      .GET();
  private static final HttpRequest REQUEST_CAT = REQUEST_BUILDER
      .uri(URI.create("http://localhost:" + PORT + "/cat"))
      .build();
  private static final HttpRequest REQUEST_ENTITY = REQUEST_BUILDER
      .uri(URI.create("http://localhost:" + PORT + "/entity"))
      .build();

  private static Thread APP_THREAD;

  @BeforeAll
  @SneakyThrows
  static void setup() {
    String[] args = {"--server.port=" + PORT};
    APP_THREAD = new Thread(() -> MyProductApplication.main(args));
    APP_THREAD.setName("app-" + PORT);
    APP_THREAD.setDaemon(true);
    APP_THREAD.start();
    Thread.sleep(Duration.of(10, ChronoUnit.SECONDS).toMillis());
  }

  @AfterAll
  @SneakyThrows
  static void teardown() {
    APP_THREAD.interrupt();
    APP_THREAD.join();
  }

  @Test
  @SneakyThrows
  void main_WhenRequestCatCalled_ThenAppStartsAndHandlesResponses() {
    int statusCodeCat = CLIENT.send(REQUEST_CAT, BodyHandlers.ofString()).statusCode();

    assertThat(statusCodeCat).isEqualTo(200);
  }

  @Test
  @SneakyThrows
  void main_WhenRequestEntityCalled_ThenAppStartsAndHandlesResponses() {
    int statusCodeEntity = CLIENT.send(REQUEST_ENTITY, BodyHandlers.ofString()).statusCode();

    assertThat(statusCodeEntity).isEqualTo(200);
  }

}
