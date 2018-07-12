package com.docplexus.token.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.docplexus.token.model.Branch;
import com.docplexus.token.model.Customer;
import com.docplexus.token.model.Response;
import com.docplexus.token.model.Token;

public class TokenService{

	public Token generateToken(Customer object, HttpServletRequest request,
			HttpServletResponse httpServletResponse) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Token generateTokenForCustomer(Customer customer, Branch branch) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Token> getCounterList(HttpServletRequest request, HttpServletResponse httpServletResponse) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Integer> getTokenQueue() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Integer> tokenServiced() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int createCounterQueue(Branch b) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public List<Integer> tokenQueueForCounter(int counterNum) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Integer> tokenServed(Token token) {
		// TODO Auto-generated method stub
		return null;
	}}
