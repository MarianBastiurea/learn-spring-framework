package spring_framework;

import spring_framework.game.GameRunner;
import spring_framework.game.MarioGame;
import spring_framework.game.SuperContraGame;
import spring_framework.game.PacmanGame;

public class App01Gaming {
    public static void main(String[] args) {

        var game = new MarioGame();
       // var game = new SuperContraGame();
        //var game=new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
