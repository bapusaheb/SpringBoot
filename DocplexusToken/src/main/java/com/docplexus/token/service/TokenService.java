package com.docplexus.token.service;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.docplexus.token.manager.ArrayQueue;
import com.docplexus.token.model.Branch;
import com.docplexus.token.model.Customer;
import com.docplexus.token.model.Token;
@Component
public class TokenService {

	public static List<ArrayQueue> list = new ArrayList<>();
	static int tokenNo = 1;
	static int lastInserted = 0;
	static boolean flag = false;

	@Autowired
	com.docplexus.token.orm.BranchHome branchHome;
	
	public Token generateToken(Customer object, HttpServletRequest request, HttpServletResponse httpServletResponse) {
		if(list.size() <= 0)
			createCounterQueue(new Branch());
	
		
		if (lastInserted >= (list.size()))
			lastInserted = 0;

		list.get(lastInserted).getList().add(tokenNo);
		flag = true;
		lastInserted++;
		Token token = new Token();
		token.setCounterNo(lastInserted);
		token.setTokenNo(tokenNo);
		tokenNo++;
		
		
		return token;
	}

	public Token generateTokenForCustomer(Customer customer, Branch branch) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Integer> getCounterList(HttpServletRequest request, HttpServletResponse httpServletResponse) {
		//List<Integer> obj=list.get(0);
		return list.stream().map(obj-> obj.getCounterNo()).collect(Collectors.toList());
	}

	public ArrayQueue getTokenQueue(int counterNo) {
		return list.get(counterNo-1);
	}

	public ArrayQueue tokenServiced(Token token) {
		list.get(token.getCounterNo()-1).getList().remove(list.get(token.getCounterNo()-1).getList().indexOf(token.getTokenNo()));
		return list.get(token.getCounterNo()-1);
	}

	public int createCounterQueue(Branch b) {
		List<com.docplexus.token.orm.Branch> counterNum=(List<com.docplexus.token.orm.Branch>) branchHome.findAll();
	
		for (int i = 0; i < counterNum.get(0).getCounters(); i++) {
			ArrayQueue queue = new ArrayQueue();
			queue.setCounterNo(i + 1);
			List<Integer> tokens=new ArrayList<>();
			queue.setList(tokens);
			list.add(queue);
		}
		return 0;
	}

	public boolean tokenQueueForCounter(int counterNum) {

		
		return true;
	}

	public List<Integer> tokenServed(Token token) {
		// TODO Auto-generated method stub
		return null;
	}
}
