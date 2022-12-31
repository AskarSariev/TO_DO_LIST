package ru.sariev.todolistapp.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    private Task task;

    @BeforeEach
    void initTask() {
        this.task = new Task();
    }

    @Test
    void getTaskNameTest() {
        task.setTaskName("JUnit5");
        String expectedTaskName = "JUnit5";
        String actualTaskName = task.getTaskName();
        assertEquals(expectedTaskName, actualTaskName);
    }

    @Test
    void setTaskNameTest() {
        task.setTaskName("Java");
        String expectedTaskName = "Java";
        String actualTaskName = task.getTaskName();
        assertEquals(expectedTaskName, actualTaskName);
    }

    @Test
    void getTargetDate() {
    }

    @Test
    void setTargetDate() {
    }

    @Test
    void isStatus() {
    }

    @Test
    void setStatus() {
    }

    @Test
    void testToString() {
    }
}