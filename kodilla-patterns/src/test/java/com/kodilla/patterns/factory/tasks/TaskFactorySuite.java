package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TaskFactorySuite {
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.createTask(TaskFactory.Driving);

        //Then
        assertEquals("Driving task", driving.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.createTask(TaskFactory.Paintning);
        assertFalse(painting.isTaskExecuted());
        painting.executeTask();

        //Then
        assertTrue(painting.isTaskExecuted());
        assertEquals("Painting task", painting.getTaskName());
    }



}
