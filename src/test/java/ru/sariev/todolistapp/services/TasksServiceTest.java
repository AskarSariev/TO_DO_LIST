package ru.sariev.todolistapp.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import ru.sariev.todolistapp.models.Task;
import ru.sariev.todolistapp.repository.TasksRepository;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

class TasksServiceTest {

    private TasksService tasksService;

    @BeforeEach
    void initMock() {
        tasksService = Mockito.mock(TasksService.class);
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

        doReturn(expectedTask).when(tasksService).findOne(id);
        assertEquals(expectedTask, tasksService.findOne(id));
    }

    @Test
    void saveTest() {
        Task task = new Task("Java", new Date(2022, 12, 31), true);
        int id = 1;
        task.setId(id);

        Task expectedTask = task;
    }

    @Test
    void updateTest() {
    }

    @Test
    void deleteTest() {
    }
}