package com.docplexus.token.manager;

import java.util.List;

import org.springframework.stereotype.Component;

import com.docplexus.token.model.Token;

@Component
public class TokenManager {

	public static List<Integer> tokens;
	public static List<Token> customers;
	
	
	public List<Integer> getAllTokens() {
		return tokens;
	}

	public void addToken(Token object) {
	
	
	}

	public void delete(Token object) {
		// TODO Auto-generated method stub
		
	}

}
