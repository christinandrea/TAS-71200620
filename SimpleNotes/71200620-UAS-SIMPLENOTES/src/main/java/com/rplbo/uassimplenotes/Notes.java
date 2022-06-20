package com.rplbo.uassimplenotes;

import java.io.*;

public abstract class Notes {
    private static String notesName;

    public Notes(String name){

        this.notesName = name;
    }

    public abstract void addNotes(String note) throws NotesException;
    public abstract void showNotes();

    public static String loadNotes(String notes) throws IOException, ClassNotFoundException {

        FileInputStream neFile = new FileInputStream(notes);
        ObjectInputStream inp = new ObjectInputStream(neFile);

        // Method for deserialization of object
        notesName = (String) inp.readObject();

        return notesName;
    }

    public void saveNotes() throws IOException {
        String name = this.notesName + ".txt";
        FileOutputStream newFile = new FileOutputStream(name);
        ObjectOutputStream obj = new ObjectOutputStream(newFile);

        obj.writeObject(notesName);

    }
}
