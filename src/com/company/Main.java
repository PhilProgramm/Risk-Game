package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize variables
        System.out.println("Attacker! Enter Number of Units:");
        int countArmyAttack = scanner.nextInt();
        System.out.println("Now Defender! Enter Number of Units:");
        int countArmyDefend = scanner.nextInt();
        System.out.println(" ");

        Game theGame = new Game(countArmyAttack, countArmyDefend);
        theGame.play();

    }
}
