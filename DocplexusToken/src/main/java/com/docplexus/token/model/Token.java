package com.docplexus.token.model;

public class Token {
private int tokenNo;
private int counterNo;
private boolean served;
private int priority;
public int getTokenNo() {
	return tokenNo;
}
public void setTokenNo(int tokenNo) {
	this.tokenNo = tokenNo;
}
public int getCounterNo() {
	return counterNo;
}
public void setCounterNo(int counterNo) {
	this.counterNo = counterNo;
}
public boolean isServed() {
	return served;
}
public void setServed(boolean served) {
	this.served = served;
}
public int getPriority() {
	return priority;
}
public void setPriority(int priority) {
	this.priority = priority;
}


}
