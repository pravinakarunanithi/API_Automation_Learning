package com.api.test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void verifyGetUserData() {
        baseURI = "https://reqres.in";

        given()
            .header("Content-Type", "application/json")
        .when()
            .get("/api/users/2")
        .then()
            .statusCode(200)
            .body("data.email", equalTo("janet.weaver@reqres.in"))
            .body("data.first_name", equalTo("Janet"))
            .log().all(); 
    }
}
