package com.company;

public class Person {
    private String navn;
    private int alder;

    public Person (String navn, int alder){
    this.navn = navn;
    this.alder = alder;
    }

    public String toString() {
    return "[Navn: " + navn + "]\n[Alder: " + alder + "]";
    }
    public void hasBirthday() {
        alder ++;
    }


}
