package com.docplexus.token.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.docplexus.token.manager.ArrayQueue;
import com.docplexus.token.model.Branch;
import com.docplexus.token.model.Customer;
import com.docplexus.token.model.Token;

public class TokenService{

	public static List<ArrayQueue> list;;
	
	public Token generateToken(Customer object, HttpServletRequest request,
			HttpServletResponse httpServletResponse) {
	
		
		for (int i=0; i< list.size();i++) {
			int s1=list.get(i).getList().size();
			int s2=list.get(i+1).getList().size();
			
			if((s1 != 0 && s2!=0) && s1 > s2) {
				//add element in s2
				Token token=new  Token();
				token.setTokenNo(list.get(i).getList().get((list.get(i).getList().size())).getTokenNo()+1);
				token.setCounterNo(s2);
				list.get(i+1).getList().add(token);
				
			}else {
				
			}
			
		}
		
		
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

	
	public boolean tokenQueueForCounter(int counterNum) {
		
		for(int i=0;i<counterNum;i++) {
			ArrayQueue queue=new ArrayQueue();
			queue.setCounterNo(i+1);
			list.add(queue);
		}
	return true;
	}

	
	public List<Integer> tokenServed(Token token) {
		// TODO Auto-generated method stub
		return null;
	}}
