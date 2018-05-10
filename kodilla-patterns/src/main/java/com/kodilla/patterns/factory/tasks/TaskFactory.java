package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String Driving = "DRIVING";
    public static final String Shopping = "SHOPPING";
    public static final String Paintning = "PAINTING";

    public final Task createTask(final String taskClass){
        switch (taskClass){
            case Driving:
                return new DrivingTask("Driving task", "Gdynia", "car");
            case Shopping:
                return new ShoppingTask("Shopping task", "new jeans", 1);
            case Paintning:
                return new PaintingTask("Painting task", "blue", "tree");
                default:
                    return null;
        }
    }

}
