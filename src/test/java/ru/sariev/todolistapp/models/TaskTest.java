package ru.sariev.todolistapp.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
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
        Assertions.assertEquals(expectedTaskName, actualTaskName);
    }

    @Test
    void setTaskName() {
    }

    @Test
    void compareTo() {
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