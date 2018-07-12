package com.docplexus.token.manager;

import java.util.List;

import com.docplexus.token.model.Token;

public class ArrayQueue {

	private int counterNo;
	private List<Token>list ;
	
	public int getCounterNo() {
		return counterNo;
	}
	public void setCounterNo(int counterNo) {
		this.counterNo = counterNo;
	}
	public List<Token> getList() {
		return list;
	}
	public void setList(List<Token> list) {
		this.list = list;
	}
	
	
	
}
