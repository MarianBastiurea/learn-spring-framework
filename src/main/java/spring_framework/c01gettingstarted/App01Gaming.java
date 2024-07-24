package spring_framework.c01gettingstarted;

import spring_framework.c01gettingstarted.game.GameRunner;
import spring_framework.c01gettingstarted.game.MarioGame;
import spring_framework.c01gettingstarted.game.SuperContraGame;
import spring_framework.c01gettingstarted.game.PacmanGame;

public class App01Gaming {
    public static void main(String[] args) {

        var game = new MarioGame();
       // var game = new SuperContraGame();
        //var game=new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
