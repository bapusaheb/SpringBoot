package com.docplexus.token.interfaces;

import java.util.List;

import com.docplexus.token.model.Token;

public interface BankerInterface {
public List<Integer> tokenQueueForCounter(int counterNum);
public List<Integer> tokenServed(Token token);
}
