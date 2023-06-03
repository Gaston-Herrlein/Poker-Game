package com.Jugadores;

import com.Cartas.Table;
import com.Observer;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Observer> gamers = new ArrayList<>();
    Table table;
    protected Integer maxima = 20;
    protected boolean apostaron=false;
    protected Integer apuestaInicial;
    protected Integer apuestaFlop;
    protected Integer apuestaTurn;
    protected Integer apuestaRiver;
    static Integer contVueltas;
    public Game(){
    }

    public void Apostaron(){ //Prototipo para cambiar a FALSE cuando termina la ronda
        this.apostaron=!this.apostaron;
    }
    public void Apostaron (Integer cantidad){

    }
    public void Apostaron (String ronda, Integer cantidad){
        //Prototipo para cuando apuestan, saber la cant y la ronda(inicial, flop, turn o river))
        /*
        this.apostaron=!this.apostaron;
        switch (ronda) {
            case "Inicial" -> this.apuestaInicial = cantidad;
            case "Flop" -> this.apuestaFlop = cantidad;
            case "Turn" -> this.apuestaTurn = cantidad;
            case "River" -> this.apuestaRiver = cantidad;
        }
        */
    }
    public void Pasar (){

    }

}
