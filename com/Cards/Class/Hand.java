package com.Cards.Class;
import com.Cards.Class.Cards;

import java.util.List;
import java.util.ArrayList;
public class Hand extends Cards {
    List <Cards> hand = new ArrayList<>();

    public Hand(){
        for (int i=0; i<2; i++){
            int valorCarta = (int) (Math.random()*13+1); //Obtenemos un valor entre 1 y 13
            int valorPalo = (int) (Math.random()*4);

            if(!ExisteLaCarta(valorCarta, this.palos[valorPalo])){
                hand.add(new Cards(valorCarta, this.palos[valorPalo]));
                cartasEnJuego.add(new Cards(valorCarta, this.palos[valorPalo]));
            }
            else{
                i--;
            }
        }
    }
    public Integer getValorCarta1 (){
        return hand.get(0).getValor();
    }
    public Integer getValorCarta2 (){
        return hand.get(1).getValor();
    }
    public String getPaloCarta1 (){
        return hand.get(0).getPalo();
    }
    public String getPaloCarta2 (){
        return hand.get(1).getPalo();
    }
    @Override
    public String toString() {
        return "Cartas de la mano: \n" +
                super.VerificarValor(hand.get(0).getValor()) + " " + hand.get(0).getPalo() + "\n" +
                super.VerificarValor(hand.get(1).getValor()) + " " + hand.get(1).getPalo() + "\n\n";
    }
}