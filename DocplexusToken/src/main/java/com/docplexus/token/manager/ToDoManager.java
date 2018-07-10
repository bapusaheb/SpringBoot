package com.docplexus.token.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.docplexus.token.converter.TodoListConverter;
import com.docplexus.token.dao.ToDoListHome;
import com.docplexus.token.model.ToDo;
import com.docplexus.token.orm.ToDoList;

@Component
public class ToDoManager {

	
	@Autowired
	ToDoListHome home;
	
	public List<ToDo> getAllRecords() {
		// TODO Auto-generated method stub
		List<ToDoList> toDo=home.getall();
		
		List<ToDo> dos=new ArrayList<>();
		for (ToDoList toDoList : toDo) {
			dos.add(TodoListConverter.entityToModel(toDoList));
		}
		return dos;
	}

	public void saveOrUpdate(ToDo object) {
		// TODO Auto-generated method stub
		home.saveOrUpdate(TodoListConverter.modelToentity(object));
	}
	
	

	public void delete(ToDo object) {
		// TODO Auto-generated method stub
		home.remove(TodoListConverter.modelToentity(object));
	}

	
}
