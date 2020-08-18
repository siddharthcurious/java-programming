package com.learn.coding.datastructure.backtracking;

class DiceRoll {

    public void getDiceRoll(String rollPermute){
        if(rollPermute.length() == 6){
            System.out.println(rollPermute);
        }
        else if(rollPermute.length() > 6){
            return;
        }
        else {
            getDiceRoll(rollPermute+"1");
            getDiceRoll(rollPermute+"2");
            getDiceRoll(rollPermute+"3");
            getDiceRoll(rollPermute+"4");
            getDiceRoll(rollPermute+"5");
            getDiceRoll(rollPermute+"6");
        }
    }

    public void getDiceRollWithLoop(String rollPermute){
        if(rollPermute.length() == 6){
            System.out.println(rollPermute);
        }
        else if(rollPermute.length() > 6){
            return;
        }
        else {
            for(int i=1; i<=6; i++)
            getDiceRollWithLoop(rollPermute+i);
        }
    }
}

public class DiceRollsMain {
    public static void main(String[] args) {

        DiceRoll diceRoll = new DiceRoll();
        // diceRoll.getDiceRoll("");
        diceRoll.getDiceRollWithLoop("");

    }
}
