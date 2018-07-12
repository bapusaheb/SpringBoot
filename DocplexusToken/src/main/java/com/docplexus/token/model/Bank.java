package com.docplexus.token.model;

import java.util.List;

public class Bank {
	
private String name;
List<Banker> bankers;
List<Branch> branches;
List<Customer> customers;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Banker> getBankers() {
	return bankers;
}
public void setBankers(List<Banker> bankers) {
	this.bankers = bankers;
}
public List<Branch> getBranches() {
	return branches;
}
public void setBranches(List<Branch> branches) {
	this.branches = branches;
}
public List<Customer> getCustomers() {
	return customers;
}
public void setCustomers(List<Customer> customers) {
	this.customers = customers;
}


}
