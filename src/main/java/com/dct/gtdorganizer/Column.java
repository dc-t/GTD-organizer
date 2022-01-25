package com.dct.gtdorganizer;

class Column {
    ArrayList<Task> tasks;
    String name;

    Column(String name) {
        this.name = name;
        this.tasks = new ArrayList<Task>();
    }

    /**
     * Adds a task to the column.
     * 
     * @param task The task to be added.
     */
    void add(Task task) {
        this.add(task);
    }

    /**
     * Prints all the names of the lists to standard out.
     */

    void list() {
        System.out.print(name + "\n\n");
        for (Task task : tasks) {
            System.out.print(task.name);
        }
    }

    /**
     * Deletes a task from the list.
     * 
     * @param task The task to be deleted.
     */
    void delete(Task task) {
        tasks.remove(task);
    }

}
