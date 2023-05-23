package com.Jugadores;
import com.Cartas.Mano;
import java.util.Scanner;

public class Jugador extends Apuestas implements Jugadores {
    String nombre;
    int fichas;
    int apuesta;
    Mano mano;
    boolean diller=false;
    boolean ciegaChica=false;
    boolean ciegaGrande=false;

    public Jugador (String nombre){
        this.nombre=nombre;
        this.fichas=this.fichasInicial;
        this.mano = new Mano();
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
    @Override
    public String toString (){
        return this.nombre + ", " + this.fichas + "\n" +
                this.mano.toString();
    }
    @Override
    public void Jugar (){
        if (this.ciegaChica){
            this.apuesta=(this.maxima/2);
            this.fichas-= (this.maxima/2);
            System.out.println(this.nombre + " CIEGA CHICA\n" + this.maxima/2);
        }
        else if (this.ciegaGrande) {
            this.apuesta=(this.maxima);
            this.fichas-=this.maxima;
            this.apuestaInicial=maxima;
            System.out.println(this.nombre + " CIEGA GRANDE\n" + this.maxima);
        }
    }
    @Override
    public void Jugar(boolean apuesta){
        if (!apuesta && this.apuesta==this.apuestaInicial){
            System.out.println("No hay apuestan\n ¿Que desea hacer? \n 1:Pasar \t 2:aumentar");
            Scanner reader = new Scanner(System.in);
            int opcion = reader.nextInt();
            do if (opcion == 1) {
                reader.close();
            } else if (opcion == 2) {
                System.out.println("Ingrese apuesta:");
                this.apuestaInicial += reader.nextInt();
                this.fichas-=(this.apuestaInicial-this.apuesta);
                this.apuesta=this.apuestaInicial;
                reader.close();
            } else {
                System.out.println("Ingrese opcion valida");
            } while ((opcion==1) || (opcion==2));
        }

        else {
            System.out.println("¿Que desea hacer?:\t 1: retirarse \t2: igualar a " + this.apuestaInicial + "\t3: Aumentar");
            Scanner reader = new Scanner(System.in);
            int opcion = reader.nextInt();
            do {
                if (opcion == 1) {
                    reader.close();
                    System.out.println("TE RETIRASTE"); //Metodo para indicar cuando un jugador se retira
                }
                else if (opcion==2){
                    this.fichas -= (this.apuestaInicial-this.apuesta);
                    this.apuesta = this.apuestaInicial;
                    reader.close();
                }else if (opcion == 3) {
                    System.out.println("Ingrese apuesta:");
                    this.apuestaInicial += reader.nextInt();
                    this.fichas-=(this.apuestaInicial-this.apuesta);
                    this.apuesta=this.apuestaInicial;
                    reader.close();
                } else {
                    System.out.println("Opcion invalida");
                }
            } while (!(opcion!=1||opcion!=2||opcion!=3));
        }
    }
    @Override
    public void Jugar(boolean apuesta, int cantidad){

    }
}
