package com.dct.gtdorganizer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

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

    /**
     * Displays the current organizer state to standard out.
     */
    void display() {
        // TODO write the body and decide whether to display all the tasks or just the
        // columns
    }

    /**
     * Saves the current organizer state to the named file.
     * 
     * @param filename Name of the target file.
     */

    void save(String filename) {
        JSONObject jobj = new JSONObject();

        for (Column column : columns) {
            jobj.put(column.name, column.save());
        }

        try {
            PrintWriter printWriter = new PrintWriter(filename);

            printWriter.write(jobj.toJSONString());
            printWriter.flush();
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    void load(String filename){
        // TODO Handle exception
        Object obj = new JSONParser().parse(new FileReader(filename));
        // TODO Create Columns
        // TODO Create Tasks in Columns
    }

}