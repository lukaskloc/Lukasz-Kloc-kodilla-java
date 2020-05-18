package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskName) {
        switch (taskName) {
            case SHOPPING:
                return new ShoppingTask("Groceries", "Potatos", 10.0);
            case PAINTING:
                return new PaintingTask("House painting", "Pink", "Living room");
            case DRIVING:
                return new DrivingTask("Everyday driving", "Work", "Bike");
            default:
                return null;
        }
    }
}
