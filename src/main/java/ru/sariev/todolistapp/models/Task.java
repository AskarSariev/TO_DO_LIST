package ru.sariev.todolistapp.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "Task")
public class Task implements Comparable<Task> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "task_name")
    @NotEmpty(message = "Task shouldn't be empty")
    private String taskName;

    @Column(name = "target_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Target date shouldn't be empty")
    private Date targetDate;

    @Column(name = "status")
    private boolean status;

    public Task() {}

    public Task(String taskName, Date targetDate, boolean status) {
        this.taskName = taskName;
        this.targetDate = targetDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public int compareTo(Task o) {
        return this.targetDate.compareTo(o.targetDate);
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", targetDate=" + targetDate +
                ", status=" + status +
                '}';
    }
}
