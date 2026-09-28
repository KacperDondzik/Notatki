package com.example.notatki;

public class Notatka {
    private String tytul;
    private String tresc;

    public Notatka(String tytul, String tresc) {
        this.tytul = tytul;
        this.tresc = tresc;
    }

    public String getTytul() { return tytul; }
    public String getTresc() { return tresc; }
}