package com.company;

public class WrongKeyException extends Exception{
    public WrongKeyException(){
        System.out.println("La chiave è sbagliata");
    }

}
