package com.Jugadores;
import com.Cartas.Hand;
import com.Gamers;

import java.util.Scanner;

public class Gamer extends Gamers {

    public Gamer(String name){
        super(name);
    }
    @Override
    public void Update() {

    }

    @Override
    public String toString (){
        return super.name + ", " + "$" + super.token + "\n" +
                super.hand.toString();
    }

}
