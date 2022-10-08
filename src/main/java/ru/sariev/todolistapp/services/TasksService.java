package ru.sariev.todolistapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sariev.todolistapp.models.Task;
import ru.sariev.todolistapp.repository.TasksRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class TasksService {

    private final TasksRepository tasksRepository;

    @Autowired
    public TasksService(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    public List<Task> findAll() {
        return tasksRepository.findAll();
    }

    @Transactional
    public void save(Task task) {
        tasksRepository.save(task);
    }

    public Task findOne(int id) {
        Optional<Task> foundTask = tasksRepository.findById(id);
        return foundTask.orElse(null);
    }

    @Transactional
    public void update(int id, Task updatedTask) {
        updatedTask.setId(id);
        tasksRepository.save(updatedTask);
    }

    @Transactional
    public void delete(int id) {
        tasksRepository.deleteById(id);
    }
}
