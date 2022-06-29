package Batch23;


import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC2_POST_Request {

	@Test
	public void PostRequest() throws InterruptedException
	{
		RestAssured.baseURI ="https://reqres.in/";
		
		RequestSpecification request=RestAssured.given();
		
		//Specifying request Payload in JSON format
		JSONObject requestParams=new JSONObject();
		
		requestParams.put("name","morpheus");
		requestParams.put("job","leader");
	
		
		
		request.header("Content-Type","application/json");	
		
		
		
		Response response=request.request(Method.POST,"/api/users");
		
		//Response response=request.post("/register");
		System.out.println(response);
		
		Thread.sleep(3000);
		
		//Validate the Response status code
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode,201); 
		
		
		String asString = response.body().asString();
		
		
		System.out.println(asString);
		
	}
	
}
