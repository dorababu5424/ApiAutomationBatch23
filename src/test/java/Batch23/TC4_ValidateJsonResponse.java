package Batch23;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC4_ValidateJsonResponse {
	
	
	@Test
	public void GetWeatherDetails()
	{
		
		//Specify base URI
		RestAssured.baseURI ="https://dummy.restapiexample.com";
				
				//Request object
				RequestSpecification httpRequest=RestAssured.given();
				
				//Response object
				Response response = httpRequest.request(Method.GET,"/api/v1/employees");
				
				//print response in console window
				String responseBody=response.getBody().asString();
				System.out.println("Response Body is:" +responseBody);
				
				//Assert.assertEquals(responseBody.contains("Delhi"),true);
			
			
	}

}
