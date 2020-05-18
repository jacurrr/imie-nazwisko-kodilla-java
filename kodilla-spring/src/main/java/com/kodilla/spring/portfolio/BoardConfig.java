package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoList")
    TaskList taskListOne;

    @Autowired
    @Qualifier("inProgressList")
    TaskList taskListTwo;

    @Autowired
    @Qualifier("doneList")
    TaskList taskListTree;

    @Bean
    public Board getBoard(){
        return new Board(taskListOne, taskListTwo, taskListTree);
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getTaskListOne(){
        return new TaskList("To Do List");
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getTaskListTwo(){
        return new TaskList("In Progress List");
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getTaskListTree(){
        return new TaskList("Done List");
    }
}
