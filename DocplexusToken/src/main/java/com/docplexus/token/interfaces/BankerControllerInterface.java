package com.docplexus.token.interfaces;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.docplexus.token.model.Response;
import com.docplexus.token.model.Token;

public interface BankerControllerInterface{
public Response<List<Token>> getCounterList(HttpServletRequest request, HttpServletResponse httpServletResponse);
public  Response<List<Integer>> getTokenQueue(HttpServletRequest request, HttpServletResponse httpServletResponse) ;
public Response<List<Integer>> tokenServiced(HttpServletRequest request, HttpServletResponse httpServletResponse) ;

}
