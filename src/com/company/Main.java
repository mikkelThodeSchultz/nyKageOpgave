package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Hvor mange vil du lave brownies til? \nIndtast antal her: ");
        int number = scanner.nextInt();
        Cake cake = new Cake(number);

        System.out.println("\n" + cake);

        System.out.println("\ntotal vægt for ingredienser = " + cake.totalIngredienserVægt() + " gram");
        System.out.println("total vægt for den færdige kage = " + cake.totalFærdigKageVægt() + " gram");
        System.out.println("total energiindhold for den færdige kage = " + cake.totalKageEnergi() + " KJ");

    }
}
