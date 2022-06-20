package com.rplbo.uasprakrplbo;

public abstract class Monster implements MonsterInterface{
    private String nama;

//    public Monster(Monster monster1, Monster monster2) {
//        monster1.getNama();
//        monster2.getNama();
//    }

    @Override
    public String bergerak() {


        return this.bergerak();
    }

    public Monster(String nama){
        this.nama = nama;

    }

    public String bersuara(){
        String voice = "";
        if(this.nama.equals("Cyclops")){
            voice =  "Hohohoho";
        } else if (this.nama.equals("Manticore")) {
            voice = "Roarroar";
        } else if (this.nama.equals("Cerberus")) {
            voice = "Rawrrawr";
        }
        return voice;
    }

    public void getInfo(){

        System.out.println("Nama : "  + this.getNama() );
        System.out.println("Gerakan : "+ this.bergerak());
        System.out.println("Suara : " + this.bersuara());

    }

    public String getNama() {
        return nama;
    }
}
