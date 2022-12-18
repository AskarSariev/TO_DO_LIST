package ru.sariev.todolistapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.sariev.todolistapp.models.Task;
import ru.sariev.todolistapp.services.TasksService;

import javax.validation.Valid;

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

    @GetMapping("/new")
    public String newTask(@ModelAttribute("task") Task task) {
        return "tasks/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("task") Task task) {
        tasksService.save(task);
        return "redirect:/tasks";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("task", tasksService.findOne(id));
        return "tasks/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("task") Task task, @PathVariable("id") int id) {
        tasksService.update(id, task);
        return "redirect:/tasks";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        tasksService.delete(id);
        return "redirect:/tasks";
    }

}
