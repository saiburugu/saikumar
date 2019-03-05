package com.spring;

public class Customer {
	
	private String customerid;
	private String customername;
	private String customerContact;
	private Address customerAddress;
	
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + "]";
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
public void display() 
{
	System.out.println("customerid"+"customerid");
	System.out.println("customername"+"customername");
	System.out.println("customercontact"+"customercontact");
	System.out.println("customeraddress"+"customeraddress");
	
}
}
