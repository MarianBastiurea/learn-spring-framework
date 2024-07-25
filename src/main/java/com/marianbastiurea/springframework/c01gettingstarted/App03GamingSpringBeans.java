package com.marianbastiurea.springframework.c01gettingstarted;

import com.marianbastiurea.springframework.c01gettingstarted.game.GameRunner;
import com.marianbastiurea.springframework.c01gettingstarted.game.GamingConsole;
import com.marianbastiurea.springframework.c02createjavaobjects.GamingConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingConfiguration.class)) {

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();

        }
    }
}

