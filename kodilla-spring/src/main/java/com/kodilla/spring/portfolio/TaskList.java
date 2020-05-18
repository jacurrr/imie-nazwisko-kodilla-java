package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private final List<String> tasks;
    private final String name;

    public TaskList(String name) {
        this.tasks = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public boolean addTask(String task){
        return tasks.add(task);
    }

    public boolean removeTask(String task){
        return tasks.remove(task);
    }

    @Override
    public String toString() {
        return "List name: " + name + '\n' +
                "tasks:" + tasks;
    }
}
