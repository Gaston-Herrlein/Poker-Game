package com.Gamers.Class;
import com.Cards.Class.Hand;
import com.ObserverPatron.Observer;

public abstract class Gamers implements Observer {
    protected String name;
    protected Integer token; //10000 fichas iniciales
    protected Hand hand;
    protected boolean diller;
    protected boolean ciegaChica;
    protected boolean ciegaGrande;
    private final Integer INIT_TOKEN = 1000;

    public Gamers(String name) {
        this.name = name;
        this.token = this.INIT_TOKEN;
        this.hand = new Hand();
    }
    public void Strategy (Game state){
    }
    public String getName() {
        return name;
    }

    public Integer getToken() {
        return token;
    }

    public void setToken(Integer token) {
        this.token = token;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
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
