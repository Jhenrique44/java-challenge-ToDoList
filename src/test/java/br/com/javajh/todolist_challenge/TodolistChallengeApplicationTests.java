package br.com.javajh.todolist_challenge;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import br.com.javajh.todolist_challenge.entity.Todo;

@SpringBootTest
class TodolistChallengeApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateTodoSucess(){ 
		var todo = new Todo("todo 1", "desc todo 1", false, 1);

		webTestClient
			.post()
			.uri("/todos")
			.bodyValue(todo)
			.exchange()
			.expectStatus().isOk()
			.expectBody()
			.jsonPath("$").isArray()
			.jsonPath("$.lenght()").isEqualTo(1)
			.jsonPath("$[0].nome").isEqualTo(todo.getName())
			.jsonPath("$[0].description").isEqualTo(todo.getDecription())
			.jsonPath("$[0].realizado").isEqualTo(todo.getRealizado())
			.jsonPath("$[0].priority").isEqualTo(todo.getPriority());
			
	}

	@Test
	void testCreateTodoFailed() {

	}

	@Test
	void contextLoads() {
	}

}
