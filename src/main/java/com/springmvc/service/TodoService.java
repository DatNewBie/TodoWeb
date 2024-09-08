package com.springmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.model.Todo;
import com.springmvc.repository.TodoRepository;

@Service
@Transactional
public class TodoService {

	private static int todosCount = 0;

	@Autowired
	private TodoRepository todoRepository;

	/*
	 * static { todos.add(new Todo(++todosCount, "ThanhDat", "Learn AWS",
	 * LocalDate.now().plusYears(1), false)); todos.add(new Todo(++todosCount,
	 * "in28minutes", "Learn DevOps", LocalDate.now().plusYears(2), false));
	 * todos.add(new Todo(++todosCount, "in28minutes",
	 * "Learn Full Stack Development", LocalDate.now().plusYears(3), false)); }
	 */

	public List<Todo> findByUsername(String username) {
		List<Todo> result = new ArrayList<>();

		/*
		 * for (int i = 0; i < todos.size(); i++) { if
		 * (todos.get(i).getUsername().equalsIgnoreCase(username)) {
		 * result.add(todos.get(i)); } }
		 */

		result = todoRepository.findByUsername(username);
		return result;
	}

	public void addTodo(String username, String description, java.sql.Date targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, done);
		/* todos.add(todo); */
		todoRepository.save(todo);
	}

	public void deleteById(int id) {
		/*
		 * for (int i = 0; i < todos.size(); i++) { if (todos.get(i).getId() == id) {
		 * todos.remove(i); break; } }
		 */
		todoRepository.deleteById(id);
	}

	public void updateTodo(Todo todo) {
		deleteById(todo.getId());
		/* todos.add(todo); */
		todoRepository.save(todo);
	}

	public Todo findById(int id) {
		/*
		 * for (int i = 0; i < todos.size(); i++) { if (todos.get(i).getId() == id) {
		 * return todos.get(i); } } return null;
		 */
		return todoRepository.findById(id);
	}

}
