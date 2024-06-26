package EX_22062024.CRUD.GET.NONBDDSTyle;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class lab268 {
    RequestSpecification rs = RestAssured.given();
    @Test
    public void getReqNonBDDStyle(){
        RequestSpecification rs = RestAssured.given();
        rs.baseUri("http://api.zusippopotam.us");
        rs.basePath("/IN/509001");


        rs.when().get();

        rs.then().log().all().statusCode(200);
    }
    @Test
    public void getReqNonBDDStyle2(){

        rs.baseUri("http://api.zippopotam.us");
        rs.basePath("/IN/509001");


        rs.when().get();

        rs.then()
                .log().all()
                .statusCode(200);
    }
}
