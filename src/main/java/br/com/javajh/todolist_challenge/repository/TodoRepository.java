package br.com.javajh.todolist_challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.javajh.todolist_challenge.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
