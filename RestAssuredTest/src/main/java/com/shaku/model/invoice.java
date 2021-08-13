package com.shaku.model;


	
	
	

	


	
	
	
	public class invoice {
		

	
	
	

	
	private Integer id;
	
	private Integer customerId;
	
	private String invoiceNumber;
	
	private String vendorName;
	
	private Double amount;
	
	private String invoiceDescription;
	
	
	
	public Integer getId() {
	return id;
	}

	
	public void setId(Integer id) {
	this.id = id;
	}

	
	public Integer getCustomerId() {
	return customerId;
	}

	
	public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
	}

	
	public String getInvoiceNumber() {
	return invoiceNumber;
	}

	
	public void setInvoiceNumber(String invoiceNumber) {
	this.invoiceNumber = invoiceNumber;
	}

	
	public String getVendorName() {
	return vendorName;
	}

	
	public void setVendorName(String vendorName) {
	this.vendorName = vendorName;
	}

	
	public Double getAmount() {
	return amount;
	}

	
	public void setAmount(Double amount) {
	this.amount = amount;
	}

	
	public String getInvoiceDescription() {
	return invoiceDescription;
	}

	
	public void setInvoiceDescription(String invoiceDescription) {
	this.invoiceDescription = invoiceDescription;
	}

	

	}

