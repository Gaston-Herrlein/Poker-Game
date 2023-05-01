package com.Cartas;
import java.util.List;
import java.util.ArrayList;
public class Mano extends Cartas{
    List <Cartas> mano = new ArrayList<>();

    public Mano(){
        for (int i=0; i<2; i++){
            int valorCarta = (int) (Math.random()*13+1); //Obtenemos un valor entre 1 y 13
            int valorPalo = (int) (Math.random()*4);

            if(!ExisteLaCarta(valorCarta, this.palos[valorPalo])){
                mano.add(new Cartas(valorCarta, this.palos[valorPalo]));
                cartasEnJuego.add(new Cartas(valorCarta, this.palos[valorPalo]));
            }
            else{
                i--;
            }
        }
    }

    @Override
    public String toString() {
        return "Cartas de la mano: \n" +
                super.VerificarValor(mano.get(0).getValor()) + " " + mano.get(0).getPalo() + "\n" +
                super.VerificarValor(mano.get(1).getValor()) + " " + mano.get(1).getPalo();
    }
}