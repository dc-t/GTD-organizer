package com.dct.gtdorganizer;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Column[] columns = { new Column("Next Steps"),
                new Column("Waiting"),
                new Column("Open Loops"),
                new Column("Maybe"),
                new Column("Completed") };

        Organizer organizer = new Organizer(columns);

    }
}
