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
    TaskList toDo;

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgress;

    @Autowired
    @Qualifier("doneList")
    TaskList done;

    @Bean
    public Board getBoard() {
        return new Board(toDo, inProgress, done);
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getToDo() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getInProgress() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getDone() {
        return new TaskList();
    }
}
