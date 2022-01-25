package com.dct.gtdorganizer;

class Organizer {
    Column[] columns;

    Organizer(Column[] columns) {
        this.columns = columns;
    }

    /**
     * Moves a task from the current column to another column.
     * Does nothing if the current column does not contain the task.
     * 
     * @param task  Task to be moved.
     * @param other Target column.
     */
    void moveTo(Task task, Column other) {
        for (Column column : columns) {
            if (column.tasks.contains(task)) {
                other.add(task);
                column.tasks.remove(task);
                break;
            }
        }
    }
}