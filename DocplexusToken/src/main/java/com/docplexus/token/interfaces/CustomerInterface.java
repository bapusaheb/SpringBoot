package com.docplexus.token.interfaces;

import com.docplexus.token.model.Branch;
import com.docplexus.token.model.Customer;
import com.docplexus.token.model.Token;

public interface CustomerInterface {
	public int createCounterQueue(Branch b) ;
	///public Token generateTokenForCustomer(Customer customer, Branch branch);
}
