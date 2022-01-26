package com.dct.gtdorganizer;

import java.util.Map;

class Task {
    String name;
    String body;

    Task(String name) {
        this.name = name;
        this.body = "";
    }

    Task(String name, String body) {
        this.name = name;
        this.body = body;
    }

    /**
     * Prints the Task to system out.
     */
    void expand() {
        System.out.print(name + "\n\n" + body);
    }

    // TODO default implementation?

    /**
     * Returns a Map object with the fields of the Task and their values.
     * 
     * @return A Map object containing the fields and their values.
     */
    Map<String, String> save() {
        // TODO Make default implementation
    }
}