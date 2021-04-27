package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Creo Bob
        Sender Bob = new Sender();
        Bob.setPrivateKey(2);

        //Creo Alice
        Receiver Alice = new Receiver();
        Alice.setPublicKey(6);

        //Creo John
        Receiver John = new Receiver();
        John.setPublicKey(1);

        //Codifico con la chiave di Alice
        Message MessaggioBob = Bob.Encode(Alice.getPublicKey());

        //Provo la decodifica
        try {
            MessaggioBob = Alice.Decode(MessaggioBob);
        } catch (WrongKeyException e) {

        }

        //Se il messaggio è stampabile verrà stampato
        MessaggioBob.printBody();

        //Lo ricodifico con Alice
        MessaggioBob = Bob.Encode(MessaggioBob,Alice.getPublicKey());

        //Provo a stamparlo (non deve riuscire a stampa)
        MessaggioBob.printBody();

        //Faccio decodificare a John
        try {
            MessaggioBob = John.Decode(MessaggioBob);
        } catch (WrongKeyException e) {

        }

    }
}
