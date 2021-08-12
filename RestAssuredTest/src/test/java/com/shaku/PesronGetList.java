package com.shaku;

import com.shaku.model.person;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.shaku.helper.PersonHelperService;

import io.restassured.response.Response;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PesronGetList {

	PersonHelperService helper;

	@BeforeTest
	public void init() {
		helper = new PersonHelperService();
	}

	@Test
	public void testGetUser() {
		Response response = helper.GetUser();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	@Test
	public void testGetUser_200() {
		Response response = helper.GetUser();
		List<person> persons = Arrays.asList(response.getBody().as(person[].class));
		Assert.assertEquals(response.getStatusCode(), 200);
		//Assert.assertEquals(persons.size(),6);
		Assert.assertEquals(persons.get(0).getName(),"Shaku");
		Assert.assertEquals(persons.get(0).getDescription()
				,"Automation Engineer");
	}
}

