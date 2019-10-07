package teach03;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Player p1 = new Player();
        Game game1 = new Game(p1);

        System.out.println(p1.name);
        System.out.println(p1.health);
        System.out.println(p1.mana);
        System.out.println(p1.gold);

        game1.saveGame();
        Game game2 = new Game(game1.loadGame("SavedGame.txt").getP());

        System.out.println("Your player's name is: "+game2.getP().name);
        System.out.println("Your player's health is: "+game2.getP().health);
        System.out.println("Your player's mana is: "+game2.getP().mana);
        System.out.println("Your player's gold is: "+game2.getP().gold);
    }
}