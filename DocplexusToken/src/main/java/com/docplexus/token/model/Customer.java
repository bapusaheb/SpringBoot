package com.docplexus.token.model;

public class Customer {
private int id;
private String name;
private boolean previladged;
private Bank bank;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isPreviladged() {
	return previladged;
}
public void setPreviladged(boolean previladged) {
	this.previladged = previladged;
}
public Bank getBank() {
	return bank;
}
public void setBank(Bank bank) {
	this.bank = bank;
}


}
