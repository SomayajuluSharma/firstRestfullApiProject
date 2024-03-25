package dev.stunning.restfullapiproject;

public record Greeting(long id, String content) {
}
// Compare this snippet from src/test/java/dev/stunning/restfullapiproject/GreetingControllerTest.java:
// package dev.stunning.restfullapiproject;
//
// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;
//
// @SpringBootTest
// class RestfullApi
