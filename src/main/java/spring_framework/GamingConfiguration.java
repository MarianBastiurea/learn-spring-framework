package spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_framework.game.GameRunner;
import spring_framework.game.GamingConsole;
import spring_framework.game.PacmanGame;


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

