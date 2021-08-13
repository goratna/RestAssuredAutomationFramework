


	
	package com.shaku;

	import com.shaku.model.invoice;
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

	public class GetInvoiceTest {

		PersonHelperService helper;

		@BeforeTest
		public void init() {
			helper = new PersonHelperService();
		}

		@Test
		public void testGetInvoice() {
			Response response = helper.GetInvoice();
			Assert.assertEquals(response.getStatusCode(), 200);
		}

		@Test
		public void testGetInvoicer_200() {
			Response response = helper.GetInvoice();
			
			invoice invoices = response.getBody().as(invoice.class);
			
			Assert.assertEquals(invoices.getInvoiceDescription(),  "Paper Products");
			Assert.assertEquals(invoices.getVendorName(),"Staples");
		}
	


}

