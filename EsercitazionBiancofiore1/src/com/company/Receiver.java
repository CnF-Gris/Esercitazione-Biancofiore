package com.company;

import java.util.Scanner;

public class Receiver extends SecurityTools {

    //Attributi
    static String Action = "Receiving";
    static Scanner lettore = new Scanner(System.in);
    //Costruttore

    Receiver() {
    }

    Receiver(String nameAlgorithm, int Publickey) {
        super(nameAlgorithm, Publickey);
    }

    public String getAction() {
        return this.Action;
    }

    public void setAction(String Action) {
        this.Action = Action;
    }

    public Message Decode(Message messaggioRicevuto) throws WrongKeyException {
        Message messaggio = new Message();
        messaggio.setBody(messaggioRicevuto.getBody());
        messaggio.setKey(messaggioRicevuto.Key);
        messaggio.setEncoded(messaggioRicevuto.getEncoded());

        if ((this.PrivateKey + messaggio.getKey()) == 10){
            messaggio.setEncoded(false);
        }
        else {
            throw new WrongKeyException();
        }

            return messaggio;
    }


}
