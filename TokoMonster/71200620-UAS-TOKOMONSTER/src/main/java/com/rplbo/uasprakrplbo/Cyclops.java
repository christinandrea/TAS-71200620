package com.rplbo.uasprakrplbo;

public class Cyclops extends Monster{
    public Cyclops(String nama){
        super(nama);

    }

    @Override
    public String bergerak() {
        String gerakan = "Berjalan";
        return gerakan;
    }

    @Override
    public String bersuara() {
        String voice = "Hohohoho";

        return voice;
    }
}
