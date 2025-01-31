package br.com.javajh.todolist_challenge.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    //automatically generated Id in database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    @NotBlank
    private String name;
    @NotBlank 
    private String decription;
    private Boolean realizado;
    private int priority;

    
    public Todo(String name, String decription, Boolean realizado, int priority) {
        this.name = name;
        this.decription = decription;
        this.realizado = realizado;
        this.priority = priority;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDecription() {
        return decription;
    }
    public void setDecription(String decription) {
        this.decription = decription;
    }
    public Boolean getRealizado() {
        return realizado;
    }
    public void setRealizado(Boolean realizado) {
        this.realizado = realizado;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }

    
}
