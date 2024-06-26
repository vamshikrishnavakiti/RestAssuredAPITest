package org.example.Lab1;

import io.restassured.RestAssured;

public class lsb260 {

	public static void main(String[] args) {
		// Rest Assured Hello world program.

		RestAssured
		.given()
		.baseUri("http://restful-booker.herokuapp.com")
		.basePath("/ping")
		.when().get().
		then().statusCode(201);


	}

}
