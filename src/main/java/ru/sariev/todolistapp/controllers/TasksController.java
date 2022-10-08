package ru.sariev.todolistapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sariev.todolistapp.services.TasksService;

@Controller
@RequestMapping("/tasks")
public class TasksController {

    private final TasksService tasksService;

    @Autowired
    public TasksController(TasksService tasksService) {
        this.tasksService = tasksService;
    }

    @GetMapping()
    public String getAllTasks(Model model) {
        model.addAttribute("tasks", tasksService.findAll());
        return "tasks/index";
    }
}
