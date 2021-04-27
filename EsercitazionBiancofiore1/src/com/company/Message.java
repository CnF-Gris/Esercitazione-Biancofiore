package com.company;

public class Message {

    //Attributi
    String Body;
    boolean Encoded;
    int Key;

    //Costruttore
    Message(String Body, boolean Encoded, int Key){
        this.Body = Body;
        this.Encoded = Encoded;
        this.Key = Key;
    }

    Message(){ };

    public String getBody(){
        return this.Body;
    }

    public boolean getEncoded(){
        return this.Encoded;
    }

    public int getKey(){
        return this.Key;
    }

    public void setBody(String Body){
        this.Body = Body;
    }

    public void setEncoded(boolean Encoded){
        this.Encoded = Encoded;
    }

    public void setKey(int Key){
        this.Key = Key;
    }

    public void printBody(){
        if (Encoded == false){
            System.out.println(this.Body);
        }
        else{
            System.out.println("Il file è bloccato");
        }
    }
}
