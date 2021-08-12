package com.shaku.helper;

import com.shaku.contant.Endpoints;
import com.shaku.model.person;
import com.shaku.utils.propertiesConfiguration;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Properties;

public class PersonHelperService {
	
	public Response GetUser() {
		Properties prop =  propertiesConfiguration.loadFile();
		RestAssured.baseURI = (String)prop.get("HOST");
		RequestSpecification request = RestAssured.given();
		Response response = request.get(Endpoints.getPeople);
		return response;
	}
	
	public Response AddUser() {
		Properties prop =  propertiesConfiguration.loadFile();
		RestAssured.baseURI = (String)prop.get("HOST");
		person   requestBody =  new person("Name3","Description");
		Response response  = RestAssured.given()
				                           .header("Content-type", "application/json")
				                             .and()
				                              .body(requestBody)
				                              .when()
				                                 .post(Endpoints.ADD_PERSON_POST )
				                               .then()
				                      .extract().response();
		;
		
		return response;
		
	}
		
		public Response  updateUser() {
			person   requestBody =  new person("Name3","Description");
			Properties prop =  propertiesConfiguration.loadFile();
			RestAssured.baseURI = (String)prop.get("HOST");
			Response response =  RestAssured.given()
					.header("Content-type", "application/json")
					.and()
					.body(requestBody)
					.when()
					.patch(Endpoints.PATCH_USER_API,"12")
					.then()
					.extract().response();
			return response;
		}
	}
	
	


