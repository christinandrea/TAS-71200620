package com.rplbo.uassimplenotes;

public class NotesException extends Throwable {
    private int code;
    private String message;

    public NotesException (int code){

        this.code = code;
        if (code == 1){
            this.message= "Notes couldnt be empty";
        }
        else if (code==2){
            this.message= "Keyword couldnt be empty";
        }

    }
}
