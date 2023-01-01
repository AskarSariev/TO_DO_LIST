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

    private TasksRepository tasksRepository;

    @BeforeEach
    void initTaskRepository() {
        tasksRepository = Mockito.mock(TasksRepository.class);
    }

    @Test
    void findAllTest() {
        List<Task> testTaskList = List.of(new Task("Java", new Date(2022, 12, 31), true));
        when(tasksRepository.findAll()).thenReturn(testTaskList);
        assertEquals(testTaskList, tasksRepository.findAll());
    }

    @Test
    void saveTest() {
    }

    @Test
    void findOneTest() {
    }

    @Test
    void updateTest() {
    }

    @Test
    void deleteTest() {
    }
}