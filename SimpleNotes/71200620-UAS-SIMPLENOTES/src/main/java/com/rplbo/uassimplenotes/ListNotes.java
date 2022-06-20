package com.rplbo.uassimplenotes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListNotes extends Notes{
    public ListNotes(String notes){
        super(notes);

    }

    private ArrayList<String> listNotes;

    public void showNotes(){

        for(int i = 0; i < listNotes.toArray().length ; i++){
            System.out.println(i + ". "+ listNotes.get(i));
        }
    }

    public List<String> findNotes(String find) throws NotesException {
        for(int i = 0; i < listNotes.toArray().length;i++){
            if(find.equals(listNotes.get(i))){
                System.out.println("Found it");

            }else{
                throw new NotesException(2);
            }
        }
        return Collections.singletonList(find);
    }

    public void addNotes(String add) throws NotesException {

        if(add != null){
            listNotes.add(add);

        }else{
            throw new NotesException(1);
        }
    }
}
