package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


class Turn {
    private int _noOfAtt;
    private int _noOfDef;

    public Turn (int noOfAtt, int noOfDef){
        _noOfAtt = noOfAtt;
        _noOfDef = noOfDef;
    }
    public int[] play(){
        // attacker
        Integer[] arrayDiceAttack = {-1, -1, -1};
        for (int i = 0 ; i<_noOfAtt; i++) {
            arrayDiceAttack[i] = dice();
        }
        Arrays.sort(arrayDiceAttack, Collections.reverseOrder());
        System.out.print("Dice Attacker ");
        for (int i = 0 ; i<_noOfAtt; i++) {
            System.out.print(" "+arrayDiceAttack[i]);
        }
        System.out.println();
        //defender
        Integer[] arrayDiceDefend = {-1, -1};
        for (int i = 0 ; i<_noOfDef; i++) {
            arrayDiceDefend[i] = dice();
        }
        Arrays.sort(arrayDiceDefend, Collections.reverseOrder());
        System.out.print("Dice Defender ");
        for (int i = 0 ; i<_noOfDef; i++) {
            System.out.print(" "+arrayDiceDefend[i]);
        }
        System.out.println();

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
