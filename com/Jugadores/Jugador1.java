package com.Jugadores;
import com.Cartas.Mano;
public class Jugador1 implements Jugadores{

    String nombre;
    Mano mano = new Mano();

    public Jugador1(String nombre){
        this.nombre=nombre;
    }
    @Override
    public boolean Apostar() {
        return false;
    }
}
