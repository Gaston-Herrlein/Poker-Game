package com.ObserverPatron;

public interface Observable {
    /*
        Pass = pasar => Pasa sin apostar/Se retira
        Bet = apostar => Igualar
        Raise = aumentar => Aumenta
    */
    public void Pass ();
    public void Bet (Integer token);
    public void Raise (Integer token);
    public void Notify ();
}
