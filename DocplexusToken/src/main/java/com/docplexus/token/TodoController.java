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

import com.docplexus.token.manager.ToDoManager;
import com.docplexus.token.model.Response;
import com.docplexus.token.model.ToDo;

@Controller
public class TodoController {

	@Autowired 
	ToDoManager manager;
	
	
	
	
    @RequestMapping(value="/getAllRecords", method = RequestMethod.GET)
    @ResponseBody
    public Response<List<ToDo>>  getAll(HttpServletRequest request, HttpServletResponse httpServletResponse){
        Response<List<ToDo>> response=new Response<>();
    	response.setStatusCode(HttpStatus.OK.toString());
    	response.setData(manager.getAllRecords());
    	httpServletResponse.setStatus(HttpStatus.OK.value());
    	return response;
    }
    

    @RequestMapping(value="/saveOrUpdate", method = RequestMethod.POST)
    @ResponseBody
    public Response<List<ToDo>> update(@RequestBody
    		ToDo object,HttpServletRequest request, HttpServletResponse httpServletResponse){

    		manager.saveOrUpdate(object);
    		 Response<List<ToDo>> response=new Response<>();
    	    	response.setStatusCode(HttpStatus.OK.toString());
    	    	response.setData(manager.getAllRecords());
    	    	httpServletResponse.setStatus(HttpStatus.OK.value());
    	    return response;
    }
    
    @RequestMapping(value="/delete", method = RequestMethod.POST)
    @ResponseBody
    public  Response<List<ToDo>> delete(@RequestBody
    		ToDo object,HttpServletRequest request, HttpServletResponse httpServletResponse){
    	manager.delete(object);
    	
    	 Response<List<ToDo>> response=new Response<>();
	    	response.setStatusCode(HttpStatus.OK.toString());
	    	response.setData(manager.getAllRecords());
	    	httpServletResponse.setStatus(HttpStatus.OK.value());
	    return response;
    }
    
    
}
