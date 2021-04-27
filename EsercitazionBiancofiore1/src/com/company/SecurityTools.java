package com.company;

public class SecurityTools {

    //Attributi
    private String nameAlgorithm;
    protected int PrivateKey;
    public int PublicKey;

    //Costruttore
    SecurityTools(String nameAlgorithm, int PublicKey) {
        this.nameAlgorithm = nameAlgorithm;
        this.PublicKey = PublicKey;
        this.PrivateKey = 10 - PublicKey;
    }

    SecurityTools(){ }

    public String getNameAlgorithm() {
        return this.nameAlgorithm;
    }

    public int getPrivateKey() {
        return this.PrivateKey;
    }

    public int getPublicKey() {
        return this.PublicKey;
    }

    public void setNameAlgorithm(String nameAlgorithm) {
        this.nameAlgorithm = nameAlgorithm;
    }

    public void setPrivateKey(int PrivateKey) {
        this.PrivateKey = PrivateKey;
        this.PublicKey = 10 - PrivateKey;
    }

    public void setPublicKey(int PublicKey) {
        this.PublicKey = PublicKey;
        this.PrivateKey = 10 - PublicKey;
    }

}
