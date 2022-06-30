package Batch23;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC3_ValidateHeaders {
	
	
	@Test
	
	public void SingleuserNotFound() {
		
	
	RestAssured.baseURI ="https://reqres.in/";
	
	RequestSpecification httprequest = RestAssured.given(); //prerquest --http method ---Get 
	
	
	Response request = httprequest.request(Method.GET,"/api/users/23");
	
	int statusCode = request.statusCode();
	
	
	System.out.println("RESULT SHOULD BE 404 ======"+ " " + statusCode);
	

	Assert.assertEquals(statusCode, 404);
	
	
	Headers allheaders=request.headers(); // capture all the headers from response
	
	for(Header header:allheaders)
	{
		System.out.println(header.getName()+"     "+header.getValue());
						
	}
	
	}

}
