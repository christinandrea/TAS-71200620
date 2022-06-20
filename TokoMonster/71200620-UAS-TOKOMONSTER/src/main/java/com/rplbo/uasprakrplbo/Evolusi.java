package com.rplbo.uasprakrplbo;

public class Evolusi extends Monster{
    private Monster monster1;
    private Monster monster2;


    public Evolusi(Monster monster1, Monster monster2) {
        super(monster1.getNama() + "" + monster2.getNama());
        this.monster1 = monster1;
        this.monster2 = monster2;



    }

    @Override
    public String bersuara() {
        String newVoice = "";
        char sound1 = 0;
        char sound2 = 0;
        for(int i = 0; i < monster1.bersuara().length() ; i++ ){
            if(monster1.bersuara().charAt(i)%2!=0 && monster2.bersuara().charAt(i)%2==0){
                sound1 = monster1.bersuara().charAt(i);
                sound2 = monster2.bersuara().charAt(i);

            }
        }
        newVoice = String.valueOf(sound1)+ String.valueOf(sound2);
        return newVoice;

    }

    @Override
    public String bergerak() {

        return monster2.bergerak();
    }
}
