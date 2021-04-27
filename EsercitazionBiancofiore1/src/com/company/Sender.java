package com.company;


import java.util.Scanner;

public class Sender extends SecurityTools{

    //Attributi
    static String Action = "Sending";
    static Scanner lettore = new Scanner(System.in);
    //Costruttore

    Sender(){ }

    Sender(String nameAlgorithm, int Publickey){
        super(nameAlgorithm,Publickey);
    }

    public String getAction(){
        return this.Action;
    }

    public void setAction(String Action){
        this.Action = Action;
    }

    public Message Encode(int PublicKeyR){
        System.out.println("Prego, inserire il corpo del messaggio");
        Message messaggio1 = new Message();
        messaggio1.setBody(lettore.nextLine());
        messaggio1.Key = PublicKeyR;
        messaggio1.Encoded = true;
        return messaggio1;
    }

    public Message Encode(Message messaggio,int PublicKeyR){
        messaggio.setEncoded(true);
        return messaggio;
    }

}
