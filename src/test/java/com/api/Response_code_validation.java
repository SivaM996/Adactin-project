package com.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Response_code_validation {

	@Test
	private void data_validation() {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.get("/api/users?page=2");
		String response_body = response.asString();
		System.out.println(response_body);
		int statusCode = response.getStatusCode();
		System.out.println("Status code "+ statusCode);
		Assert.assertEquals(statusCode, 200);
		System.out.println("Data validation successfully");
		ResponseBody body = response.body();
		System.out.println(body);
		String sessionId = response.getSessionId();
		System.out.println(sessionId);
		String contentType = response.getContentType();
		System.out.println(contentType);
		Headers headers = response.getHeaders();
		System.out.println(headers);
		long time = response.getTime();
		System.out.println(time);
	}
	
}
