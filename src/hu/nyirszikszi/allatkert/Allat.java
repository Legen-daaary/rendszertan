package hu.nyirszikszi.allatkert;

public abstract class Allat {
    private String nev; //latin
    private double suly;
    private String szin;
    private Taplalek taplalek;
    private int labakSzama;

    public abstract void taplalkozik();

    public abstract void makeSound();

    public abstract Allat szaporodik();

}
