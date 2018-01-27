package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


class Game {
    private int countArmyAttack;
    private int countArmyDefend;
    public Game(int theCountArmyAttack, int theCountArmyDefend){
        countArmyAttack = theCountArmyAttack;
        countArmyDefend = theCountArmyDefend;
    }

    public void turn(int noOfAtt, int noOfDef)
    {
        Turn theTurn = new Turn(noOfAtt,noOfDef);
        int[] result = theTurn.play();
        // attacker
        countArmyAttack += result[0];
        countArmyDefend += result[1];

        System.out.println("Army Attacker " + " " + countArmyAttack);
        System.out.println("Army Defender " + " " + countArmyDefend);
        System.out.println(" ");

    };

    public void play() {
        // for loop: keep looping until either the attacker has only one unit left or
        // defender has 0 units left
        for (int i = 1; !(countArmyAttack == 1) || !(countArmyDefend == 0); i++) {
            // case: attacker > 3 units left && defender > 1 units left (Dice: Attack 3,
            // Defend 2)
            if (countArmyAttack > 3 && countArmyDefend > 1) {
                System.out.println("Run " + i);
                turn(3, 2);
                continue;
            }

            // case: attacker > 2 units left && defender > 1 units left (Dice: Attack 2,
            // Defend 2)
            else if (countArmyAttack == 3 && countArmyDefend > 1) {
                System.out.println("Run " + i);
                turn(2, 2);
                continue;
            }

            // case: attacker > 1 units left && defender > 1 units left (Dice: Attack 1,
            // Defend 2)
            else if (countArmyAttack == 2 && countArmyDefend > 1) {

                System.out.println("Run " + i);
                turn(1, 2);
                continue;
            }

            // case: attacker > 3 units left && defender == 1 units left (Dice: Attack 3,
            // Defend 1)

            else if (countArmyAttack > 3 && countArmyDefend == 1) {

                System.out.println("Run " + i);
                turn(3, 1);
                continue;
            }

            // case: attacker > 2 units left && defender == 1 units left (Dice: Attack 2,
            // Defend 1)

            else if (countArmyAttack == 3 && countArmyDefend == 1) {

                System.out.println("Run " + i);
                turn(2, 1);
                continue;

        }

        // case: attacker > 1 units left && defender == 1 units left (Dice: Attack 1,
        // Defend 1)

            else if (countArmyAttack == 2 && countArmyDefend == 1) {

                System.out.println("Run " + i);
                turn( 1, 1);
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
