package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {
    @Test
    public void testUpdate(){
        //Given
        TaskQueue konradTasks = new TaskQueue("Konrad Kępiński");
        TaskQueue alicjaTasks = new TaskQueue("Alicja Podolska");
        TaskQueue tomekTasks = new TaskQueue("Tomasz Sikorski");
        TaskQueue slawekTasks = new TaskQueue("Sławomir Dzik");
        TaskQueue marcinTasks = new TaskQueue("Marcin Oleksik");
        TaskQueue damianTasks = new TaskQueue("Damian Hac");

        Mentor kasia = new Mentor("Katarzyna Okapiec");
        Mentor rafal = new Mentor("Rafał Kuczyński");

        konradTasks.registerObserver(kasia);
        slawekTasks.registerObserver(kasia);
        marcinTasks.registerObserver(kasia);

        alicjaTasks.registerObserver(rafal);
        tomekTasks.registerObserver(rafal);
        damianTasks.registerObserver(rafal);

        //When
        konradTasks.addTask("Karmel");
        alicjaTasks.addTask("Cynamon");
        tomekTasks.addTask("Kardamon");
        slawekTasks.addTask("Cieciorka");
        slawekTasks.addTask("Groszek");
        marcinTasks.addTask("Kurkuma");
        marcinTasks.addTask("Curry");
        damianTasks.addTask("Oregano");


        //Then
        assertEquals(5, kasia.getUpdateCount());
        assertEquals(3, rafal.getUpdateCount());
    }

}
