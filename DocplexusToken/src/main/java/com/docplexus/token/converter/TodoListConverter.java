package com.docplexus.token.converter;

import com.docplexus.token.model.ToDo;
import com.docplexus.token.orm.ToDoList;

public class TodoListConverter {

	
	public static ToDo entityToModel(ToDoList entity) {
		ToDo model=new ToDo();
		
		model.setId(entity.getId());
		model.setName(entity.getName());
		model.setDescription(entity.getDescription());
		model.setStatus(entity.getStatus());
		
		return model;
	}
	
	public static ToDoList modelToentity(ToDo model) {
		ToDoList entity=new ToDoList();
		
		entity.setId(model.getId());
		entity.setName(model.getName());
		entity.setDescription(model.getDescription());
		entity.setStatus(model.getStatus());
		
		return entity;
	}
}
