package br.com.javajh.todolist_challenge.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.javajh.todolist_challenge.entity.Todo;
import br.com.javajh.todolist_challenge.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;
    
    TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping("/todos")
    List<Todo> create(@RequestBody Todo todo) { 
        return todoService.create(todo);
    }
    @GetMapping
    List<Todo> list(){ 
        return todoService.list();
    }
    @PutMapping("/todos")
    List<Todo> update(@RequestBody Todo todo){ 
        return todoService.update(todo);
    }
    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id){ 
        return todoService.delete(id);
    }
}  
