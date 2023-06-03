package com;
import com.Cartas.Hand;
import com.Jugadores.Game;

public abstract class Gamers implements Observer {
    protected String name;
    protected Integer token; //10000 fichas iniciales
    protected Hand hand;
    protected boolean diller;
    protected boolean ciegaChica;
    protected boolean ciegaGrande;
    //protected Game state;

    public Gamers(String name) {
        this.name = name;
        this.token = 10000;
        this.hand = new Hand();
    }
    public void Strategy (Game state){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getToken() {
        return token;
    }

    public void setToken(Integer token) {
        this.token = token;
    }

    public Hand getHands() {
        return hand;
    }

    public void setHands(Hand hand) {
        this.hand = hand;
    }

    public boolean isDiller() {
        return diller;
    }

    public void setDiller() {
        this.diller=!this.diller;
    }

    public boolean isCiegaChica() {
        return ciegaChica;
    }

    public void setCiegaChica() {
        this.ciegaChica=!this.ciegaChica;
    }

    public boolean isCiegaGrande() {
        return ciegaGrande;
    }

    public void setCiegaGrande(boolean ciegaGrande) {
        this.ciegaGrande=!this.ciegaGrande;
    }

}
