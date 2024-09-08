/*
 * package com.springmvc.controller.todo;
 * 
 * import java.time.LocalDate; import java.util.List;
 * 
 * import javax.validation.Valid;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.ModelMap; import
 * org.springframework.validation.BindingResult; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RequestParam;
 * 
 * //@Controller public class TodoControllerJpa {
 * 
 * @Autowired private TodoRepository todoRepository;
 * 
 * @RequestMapping(value = "list-todos", method = RequestMethod.GET) public
 * String todoPage(ModelMap model) {
 * 
 * List<Todo> todos = todoRepository.findByusername("ThanhDat");
 * model.addAttribute("todos", todos); return "listTodos"; }
 * 
 * @RequestMapping(value = "add-todo", method = RequestMethod.GET) public String
 * showNewTodoPage(ModelMap model) { String username = "ThanhDat"; Todo todo =
 * new Todo(0, username, "", LocalDate.now(), false); model.put("todo", todo);
 * return "todo"; }
 * 
 * @RequestMapping(value = "add-todo", method = RequestMethod.POST) public
 * String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
 * 
 * if (result.hasErrors()) { return "todo"; }
 * 
 * String username = "ThanhDat";
 * 
 * todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(),
 * false);
 * 
 * todoRepository.save(todo); return "redirect:list-todos"; }
 * 
 * @RequestMapping(value = "delete-todo") public String deleteTodo(@RequestParam
 * int id) { todoService.deleteById(id); todoRepository.deleteById(id); return
 * "redirect:list-todos"; }
 * 
 * @RequestMapping(value = "update-todo", method = RequestMethod.GET) public
 * String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
 * model.put("todo", todoService.findById(id)); model.put("todo",
 * todoRepository.findById(id)); return "todo"; }
 * 
 * @RequestMapping(value = "update-todo", method = RequestMethod.POST) public
 * String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
 * if (result.hasErrors()) { return "todo"; } todoService.updateTodo(todo);
 * todoRepository.save(todo); return "redirect:list-todos"; } }
 */