package ru.sariev.todolistapp.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.sariev.todolistapp.models.Task;
import ru.sariev.todolistapp.repository.TasksRepository;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class TasksServiceTest {

    private TasksService tasksService;
    private TasksRepository tasksRepository;

    @BeforeEach
    void initTaskRepository() {
        tasksRepository = Mockito.mock(TasksRepository.class);
        tasksService = new TasksService(tasksRepository);
    }

    @Test
    void findAllTest() {
        List<Task> testTaskList = List.of(new Task("Java", new Date(2022, 12, 31), true));
        when(tasksService.findAll()).thenReturn(testTaskList);
        assertEquals(testTaskList, tasksService.findAll());
    }

    @Test
    void findOneTest() {
        Task expectedTask = new Task("Java", new Date(2022, 12, 31), true);
        int id = 1;
        expectedTask.setId(id);

        Task actualTask = new Task();
                tasksRepository.findById(id).get();
        when(actualTask).thenReturn(expectedTask);
        assertEquals(expectedTask, actualTask);
    }

    @Test
    void saveTest() {
        Task task = new Task("Java", new Date(2022, 12, 31), true);

    }

    @Test
    void updateTest() {
    }

    @Test
    void deleteTest() {
    }
}