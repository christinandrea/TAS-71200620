package com.rplbo.uasprakrplbo;

public class Cerberus extends Monster{
    public Cerberus(String nama){
        super(nama);

    }

    @Override
    public String bergerak() {
        String gerakan = "Berlari";
        return gerakan;
    }

    @Override
    public String bersuara() {
        String voice = "Rawrrawr";

        return voice;
    }
}
