package com.company;

public class Cake {

    private int serveringer;
    private final double ORIGINAL_SERVERINGER = 4;


    private double smørVægt = 250;
    private double smørEnergi = 30000;

    private double chokoladeVægt = 150;
    private double chokoladeEnergi = 15600;

    private double ægVægt = 240;
    private double ægEnergi = 5760;

    private double sukkerVægt = 250;
    private double sukkerEnergi = 17000;

    private double melVægt = 150;
    private double melEnergi = 9000;

    private double kakaopulverVægt = 21;
    private double kakaopulverEnergi = 1428;

    private double nøddekernerVægt = 200;
    private double nøddekernerEnergi = 24000;

    public Cake (int serveringer){
        this.serveringer = serveringer;

    }

    public void setServeringer(){
        this.serveringer = serveringer;
    }

    public int getServeringer(){
        return serveringer;
    }

    @Override
    public String toString() {
        double omregningsfaktor = serveringer / ORIGINAL_SERVERINGER;
        return "Brownies\n" +
                "serveringer = " + serveringer +
                "\nsmørVægt = " + smørVægt * omregningsfaktor + " gram" +
                ", smørEnergi = " + smørEnergi * omregningsfaktor + " KJ" +
                "\nchokoladeVægt = " + chokoladeVægt * omregningsfaktor + " gram" +
                ", chokoladeEnergi = " + chokoladeEnergi * omregningsfaktor + " KJ" +
                "\nægVægt = " + ægVægt * omregningsfaktor + " gram" +
                ", ægEnergi = " + ægEnergi * omregningsfaktor + " KJ" +
                "\nsukkerVægt = " + sukkerVægt * omregningsfaktor + " gram" +
                ", sukkerEnergi = " + sukkerEnergi * omregningsfaktor + " KJ" +
                "\nmelVægt = " + melVægt * omregningsfaktor + " gram" +
                ", melEnergi = " + melEnergi * omregningsfaktor + " KJ" +
                "\nkakaopulverVægt = " + kakaopulverVægt * omregningsfaktor + " gram" +
                ", kakaopulverEnergi = " + kakaopulverEnergi * omregningsfaktor + " KJ" +
                "\nnøddekernerVægt = " + nøddekernerVægt * omregningsfaktor + " gram" +
                ", nøddekernerEnergi = " + nøddekernerEnergi * omregningsfaktor + " KJ" ;
    }


    public double totalIngredienserVægt(){
        double omregningsfaktor = serveringer / ORIGINAL_SERVERINGER;
    double resultat = smørVægt + chokoladeVægt + ægVægt + sukkerVægt + melVægt + kakaopulverVægt + nøddekernerVægt;
    resultat = omregningsfaktor * resultat;

    return resultat;
    }

    public double totalFærdigKageVægt(){

        double resultat = totalIngredienserVægt() * 0.9;
        return resultat;
    }

    public double totalKageEnergi(){
        double omregningsfaktor = serveringer / ORIGINAL_SERVERINGER;
    double resultat = smørEnergi + chokoladeEnergi + ægEnergi + sukkerEnergi + melEnergi + kakaopulverEnergi +
    nøddekernerEnergi;
    resultat = resultat * omregningsfaktor;

    return resultat;
    }
}
