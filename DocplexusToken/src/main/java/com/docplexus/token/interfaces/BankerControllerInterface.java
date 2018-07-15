package com.docplexus.token.interfaces;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.docplexus.token.manager.ArrayQueue;
import com.docplexus.token.model.Response;
import com.docplexus.token.model.Token;

public interface BankerControllerInterface{
public Response<List<Integer>> getCounterList(HttpServletRequest request, HttpServletResponse httpServletResponse);
public  Response<ArrayQueue> getTokenQueue(Token t,HttpServletRequest request, HttpServletResponse httpServletResponse) ;
public Response<ArrayQueue> tokenServiced(Token token,HttpServletRequest request, HttpServletResponse httpServletResponse) ;

}
