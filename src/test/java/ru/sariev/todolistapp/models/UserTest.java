package ru.sariev.todolistapp.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;

    @BeforeEach
    void createUser() {
        user = new User();
    }

    @Test
    void getUsernameTest() {
        user.setUsername("USER");
        String expectedUsername = "USER";
        String actualUsername = user.getUsername();
        assertEquals(expectedUsername, actualUsername);
    }

    @Test
    void setUsernameTest() {
        user.setUsername("ADMIN");
        String expectedUsername = "ADMIN";
        String actualUsername = user.getUsername();
        assertEquals(expectedUsername, actualUsername);
    }

    @Test
    void getPasswordTest() {
        user.setPassword("test_password");
        String expectedPassword = "test_password";
        String actualPassword = user.getPassword();
        assertEquals(expectedPassword, actualPassword);
    }

    @Test
    void setPasswordTest() {
        user.setPassword("test_password");
        String expectedPassword = "test_password";
        String actualPassword = user.getPassword();
        assertEquals(expectedPassword, actualPassword);
    }
}