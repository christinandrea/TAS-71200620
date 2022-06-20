package com.rplbo.uasprakrplbo;

public class Manticore extends Monster {

    public Manticore(String nama){
        super(nama);

    }

    @Override
    public String bergerak() {
        String gerakan = "Terbang";
        return gerakan;
    }

    @Override
    public String bersuara() {
        String voice = "Roarroar";

        return voice;
    }
}
