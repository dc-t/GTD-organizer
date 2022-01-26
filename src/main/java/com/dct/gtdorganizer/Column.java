package com.dct.gtdorganizer;

import java.util.ArrayList;

import org.json.simple.JSONArray;

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

    /**
     * Returns a JSONArray with the data of the contained tasks as entries.
     * 
     * @return Returns a JSONArray with the data of the contained tasks as entries.
     */

    JSONArray save() {
        JSONArray jarr = new JSONArray();
        for (Task task : tasks) {
            jarr.add(task.save());
        }
        return jarr;
    }

}
