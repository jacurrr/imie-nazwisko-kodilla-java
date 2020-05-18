package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public boolean addTaskToToDoList(String task){
        return toDoList.addTask(task);
    }

    public boolean addTaskToInProgressList(String task){
        return inProgressList.addTask(task);
    }

    public boolean addTaskToDoneList(String task){
        return doneList.addTask(task);
    }

    public boolean moveTaskFromToDoListToInProgressList(String task){
        if(!toDoList.getTasks().contains(task)) return false;
        toDoList.removeTask(task);
        return inProgressList.addTask(task);
    }

    public boolean moveTaskFromToDoListToInDoneList(String task){
        if(!toDoList.getTasks().contains(task)) return false;
        toDoList.removeTask(task);
        return doneList.addTask(task);
    }

    public boolean moveTaskFromInProgressListToDoneList(String task){
        if(!inProgressList.getTasks().contains(task)) return false;
        inProgressList.removeTask(task);
        return doneList.addTask(task);
    }

    public boolean removeTaskFromToDoList(String task){
        return toDoList.removeTask(task);
    }

    public boolean removeTaskFromInProgressList(String task){
        return inProgressList.removeTask(task);
    }

    public boolean removeTaskFromDoneList(String task){
        return doneList.removeTask(task);
    }

    public List<String> getDoneListTasks() {
        return doneList.getTasks();
    }

    public List<String> getInProgressListTasks() {
        return inProgressList.getTasks();
    }

    public List<String> getToDoListTasks() {
        return toDoList.getTasks();
    }

    @Override
    public String toString() {
        return "Board:" + '\n' +
                "\ttoDoList:" + '\n' + toDoList + '\n' +
                "\tinProgressList=" + '\n' + inProgressList + '\n' +
                "\tdoneList=" + '\n' + doneList;
    }
}
