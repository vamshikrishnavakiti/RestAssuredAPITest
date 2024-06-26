package TestNgDemo;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class lab261 {
	@Test
	public void getRequest(){
		RestAssured
		.given()
		.baseUri("http://restful-booker.herokuapp.com")
		.basePath("/ping")
		.when().get().
		then().statusCode(201);
	}
	@Test
	public void getRequest2(){
		RestAssured
		.given()
		.baseUri("http://restful-booker.herokuapp.com")
		.basePath("/ping")
		.when().get().
		then().statusCode(201);
	}


}
