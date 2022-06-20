package com.rplbo.uassimplenotes;

public class TextNotes extends Notes {
    public TextNotes(String notes){
        super(notes);

    }
    private StringBuilder notes = new StringBuilder();

    public void showNotes(){

       for(int i = 0 ; i < notes.capacity() ; i++){
           System.out.println(notes.toString() + " ,");
       }

    }
    public String findNotes(String find) throws NotesException {
        for(int i = 0 ; i < notes.capacity() ; i++){
           if(find.equals(notes.toString())){
               System.out.println("Found!");
           }else {
               throw new NotesException(2);
           }
        }
        return find;
    }

    public void addNotes(String add) throws NotesException {
        if(add != null){
            notes.append(add);
        }else{
            throw new NotesException(1);
        }

    }
}
