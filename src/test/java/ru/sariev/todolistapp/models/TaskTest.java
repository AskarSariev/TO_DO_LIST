package ru.sariev.todolistapp.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

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
    void getTargetDateTest() {
        task.setTargetDate(new Date(2023, 01, 01));
        Date expectedDate = new Date(2023, 01, 01);
        Date actualDate = task.getTargetDate();
        assertEquals(expectedDate, actualDate);
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