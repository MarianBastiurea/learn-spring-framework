package com.marianbastiurea.learnspringframework.c01gettingstarted;

import com.marianbastiurea.learnspringframework.c01gettingstarted.game.GameRunner;
import com.marianbastiurea.learnspringframework.c01gettingstarted.game.MarioGame;

public class App01Gaming {
    public static void main(String[] args) {

        var game = new MarioGame();
       // var game = new SuperContraGame();
        //var game=new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
