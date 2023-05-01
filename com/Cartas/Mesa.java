package com.Cartas;
import java.util.List;
import java.util.ArrayList;
public class Mesa extends Cartas{
    List <Cartas> mesa = new ArrayList<>();

    public Mesa(){
    }

    public String Flop (){
        for (int i=0; i<3; i++){
            int valorCarta = (int) (Math.random()*13+1);
            int valorPalo = (int) (Math.random()*4);

            if(!ExisteLaCarta(valorCarta, this.palos[valorPalo])){
                mesa.add(new Cartas(valorCarta, this.palos[valorPalo]));
                cartasEnJuego.add(new Cartas(valorCarta, this.palos[valorPalo]));
            }
            else{
                i--;
            }
        }
        return "Cartas mesa en el flop: \n" +
                super.VerificarValor(mesa.get(0).getValor()) + " " + mesa.get(0).getPalo() + "\n" +
                super.VerificarValor(mesa.get(1).getValor()) + " " + mesa.get(1).getPalo() + "\n" +
                super.VerificarValor(mesa.get(2).getValor()) + " " + mesa.get(2).getPalo();
    }
    void Turn (){

    }
    void River (){

    }

}

