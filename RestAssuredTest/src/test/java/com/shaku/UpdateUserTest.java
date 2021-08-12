package com.shaku;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.shaku.helper.PersonHelperService;
import com.shaku.model.person;

import io.restassured.response.Response;

public class UpdateUserTest {
	
	PersonHelperService helper;

	@BeforeTest
	public void init() {
		helper = new PersonHelperService();
	}

	@Test
	public void testUpdateUser() {
		Response response = helper.updateUser();
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
}
	
	@Test
	public void testUpdateUser_200() {
		Response response = helper.updateUser();
		person persons = response.getBody().as(person.class);
		
		Assert.assertEquals(persons.getName(),"Name3");
		Assert.assertEquals(persons.getDescription(),"Description");
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
}
	
}


