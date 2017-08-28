package com.tiy;

public class Game {
    //GenericPlayer 1
    private Player player1;

    //GenericPlayer 2
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        System.out.println("Creating a new game between " + player1.getName() + " and " + player2.getName() + ".");
    }

    //Play
    public void play(){
        //Create a die.
        Die sixSidedDie = new Die(6);

        //How do we take turns?
        //Game event loop.
        while(player1.getHealthPoints() > 0 && player2.getHealthPoints() > 0){
            //Get the damage player 1 will deal to player 2.
            Integer damageDealt = sixSidedDie.roll();
            //Print out the fact that GenericPlayer 1 is dealing that damage to player 2.
            System.out.println(player1.getName() + " has caused " + player2.getName() + " " + damageDealt + " points of damage.");
            //Hit player 2
            player2.hit(damageDealt);

            //Get the damage player 2 will deal to player 1.
            damageDealt = sixSidedDie.roll();
            //Print out the fact that player 2 is dealing that damage to player 2.
            System.out.println(player2.getName() + " has caused " + player1.getName() + " " + damageDealt + " points of damage.");
            //Hit player 1
            player1.hit(damageDealt);
        }

        System.out.println("Game finished: ");
        System.out.println(player1.getName() + " has " + player1.getHealthPoints() + " health point.");
        System.out.println(player2.getName() + " has " + player2.getHealthPoints() + " health point.");

        if(player1.getHealthPoints() > player2.getHealthPoints()){
            System.out.println(player1.getName() + " wins.");
        } else {
            System.out.println(player2.getName() + " wins.");
        }
    }
}
