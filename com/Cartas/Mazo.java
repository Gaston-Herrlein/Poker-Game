package com.Cartas;

public interface Mazo {
    String[] palos = {"Corazon", "Pica", "Diamante", "Trebol"};
    boolean ExisteLaCarta(int valor, String palo);
    String VerificarValor(int valor); //Este metodo es para poner A, J, Q, K dependiendo si es 1, 11, 12, 13
}