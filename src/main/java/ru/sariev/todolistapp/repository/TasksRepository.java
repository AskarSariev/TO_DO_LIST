package ru.sariev.todolistapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sariev.todolistapp.models.Task;

@Repository
public interface TasksRepository extends JpaRepository<Task, Integer> {
}
