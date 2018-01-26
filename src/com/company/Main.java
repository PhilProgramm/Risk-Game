package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Dice {
    // create method for rolling dice (1-6)
    public Integer rollDice() {

        double randomNumber = Math.random();
        randomNumber *= 6;
        randomNumber += 1;
        int randomInt = (int) randomNumber;
        return randomInt;
    }
}


public class Main {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        // initialize variables
        System.out.println("Attacker! Enter Number of Units:");
        int countArmyAttack = scanner.nextInt();
        System.out.println("Now Defender! Enter Number of Units:");
        int countArmyDefend = scanner.nextInt();
        System.out.println(" ");

        // create Dices for Attack and Defend
        Dice diceAttack1 = new Dice();
        Dice diceAttack2 = new Dice();
        Dice diceAttack3 = new Dice();

        Dice diceDefend1 = new Dice();
        Dice diceDefend2 = new Dice();
        // ------------------------------------------------------------------------------------------------------

        // for loop: keep looping until either the attacker has only one unit left or
        // defender has 0 units left


        for (int i = 1; !(countArmyAttack == 1) || !(countArmyDefend == 0); i++) {

            // case: attacker > 3 units left && defender > 1 units left (Dice: Attack 3,
            // Defend 2)
            if (countArmyAttack > 3 && countArmyDefend > 1) {

                // attacker
                Integer[] arrayDiceAttack = { diceAttack1.rollDice(), diceAttack2.rollDice(), diceAttack3.rollDice() };
                Arrays.sort(arrayDiceAttack, Collections.reverseOrder());

                int attack1 = arrayDiceAttack[0];
                int attack2 = arrayDiceAttack[1];
                int attack3 = arrayDiceAttack[2];

                // defender
                Integer[] arrayDiceDefend = { diceDefend1.rollDice(), diceDefend2.rollDice() };
                Arrays.sort(arrayDiceDefend, Collections.reverseOrder());

                int defend1 = arrayDiceDefend[0];
                int defend2 = arrayDiceDefend[1];

                // compare the values and subtract from army count
                if (attack1 <= defend1) {
                    countArmyAttack -= 1;
                } else {
                    countArmyDefend -= 1;
                }
                if (attack2 <= defend2) {
                    countArmyAttack -= 1;
                } else {
                    countArmyDefend -= 1;
                }
                System.out.println("Run " + i);
                System.out.println("Dice Attacker " + attack1 + " " + attack2 + " " + attack3);
                System.out.println("Dice Defender " + defend1 + " " + defend2);
                System.out.println("Army Attacker " + " " + countArmyAttack);
                System.out.println("Army Defender " + " " + countArmyDefend);
                System.out.println(" ");
                continue;
            }

            // case: attacker > 2 units left && defender > 1 units left (Dice: Attack 2,
            // Defend 2)
            else if (countArmyAttack == 3 && countArmyDefend > 1) {

                // attacker
                Integer[] arrayDiceAttack = { diceAttack1.rollDice(), diceAttack2.rollDice() };
                Arrays.sort(arrayDiceAttack, Collections.reverseOrder());

                int attack1 = arrayDiceAttack[0];
                int attack2 = arrayDiceAttack[1];

                // defender
                Integer[] arrayDiceDefend = { diceDefend1.rollDice(), diceDefend2.rollDice() };
                Arrays.sort(arrayDiceDefend, Collections.reverseOrder());

                int defend1 = arrayDiceDefend[0];
                int defend2 = arrayDiceDefend[1];

                // compare the values and subtract from army count
                if (attack1 <= defend1) {
                    countArmyAttack -= 1;
                } else {
                    countArmyDefend -= 1;
                }
                if (attack2 <= defend2) {
                    countArmyAttack -= 1;
                } else {
                    countArmyDefend -= 1;
                }
                System.out.println("Run " + i);
                System.out.println("Dice Attacker " + attack1 + " " + attack2);
                System.out.println("Dice Defender " + defend1 + " " + defend2);
                System.out.println("Army Attacker " + " " + countArmyAttack);
                System.out.println("Army Defender " + " " + countArmyDefend);
                System.out.println(" ");
                continue;
            }

            // case: attacker > 1 units left && defender > 1 units left (Dice: Attack 1,
            // Defend 2)
            else if (countArmyAttack == 2 && countArmyDefend > 1) {

                // attacker
                Integer[] arrayDiceAttack = { diceAttack1.rollDice() };

                int attack1 = arrayDiceAttack[0];

                // defender
                Integer[] arrayDiceDefend = { diceDefend1.rollDice(), diceDefend2.rollDice() };
                Arrays.sort(arrayDiceDefend, Collections.reverseOrder());

                int defend1 = arrayDiceDefend[0];
                int defend2 = arrayDiceDefend[1];

                // compare the values and subtract from army count
                if (attack1 <= defend1) {
                    countArmyAttack -= 1;
                } else {
                    countArmyDefend -= 1;
                }
                System.out.println("Run " + i);
                System.out.println("Dice Attacker " + attack1);
                System.out.println("Dice Defender " + defend1 + " " + defend2);
                System.out.println("Army Attacker " + " " + countArmyAttack);
                System.out.println("Army Defender " + " " + countArmyDefend);
                System.out.println(" ");
                continue;

            }

            // case: attacker > 3 units left && defender == 1 units left (Dice: Attack 3,
            // Defend 1)

            else if (countArmyAttack > 3 && countArmyDefend == 1) {

                // attacker
                Integer[] arrayDiceAttack = { diceAttack1.rollDice(), diceAttack2.rollDice(), diceAttack3.rollDice() };
                Arrays.sort(arrayDiceAttack, Collections.reverseOrder());

                int attack1 = arrayDiceAttack[0];
                int attack2 = arrayDiceAttack[1];
                int attack3 = arrayDiceAttack[2];

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
                System.out.println("Dice Attacker " + attack1 + " " + attack2 + " " + attack3);
                System.out.println("Dice Defender " + defend1);
                System.out.println("Army Attacker " + " " + countArmyAttack);
                System.out.println("Army Defender " + " " + countArmyDefend);
                System.out.println(" ");
                continue;
            }

            // case: attacker > 2 units left && defender == 1 units left (Dice: Attack 2,
            // Defend 1)

            else if (countArmyAttack == 3 && countArmyDefend == 1) {
                // attacker
                Integer[] arrayDiceAttack = { diceAttack1.rollDice(), diceAttack2.rollDice() };
                Arrays.sort(arrayDiceAttack, Collections.reverseOrder());

                int attack1 = arrayDiceAttack[0];
                int attack2 = arrayDiceAttack[1];

                // defender
                Integer[] arrayDiceDefend = { diceDefend1.rollDice() };

                int defend1 = arrayDiceDefend[0];

                // compare the values and subtract from army count
                if (attack1 <= defend1) {
                    countArmyAttack -= 1;
                } else {
                    countArmyDefend -= 1;
                }
                // commeent added
                System.out.println("Run " + i);
                System.out.println("Dice Attacker " + attack1 + " " + attack2);
                System.out.println("Dice Defender " + defend1);
                System.out.println("Army Attacker " + " " + countArmyAttack);
                System.out.println("Army Defender " + " " + countArmyDefend);
                System.out.println(" ");
                continue;
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
