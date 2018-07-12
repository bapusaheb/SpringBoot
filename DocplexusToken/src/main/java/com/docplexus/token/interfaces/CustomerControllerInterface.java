package com.docplexus.token.interfaces;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.docplexus.token.model.Branch;
import com.docplexus.token.model.Customer;
import com.docplexus.token.model.Response;
import com.docplexus.token.model.Token;

public interface CustomerControllerInterface {
	public Response<Token> generateToken(Customer object,HttpServletRequest request, HttpServletResponse httpServletResponse);
	public Response<Token> generateTokenForCustomer(Customer customer, Branch branch,HttpServletRequest request, HttpServletResponse httpServletResponse);
}
