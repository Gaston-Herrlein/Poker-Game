package com.Jugadores;

public class Apuestas {
    protected int maxima = 20;
    protected boolean apostaron=false;
    protected int apuestaInicial;
    protected int apuestaFlop;
    protected int apuestaTurn;
    protected int apuestaRiver;
    static int contVueltas;
    static int cantJugadores;
    public Apuestas (){
    }

    public void Apostaron(){ //Prototipo para cambiar a FALSE cuando termina la ronda
        this.apostaron=!this.apostaron;
    }
    public void Apostaron (String ronda, int cantidad){ //Prototipo para cuando apuestan, saber la cant y la ronda(inicial, flop, turn o river))
        this.apostaron=!this.apostaron;
        switch (ronda) {
            case "Inicial" -> this.apuestaInicial = cantidad;
            case "Flop" -> this.apuestaFlop = cantidad;
            case "Turn" -> this.apuestaTurn = cantidad;
            case "River" -> this.apuestaRiver = cantidad;
        }
    }

}
