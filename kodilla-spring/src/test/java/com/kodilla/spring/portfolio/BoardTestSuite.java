package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = applicationContext.getBean(Board.class);
        //When
        board.addTaskToToDoList("Task1");
        board.addTaskToInProgressList("Task2");
        board.addTaskToDoneList("Task3");
        board.addTaskToDoneList("Task4");
        System.out.println(board);
        //Then
        Assert.assertEquals("Task1", board.getToDoListTasks().get(0));
        Assert.assertEquals("Task2", board.getInProgressListTasks().get(0));
        Assert.assertEquals("Task3", board.getDoneListTasks().get(0));
        Assert.assertEquals(1, board.getToDoListTasks().size());
        Assert.assertEquals(1, board.getInProgressListTasks().size());
        Assert.assertEquals(2, board.getDoneListTasks().size());
    }
    @Test
    public void testRemoveTaskFromList(){
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = applicationContext.getBean(Board.class);
        board.addTaskToToDoList("Task1");
        board.addTaskToInProgressList("Task2");
        board.addTaskToDoneList("Task3");
        board.addTaskToDoneList("Task4");
        System.out.println(board);
        //When
        board.removeTaskFromToDoList("Task1");
        board.removeTaskFromInProgressList("Task2");
        board.removeTaskFromDoneList("Task4");
        System.out.println(board);
        //Then
        Assert.assertEquals(0, board.getToDoListTasks().size());
        Assert.assertEquals(0, board.getInProgressListTasks().size());
        Assert.assertEquals(1, board.getDoneListTasks().size());
    }
    @Test
    public void testMoveTask(){
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = applicationContext.getBean(Board.class);
        board.addTaskToToDoList("Task1");
        board.addTaskToToDoList("Task2");
        board.addTaskToInProgressList("Task3");
        board.addTaskToInProgressList("Task4");
        board.addTaskToInProgressList("Task5");
        board.addTaskToDoneList("Task6");
        System.out.println(board);
        //When
        board.moveTaskFromToDoListToInProgressList("Task1");
        board.moveTaskFromToDoListToInDoneList("Task2");
        board.moveTaskFromInProgressListToDoneList("Task5");
        System.out.println(board);
        //Then
        Assert.assertEquals(0, board.getToDoListTasks().size());
        Assert.assertEquals(3, board.getInProgressListTasks().size());
        Assert.assertEquals(3, board.getDoneListTasks().size());
    }

    @Test
    public void testMoveTaskNotContainsInList(){
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = applicationContext.getBean(Board.class);
        board.addTaskToToDoList("Task1");
        board.addTaskToToDoList("Task2");
        board.addTaskToInProgressList("Task3");
        board.addTaskToInProgressList("Task4");
        board.addTaskToInProgressList("Task5");
        board.addTaskToDoneList("Task6");
        System.out.println(board);
        //When
        board.moveTaskFromToDoListToInProgressList("Task4");
        board.moveTaskFromToDoListToInDoneList("Task5");
        board.moveTaskFromInProgressListToDoneList("Task1");
        System.out.println(board);
        //Then
        Assert.assertEquals(2, board.getToDoListTasks().size());
        Assert.assertEquals(3, board.getInProgressListTasks().size());
        Assert.assertEquals(1, board.getDoneListTasks().size());
    }
}
