/**
 * @author pradekum
 *
 * 
 */
package com.dev.pradeep.WebAppLogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dev.pradeep.WebAppLogin.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	@Autowired
	private TodoService service;

	@RequestMapping("/list-todos")
	public String showTodos(ModelMap model) {
		String name = (String) model.get("name");
		model.put("todos", service.retrieveTodos(name));
		return "list-todos";
	}

}
