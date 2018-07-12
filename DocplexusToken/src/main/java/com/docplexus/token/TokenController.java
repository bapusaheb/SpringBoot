package com.docplexus.token;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.docplexus.token.interfaces.BankerControllerInterface;
import com.docplexus.token.interfaces.CustomerControllerInterface;
import com.docplexus.token.manager.TokenManager;
import com.docplexus.token.model.Branch;
import com.docplexus.token.model.Customer;
import com.docplexus.token.model.Response;
import com.docplexus.token.model.Token;
import com.docplexus.token.service.TokenService;


@Controller
public class TokenController implements BankerControllerInterface,CustomerControllerInterface{

	@Autowired 
	TokenService service;
	
	
    @Override
    @RequestMapping(value="/getCounterList", method = RequestMethod.GET)
    @ResponseBody
    public Response<List<Token>> getCounterList(HttpServletRequest request, HttpServletResponse httpServletResponse){
        Response<List<Token>> response=new Response<>();
    	response.setStatusCode(HttpStatus.OK.toString());
    	response.setData(service.getCounterList(request,httpServletResponse));
    	httpServletResponse.setStatus(HttpStatus.OK.value());
    	return response;
    }
    

    @RequestMapping(value="/generateToken", method = RequestMethod.POST)
    @ResponseBody
    public Response<Token> generateToken(@RequestBody
    		Customer object,HttpServletRequest request, HttpServletResponse httpServletResponse){
    		 Response<Token> response=new Response<>();
    	    	response.setStatusCode(HttpStatus.OK.toString());
    	    	response.setData(service.generateToken(object, request, httpServletResponse));
    	    	httpServletResponse.setStatus(HttpStatus.OK.value());
    	    return response;
    }
    
   /* @RequestMapping(value="/tokenServiced", method = RequestMethod.POST)
    @ResponseBody
    public  Response<List<Integer>> tokenServiced(@RequestBody
    		Token object,HttpServletRequest request, HttpServletResponse httpServletResponse){
    		
    	 Response<List<Integer>> response=new Response<>();
	    	response.setStatusCode(HttpStatus.OK.toString());
	    	response.setData(service.tokenServed(object));
	    	httpServletResponse.setStatus(HttpStatus.OK.value());
	    return response;
    }*/


    @Override
    @RequestMapping(value="/generateTokenForCustomer", method = RequestMethod.POST)
	public Response<Token> generateTokenForCustomer(
			@RequestBody Customer customer, Branch branch,HttpServletRequest request, HttpServletResponse httpServletResponse) {
    
    	Response<Token> response=new Response<>();
	    	response.setStatusCode(HttpStatus.OK.toString());
	    	response.setData(service.generateTokenForCustomer(customer, branch));
	    	httpServletResponse.setStatus(HttpStatus.OK.value());
	    return response;
	}


    @Override
    @RequestMapping(value="/getTokenQueue", method = RequestMethod.GET)
	public Response<List<Integer>> getTokenQueue(
			HttpServletRequest request, HttpServletResponse httpServletResponse) {
    	 Response<List<Integer>> response=new Response<>();
	    	response.setStatusCode(HttpStatus.OK.toString());
	    	response.setData(service.getTokenQueue());
	    	httpServletResponse.setStatus(HttpStatus.OK.value());
	    return response;
	}


    @Override
    @RequestMapping(value="/tokenServiced", method = RequestMethod.GET)
	public Response<List<Integer>> tokenServiced(HttpServletRequest request, HttpServletResponse httpServletResponse) {
    	 Response<List<Integer>> response=new Response<>();
	    	response.setStatusCode(HttpStatus.OK.toString());
	    	response.setData(service.tokenServiced());
	    	httpServletResponse.setStatus(HttpStatus.OK.value());
	    return response;
	}


    
}
