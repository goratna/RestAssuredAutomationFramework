package com.shaku;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.shaku.helper.PersonHelperService;
import com.shaku.model.person;

import io.restassured.response.Response;

public class AddPersonTest {
	
	
	PersonHelperService helper;

	@BeforeTest
	public void init() {
		helper = new PersonHelperService();
	}

	@Test
	public void testAddUser() {
		Response response = helper.AddUser();
		Assert.assertEquals(response.getStatusCode(), 201);
		
		
}
	
	@Test
	public void testAddUser_200() {
		Response response = helper.AddUser();
		person persons = response.getBody().as(person.class);
		
		Assert.assertEquals(persons.getName(),"Name3");
		Assert.assertEquals(persons.getDescription(),"Description");
		
		Assert.assertEquals(response.getStatusCode(), 201);
		
		
}
	
}