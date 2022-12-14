# TO DO LIST

<image src="/images/Todolist.jpg" alt="Todolist" width="200" height="200">

<br/>

ToDoListApp is a web task manager. 

<hr/>

### Tools

![Java 11](https://img.shields.io/badge/-Java11-blue??style=plastic&appveyor)
![Spring](https://img.shields.io/badge/-Spring_Web-success?style=plastic&appveyor)
![Spring](https://img.shields.io/badge/-Spring_Data_JPA-success?style=plastic&appveyor)
![Spring](https://img.shields.io/badge/-Spring_Security-success?style=plastic&appveyor)
![Spring](https://img.shields.io/badge/-PostgreSQL-9cf?style=plastic&appveyor)
![Thymeleaf](https://img.shields.io/badge/-Thymeleaf-yellow?style=plastic&appveyor)
![Thymeleaf](https://img.shields.io/badge/-Validation-red?style=plastic&appveyor)

### Getting started

1. Clone the repo:

       git clone https://github.com/AskarSariev/ToDoList.git
      
2. Create database:

       name database = todolist_db;
       username = postgres;
       password = 12345;
      
3. Create table in database:

       CREATE TABLE Users (
       
           id BIGSERIAL PRIMARY KEY,
           
           username VARCHAR(255) NOT NULL UNIQUE,
           
           password VARCHAR(255) NOT NULL
           
       );

### Using

1. Before using the application user should registr

   <image src="/images/Registration.jpg" alt="RegistrationPage" width="200" height="100">

2. Enter username, password

   <image src="/images/Login.jpg" alt="LoginPage" width="200" height="150">

3. Show task list

   <image src="/images/TaskList.jpg" alt="TaskListPage">

4. Add task

   <image src="/images/Add.jpg" alt="AddPage" width="300" height="250">

5. Update task

   <image src="/images/Update.jpg" alt="UpdatePage" width="300" height="250">