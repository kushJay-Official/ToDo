package com.to_doapp.ToDoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerToDo {

    @Autowired
    private ToDoRepository toDoRepository;

    @PostMapping("/Worked Saved!...")
    public String addToDo(@RequestParam String p, @RequestParam String up) {
        ToDo t1 = new ToDo();
        t1.setPwd(p);
        t1.setUpd(up);
        toDoRepository.save(t1);
        return "Your To Do work is saved successfully....!\n\n"+t1.getDet()+"\nPlease note down details";
    }

    @GetMapping("/Alltodo")
    public Iterable<ToDo> allToDo() {
        return toDoRepository.findAll();
    }

    @PostMapping("/search")
    public <ToDo> Object srchToDo(@RequestParam Integer i) {
        System.out.println("Your Request has processed.....");
        return toDoRepository.findToDoById(i);

    }
    
}