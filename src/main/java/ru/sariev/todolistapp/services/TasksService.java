package ru.sariev.todolistapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sariev.todolistapp.models.Task;
import ru.sariev.todolistapp.repository.TasksRepository;

import java.util.List;

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
}
