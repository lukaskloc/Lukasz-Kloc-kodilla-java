package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testTaskFactoryShoppingTask() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPING);

        //Then
        Assert.assertEquals("Groceries", shoppingTask.getTaskName());
    }

    @Test
    public void testTaskFactoryDrivingTask() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.createTask(TaskFactory.DRIVING);

        //Then
        Assert.assertEquals("Driving", drivingTask.executeTask());
        Assert.assertEquals("Everyday driving", drivingTask.getTaskName());
    }

    @Test
    public void testTaskFactoryPaintingTask() {

        //Given
        TaskFactory factory = new TaskFactory();

        //Given
        Task paintingTask = factory.createTask(TaskFactory.PAINTING);
        paintingTask.executeTask();

        //Then
        Assert.assertTrue(paintingTask.isTaskExecuted());
        Assert.assertEquals("House painting", paintingTask.getTaskName());
    }
}
