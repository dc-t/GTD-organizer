package com.dct.gtdorganizer;

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
     * Prints the name and body to system out.
     */
    void expand() {
        System.out.print(name + "\n\n" + body + "\n");
    }

    JSONObject save(){

    }
}