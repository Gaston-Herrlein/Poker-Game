package com.Cards.Class;
import com.ObserverPatron.Observer;

import java.util.List;
import java.util.ArrayList;
public class Table extends Cards implements Observer {
    private List <Cards> table = new ArrayList<>();
    static boolean flagFlop=false;
    static boolean flagTurn=false;
    static boolean flagRiver=false;
    public Table(){
    }

    public List<Cards> getTable() {
        return table;
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
        return this.toString();
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
        return this.toString();
    }
    public String River () {
        for (int i = 0; i < 1; i++) {
            int valorCarta = (int) (Math.random() * 13 + 1);
            int valorPalo = (int) (Math.random() * 4);

            if (!ExisteLaCarta(valorCarta, this.palos[valorPalo])) {
                table.add(new Cards(valorCarta, this.palos[valorPalo]));
                cartasEnJuego.add(new Cards(valorCarta, this.palos[valorPalo]));
            } else {
                i--;
            }
        }
        return this.toString();
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

    @Override
    public String toString() {
        String message = "Cartas en mesa:\n";
        String aux;
        for (Cards card: getTable()) {
            aux = message.concat(super.VerificarValor(card.getValor()) + " " + card.getPalo() + "\n");
            message = aux;
        }

        return message;
    }
}

