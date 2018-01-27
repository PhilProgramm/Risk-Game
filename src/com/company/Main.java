package com.company;
import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;


class Game{
    private int _noOfAtt;
    private int _noOfDef;

    public Game(int noOfAtt, int noOfDef){
        _noOfAtt = noOfAtt;
        _noOfDef = noOfDef;
    }
    public int[] play(){
        // attacker
        Integer[] arrayDiceAttack = {-1, -1, -1};
        for (int i = 0 ; i<=_noOfAtt; i++) {
            arrayDiceAttack[i] = dice();
        }
        Arrays.sort(arrayDiceAttack, Collections.reverseOrder());
        System.out.print("Dice Attacker ");
        for (int i = 0 ; i<=_noOfAtt; i++) {
            System.out.println(" "+arrayDiceAttack[i]);
        }
        //defender
        Integer[] arrayDiceDefend = {-1, -1};
        for (int i = 0 ; i<=_noOfDef; i++) {
            arrayDiceDefend[i] = dice();
        }
        Arrays.sort(arrayDiceDefend, Collections.reverseOrder());
        System.out.print("Dice Defender ");
        for (int i = 0 ; i<=_noOfDef; i++) {
            System.out.println(" "+arrayDiceDefend[i]);
        }

        // compare the values and subtract from army count
        int[] relCount = {0, 0};
        if (arrayDiceAttack[0] <= arrayDiceDefend[0]) {
            relCount[0] -= 1;
        } else {
            relCount[1] -= 1;
        }
        if (_noOfAtt<2 && _noOfDef<2) return relCount;

        if (arrayDiceAttack[1] <= arrayDiceDefend[0]) {
            relCount[0] -= 1;
        } else {
            relCount[1] -= 1;
        }
        return relCount;
    }

    private static int dice() {
        return (int) (Math.random() * 6 ) + 1;
    }
}

public class Main {

    public void play(int countArmyAttack, int countArmyDefend, int noOfAtt, int noOfDef)
    {
        System.out.println("Run " + i);
        Game theGAme = new Game(3,2);
        int[] result = theGAme.play();
        // attacker
        countArmyAttack += result[0];
        countArmyDefend += result[1];

        System.out.println("Army Attacker " + " " + countArmyAttack);
        System.out.println("Army Defender " + " " + countArmyDefend);
        System.out.println(" ");

    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize variables
        System.out.println("Attacker! Enter Number of Units:");
        int countArmyAttack = scanner.nextInt();
        System.out.println("Now Defender! Enter Number of Units:");
        int countArmyDefend = scanner.nextInt();
        System.out.println(" ");

        // for loop: keep looping until either the attacker has only one unit left or
        // defender has 0 units left
        for (int i = 1; !(countArmyAttack == 1) || !(countArmyDefend == 0); i++) {
            // case: attacker > 3 units left && defender > 1 units left (Dice: Attack 3,
            // Defend 2)
            if (countArmyAttack > 3 && countArmyDefend > 1) {
                play(countArmyAttack, countArmyDefend);
                continue;
            }

            // case: attacker > 2 units left && defender > 1 units left (Dice: Attack 2,
            // Defend 2)
            else if (countArmyAttack == 3 && countArmyDefend > 1) {
                System.out.println("Run " + i);
                Game theGAme = new Game(2,2);
                int[] result = theGAme.play();
                // attacker
                countArmyAttack += result[0];
                countArmyDefend += result[1];

                System.out.println("Army Attacker " + " " + countArmyAttack);
                System.out.println("Army Defender " + " " + countArmyDefend);
                System.out.println(" ");

                continue;
            }

            // case: attacker > 1 units left && defender > 1 units left (Dice: Attack 1,
            // Defend 2)
            else if (countArmyAttack == 2 && countArmyDefend > 1) {

                // attacker
                System.out.println("Run " + i);
                Game theGAme = new Game(1,2);
                int[] result = theGAme.play();
                // attacker
                countArmyAttack += result[0];
                countArmyDefend += result[1];

                System.out.println("Army Attacker " + " " + countArmyAttack);
                System.out.println("Army Defender " + " " + countArmyDefend);
                System.out.println(" ");
                continue;
            }

            // case: attacker > 3 units left && defender == 1 units left (Dice: Attack 3,
            // Defend 1)

            else if (countArmyAttack > 3 && countArmyDefend == 1) {

                // attacker
                System.out.println("Run " + i);
                Game theGAme = new Game(3,1);
                int[] result = theGAme.play();
                // attacker
                countArmyAttack += result[0];
                countArmyDefend += result[1];

                System.out.println("Army Attacker " + " " + countArmyAttack);
                System.out.println("Army Defender " + " " + countArmyDefend);
                System.out.println(" ");
                continue;            }

            // case: attacker > 2 units left && defender == 1 units left (Dice: Attack 2,
            // Defend 1)

            else if (countArmyAttack == 3 && countArmyDefend == 1) {

                // attacker
                System.out.println("Run " + i);
                Game theGAme = new Game(2,1);
                int[] result = theGAme.play();
                // attacker
                countArmyAttack += result[0];
                countArmyDefend += result[1];

                System.out.println("Army Attacker " + " " + countArmyAttack);
                System.out.println("Army Defender " + " " + countArmyDefend);
                System.out.println(" ");
                continue;            }

        }

            // case: attacker > 1 units left && defender == 1 units left (Dice: Attack 1,
            // Defend 1)

            else if (countArmyAttack == 2 && countArmyDefend == 1) {
                // attacker
                Integer[] arrayDiceAttack = { diceAttack1.rollDice() };

                int attack1 = arrayDiceAttack[0];

                // defender
                Integer[] arrayDiceDefend = { diceDefend1.rollDice() };

                int defend1 = arrayDiceDefend[0];

                // compare the values and subtract from army count
                if (attack1 <= defend1) {
                    countArmyAttack -= 1;
                } else {
                    countArmyDefend -= 1;
                }
                System.out.println("Run " + i);
                System.out.println("Dice Attacker " + attack1);
                System.out.println("Dice Defender " + defend1);
                System.out.println("Army Attacker " + " " + countArmyAttack);
                System.out.println("Army Defender " + " " + countArmyDefend);
                System.out.println(" ");
                continue;
            }
            if (i == 100) {
                break;
            }
        }

        //----------------------------------------------------------------
        // End condition: if Attacker has one unit left, he loses. If defender has 0
        // units, he loses.

        if (countArmyDefend >=1) {
            System.out.println("Army Attack = " + countArmyAttack + " units.");
            System.out.println("Army Defend = " + countArmyDefend + " units.");
            System.out.println("Attacker loses.");
        }

        else if (countArmyDefend == 0) {
            System.out.println("Army Attack = " + countArmyAttack + " units.");
            System.out.println("Army Defend = " + countArmyDefend + " units.");
            System.out.println("Defender loses.");

        }
    }
}
