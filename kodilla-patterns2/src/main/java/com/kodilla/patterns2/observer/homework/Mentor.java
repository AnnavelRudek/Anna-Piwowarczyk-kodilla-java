package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName){
        this.mentorName = mentorName;
    }

    @Override
    public void update(TaskQueue taskQueue){
        System.out.println(mentorName + " have to check task from: " + taskQueue.getStudent()+ ": student added new task to the queue: " +  "\n"
                        + taskQueue.getTasks() +
                " (have total tasks in queue: " + taskQueue.getTasks() + " \n(total: " + (updateCount + 1) + ")");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
