package com.kubetrade;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class InstrumentResourceTest {

    @Test
    public void get() {
        given()
                .when().get("/api/instruments")
                .then()
                .statusCode(200);
    }

}