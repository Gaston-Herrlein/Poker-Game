package com;
import com.Cartas.Hand;

public abstract class Gamers implements Observer {
    protected String name;
    protected Integer token;
    protected Hand hands;
    protected boolean diller;
    protected boolean ciegaChica;
    protected boolean ciegaGrande;

    //protected Game state;

    public Gamers(String name) {
        this.name = name;
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
        return hands;
    }

    public void setHands(Hand hands) {
        this.hands = hands;
    }

    public boolean isDiller() {
        return diller;
    }

    public void setDiller(boolean diller) {
        this.diller = diller;
    }

    public boolean isCiegaChica() {
        return ciegaChica;
    }

    public void setCiegaChica(boolean ciegaChica) {
        this.ciegaChica = ciegaChica;
    }

    public boolean isCiegaGrande() {
        return ciegaGrande;
    }

    public void setCiegaGrande(boolean ciegaGrande) {
        this.ciegaGrande = ciegaGrande;
    }

    public void Strategy (Game state){

    }
}
