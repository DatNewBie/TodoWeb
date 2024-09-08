
package com.springmvc.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.dto.TodoDTO;

@RestController(value = "TodoAPI")
public class TodoAPI {

	@PostMapping("/api/todo")
	public TodoDTO createTodo(@RequestBody TodoDTO todoDTO) {
		return todoDTO;
	}

	@PutMapping("/api/todo")
	public TodoDTO updateTodo(@RequestBody TodoDTO todoDTO) {
		return todoDTO;
	}

	@DeleteMapping("/api/todo")
	public void deleteTodo(@RequestBody long[] ids) {
	}
}
