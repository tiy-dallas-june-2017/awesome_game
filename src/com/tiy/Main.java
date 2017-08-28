package com.tiy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player nikki = new GenericPlayer("Nikki", 100);
        Player eric = new NerdPlayer("Eric", 100);

        Game game = new Game(nikki, eric);
        game.play();
    }
}
