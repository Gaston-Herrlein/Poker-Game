package com.Cartas;
import java.util.ArrayList;
import java.util.List;

public class Cards implements Deck {
    private int valor;
    private String palo;
    static List<Cards> cartasEnJuego = new ArrayList<>();

    public Cards() {
    }

    public Cards(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    int getValor() {
        return this.valor;
    }

    String getPalo() {
        return this.palo;
    }

    @Override
    public boolean ExisteLaCarta(int valor, String palo) {
        for (Cards carta : cartasEnJuego){
            if ((carta.getValor() == valor) && (carta.getPalo().equals(palo))) return true;
        }
        return false;
    }

    @Override
    public String VerificarValor(int valor) {
        String[] valorLetra = {"A", "J", "Q", "K"};

        if (valor==1){
            return valorLetra[0];
        }
        else if (valor>10){
            return valorLetra [(valor-10)];
        }
        return String.valueOf(valor);
    }
}