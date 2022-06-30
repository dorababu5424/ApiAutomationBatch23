package Batch23;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class TC1_GET_Request {
	
	
//	@Test
//	public void getWeatherDetials()
//	{
//		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city"; // URI
//		
//		RequestSpecification httpRequest=RestAssured.given();
//		
//		Response response=httpRequest.request(Method.GET,"/Delhi");
//		
//		//Extract body from response
//		String responsebody=response.getBody().asString(); // captured the response body from jon to string format
//		System.out.println(responsebody);
//		
//		int statusCode=response.getStatusCode(); //CAPTURE STATUS CODE
//		String statusLine=response.getStatusLine();  // CAPTURE STATUS LINE
//		
//		//validatation
//		
//		Assert.assertEquals(statusCode, 200);
//		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
//		
//	}
//	
	
	

		
	
		@Test
		
		public void GetResponse() {
			
		
		RestAssured.baseURI ="https://reqres.in/";
		
		RequestSpecification httprequest = RestAssured.given(); //prerquest --http method ---Get 
		
		
		Response request = httprequest.request(Method.GET,"/api/users?page2");
		
		int statusCode = request.statusCode();
		
		
		System.out.println("RESULT SHOULD BE 200 ======"+ " " + statusCode);
		
		
		Assert.assertEquals(statusCode, 200);
		
		
		ResponseBody body = request.getBody();
		
		String asString = body.asString();
		
		System.out.println(asString);
		
		String statusLine=request.getStatusLine();
		
		System.out.println(statusLine);
		
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		}
	
		

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
