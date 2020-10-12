package com.to_doapp.ToDoApp;

import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Integer> {
    ToDo findToDoById(Integer id);
}
