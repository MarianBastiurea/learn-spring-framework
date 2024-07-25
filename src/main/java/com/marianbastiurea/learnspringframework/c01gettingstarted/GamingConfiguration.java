package com.marianbastiurea.learnspringframework.c01gettingstarted;

import com.marianbastiurea.learnspringframework.c02createjavaobjects.GameRunner;
import com.marianbastiurea.learnspringframework.c02createjavaobjects.GamingConsole;
import com.marianbastiurea.learnspringframework.c02createjavaobjects.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
