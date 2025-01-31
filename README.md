# To Do List

## API for task managment (CRUD) que faz parte desse desafio de desenvolvimento Back-end. 

## Tecnologies
 - Spring Boot
 - Spring MVC
 - Spring data JPA
 - SpringDoc OpenAPI 3 (Swagger)
 - MySQL 

## Practices 
 - SOLID, DRY 
 - API REST
 - Consults Spring Data JPA
 - Dependencies injection
 - Messsage Error treatment
 - Auto generated Swagger with OpenAPI 3
  
## How to Execute 
 - Clone repository
 - Build project 
<code>./mvnw clean package </code>
 - Execute application
<code> java -jar tarfet/todolist-0.0.1-SNAPSHOTE.jar</code>

## API can be access in localhost:8080. Swagger can be visualized in localhost:8080/swagger-ui.html

# API Endpoint
## for HTTP request bellow, use httpie tool: 
- Create Task
<code>http POST:8080/todos nome="Task 1" description="task number 1" prioridade=1</code>
- Task List
<code>http GET:8080/todos</code>