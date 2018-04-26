package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context
                = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().tasks.add("Before start");
        board.getInProgressList().tasks.add("In progress");
        board.getDoneList().tasks.add("Done");

        //Then
        assertEquals("Before start", board.getToDoList().getTasks().get(0));
        assertEquals("In progress", board.getInProgressList().getTasks().get(0));
        assertEquals("Done", board.getDoneList().getTasks().get(0));
    }

}
