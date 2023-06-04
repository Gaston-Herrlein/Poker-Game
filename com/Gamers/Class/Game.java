package com.Gamers.Class;

import com.Cards.Class.Table;
import com.ObserverPatron.Observer;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Observer> gamers = new ArrayList<>();
    Table table;
    protected boolean isBet=false; //flag que indica que apostaron => Subieron la apuesta
    protected Integer maxBet = 20;
    protected Integer initBet;
    protected Integer flopBet;
    protected Integer turnBet;
    protected Integer riverBet;
    static Integer contVueltas;

    public Game(){
    }

    public void isBet (){

    }

    public void isBet (Integer token){

    }

    //ronda => Variable para indicar en que ronda del juego nos encontramos (init, flop, turn, river)
    public void isBet (String ronda, Integer token){

    }
    public void Pass (){

    }

}
