package com.example;

public class Cestino {
    private int num;

    public Cestino (int cont){
        this.num = cont;
    }

    public int getMonete(){
        return this.num;
    }

    public void addMoneta(int n){
        this.num += n;
    }
}
