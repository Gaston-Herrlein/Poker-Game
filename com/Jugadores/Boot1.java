package com.Jugadores;
import com.Cartas.Mano;

public class Boot1 extends Apuestas implements Jugadores {
    String nombre;
    Mano mano;
    int fichas;
    int apuesta;

    boolean diller=false;
    boolean ciegaChica=false;
    boolean ciegaGrande=false;

    public Boot1(String nombre){
        this.nombre=nombre;
        this.fichas=this.fichasInicial;
        this.mano = new Mano ();
        this.cantJugadores++;
    }

    public void setDiller(){
        this.diller=!this.diller;
    }
    public boolean getDiller(){
        return this.diller;
    }
    public void setCiegaChica(){
        this.ciegaChica=!ciegaChica;
    }
    public boolean getCiegaChica(){
        return  this.ciegaChica;
    }
    public void setCiegaGrande(){
        this.ciegaGrande=!ciegaGrande;
    }
    public boolean getCiegaGrande(){
        return this.ciegaGrande;
    }
    public String toString (){
        return this.nombre + ", " + this.fichas + "\n" +
                this.mano.toString();
    }
    @Override
    public void Jugar(){
        if (this.ciegaChica){
            this.apuesta=(this.maxima/2);
            this.fichas-= (this.maxima/2);
            System.out.println(this.nombre + " CIEGA CHICA\n" + this.maxima/2);
        }
        else if (this.ciegaGrande) {
            this.apuesta=(this.maxima/2);
            this.fichas-= this.maxima;
            this.apuestaInicial=maxima;
            System.out.println(this.nombre + " CIEGA GRANDE\n" + this.maxima);
        }
    }
    @Override
    public void Jugar(boolean apuesta) {
        if ((Math.random()*200)<=10){
            if (apuestaInicial*2 <= this.fichas){
                this.fichas -= apuestaInicial*2;
                Apostaron();
                System.out.println(this.nombre + " Aposto: " + apuestaInicial*2);
            }
            else{
                System.out.println(this.nombre + " Aposto: " + this.fichas);
                this.fichas = 0;
            }
        }
    }
    @Override
    public void Jugar(boolean apuesta, int cantidad) {
        if (mano.getValorCarta1()==mano.getValorCarta2()) {

        }
    }
}
