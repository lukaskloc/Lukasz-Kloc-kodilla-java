package com.kodilla.spring.Portfolio;

import com.kodilla.spring.portfolio.Board;
import com.kodilla.spring.portfolio.BoardConfig;
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
    public void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("Thing to do");
        board.getInProgressList().addTask("Thing being done");
        board.getDoneList().addTask("Thing done already");
        //Then
        assertEquals(1, board.getToDoList().getTasks().size());
        assertEquals(board.getToDoList().getTasks().get(0), "Thing to do");
        assertEquals(1, board.getInProgressList().getTasks().size());
        assertEquals(board.getInProgressList().getTasks().get(0), "Thing being done");
        assertEquals(1, board.getDoneList().getTasks().size());
        assertEquals(board.getDoneList().getTasks().get(0), "Thing done already");
    }
}