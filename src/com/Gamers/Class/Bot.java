package com.Gamers.Class;

public abstract class Bot extends Gamers {
    public Bot(String name){
        super (name);
    }
    @Override
    public void Update(){
        //LOGICA PARA ACTUALIZAR ESTADO DE BOTS
    }
    @Override
    public String toString (){
        return super.name + ", " + "$" + super.token + "\n" +
                super.hand.toString();
    }
}
