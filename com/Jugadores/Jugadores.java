package com.Jugadores;

public interface Jugadores {
    int fichasInicial = 10000;

    //PROTOTIPO PAGA PAGAR LAS CIEGAS
    void Jugar ();

    //PROTOTIPO PARA CUANDO NO AUMENTAN LA APUESTA
    void Jugar (boolean apuesta);


    //PROTOTIPO PARA CUANDO AUMENTAN
    void Jugar(boolean apuesta, int cantidad);

}
