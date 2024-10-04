package com.example;

public class Persona extends Thread{
    private Cestino cestino;
    private int contatore ;

    public Persona (Cestino cestino,int c){
        this.cestino = cestino;
        this.contatore = c;
    }

    public void run(){
        for(int i = 0; i < this.contatore; i++){
            this.cestino.addMoneta(1);
        }
    }
}
