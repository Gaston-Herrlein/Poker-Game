package com.Cartas;
import com.Observer;

import java.util.List;
import java.util.ArrayList;
public class Table extends Cards implements Observer {
    List <Cards> table = new ArrayList<>(); //
    static boolean flagFlop=false;
    static boolean flagTurn=false;
    static boolean flagRiver=false;
    public Table(){
    }

    public String Flop (){
        for (int i=0; i<3; i++){
            int valorCarta = (int) (Math.random()*13+1);
            int valorPalo = (int) (Math.random()*4);

            if(!ExisteLaCarta(valorCarta, this.palos[valorPalo])){
                table.add(new Cards(valorCarta, this.palos[valorPalo]));
                cartasEnJuego.add(new Cards(valorCarta, this.palos[valorPalo]));
            }
            else{
                i--;
            }
        }
        return "Cartas mesa en el flop: \n" +
                super.VerificarValor(table.get(0).getValor()) + " " + table.get(0).getPalo() + "\n" +
                super.VerificarValor(table.get(1).getValor()) + " " + table.get(1).getPalo() + "\n" +
                super.VerificarValor(table.get(2).getValor()) + " " + table.get(2).getPalo();
    }
    public String Turn (){
        for (int i=0; i<1; i++){
            int valorCarta = (int) (Math.random()*13+1);
            int valorPalo = (int) (Math.random()*4);

            if(!ExisteLaCarta(valorCarta, this.palos[valorPalo])){
                table.add(new Cards(valorCarta, this.palos[valorPalo]));
                cartasEnJuego.add(new Cards(valorCarta, this.palos[valorPalo]));
            }
            else{
                i--;
            }
        }
        return "Cartas mesa en el flop: \n" +
                super.VerificarValor(table.get(0).getValor()) + " " + table.get(0).getPalo() + "\n" +
                super.VerificarValor(table.get(1).getValor()) + " " + table.get(1).getPalo() + "\n" +
                super.VerificarValor(table.get(2).getValor()) + " " + table.get(2).getPalo() + "\n" +
                super.VerificarValor(table.get(3).getValor()) + " " + table.get(3).getPalo();
    }
    public String River (){
        for (int i=0; i<1; i++){
            int valorCarta = (int) (Math.random()*13+1);
            int valorPalo = (int) (Math.random()*4);

            if(!ExisteLaCarta(valorCarta, this.palos[valorPalo])){
                table.add(new Cards(valorCarta, this.palos[valorPalo]));
                cartasEnJuego.add(new Cards(valorCarta, this.palos[valorPalo]));
            }
            else{
                i--;
            }
        }
        return "Cartas mesa en el flop: \n" +
                super.VerificarValor(table.get(0).getValor()) + " " + table.get(0).getPalo() + "\n" +
                super.VerificarValor(table.get(1).getValor()) + " " + table.get(1).getPalo() + "\n" +
                super.VerificarValor(table.get(2).getValor()) + " " + table.get(2).getPalo() + "\n" +
                super.VerificarValor(table.get(3).getValor()) + " " + table.get(3).getPalo() + "\n" +
                super.VerificarValor(table.get(4).getValor()) + " " + table.get(4).getPalo() + "\n" +
                super.VerificarValor(table.get(5).getValor()) + " " + table.get(5).getPalo();
    }

    @Override
    //LOGICA DE ACTUALISACION DE ESTADO
    public void Update() {
        if (!flagFlop){
            flagFlop=true;
            this.Flop();
        }
        else if (!flagTurn){
            flagTurn=true;
            this.Turn();
        }
        else if (!flagRiver){
            flagRiver=true;
            this.River();
        }
        //Si estan las tres banderas en true significa que ya se jugaron las 3 rondas por los que se las resetea
        if(flagFlop && flagTurn && flagRiver){
            flagFlop=false;
            flagTurn=false;
            flagRiver=false;
        }
    }
}

