package apiTest;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class FirstApiTest {
	private void styles() {
		RestAssured.given()
			.when()
			.get("https://www.google.com")
				.then();
	}
	@org.junit.Test
	public void getAllUsers() {
//		RequestSpecification reqSpec= RestAssured.given();
//		Response resp = reqSpec.get("https://reqres.in/api/users?page=1");
//		resp.prettyPrint();
//		
//		ValidatableResponse valRes = resp.then();
//		valRes.statusCode(200);
		
//Get		https://dummy.restapiexample.com/api/v1/employees
//Get		    https://dummy.restapiexample.com/api/v1/employee/1
//Post			https://dummy.restapiexample.com/api/v1/create	
//PUT				https://dummy.restapiexample.com/api/v1/update/21
//DELETE					https://dummy.restapiexample.com/api/v1/delete/2
		
		
		
		
		RestAssured.given()
					.when()
					.get("https://dummy.restapiexample.com/api/v1/employees")
					.then()
					.statusCode(200);
		
		RestAssured.given()
		.when()
		.get("https://dummy.restapiexample.com/api/v1/employees")
		.then()
		.statusCode(200);
		
		RestAssured.given()
		.when()
		.get("https://dummy.restapiexample.com/api/v1/employees")
		.then()
		.statusCode(200);
		
		
		
	}
	

}
